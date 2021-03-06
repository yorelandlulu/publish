package com.kun.flow.web.control;

import com.kun.flow.bean.Pagination;
import com.kun.flow.constants.Constants;
import com.kun.flow.exception.ServiceException;
import com.kun.flow.model.News;
import com.kun.flow.model.Operater;
import com.kun.flow.model.Summary;
import com.kun.flow.service.INewsService;
import com.kun.flow.web.response.DataOut;
import com.kun.flow.web.response.MessageOut;
import com.kun.flow.web.response.Out;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xianing
 * Date: 7/17/14
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/news")
public class NewsControl extends BaseControl<News> {

    public INewsService getNewsService() {
        return (INewsService) this.getService();
    }


    /**
     * 新增
     *
     * @author songkun
     * @param news
     * @return Out
     */
    @RequestMapping("/add.do")
    @ResponseBody
    public Out<Object> add(News news) {
        try {
            Operater obj = this.getCurrentOperater();
            news.setPosttime(new Date(news.getPosttime1()));
            news.setViewcount(new Long(0));
            news.setStatus(Constants.NEWS_STATUS_NONAUDIT);
            news.setOperaterid(obj.getId());
            this.getService().save(news);
            return MessageOut.ADD_OK_MESSAGE;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageOut.ADD_FAIL_MESSAGE;
    }

    /**
     * list
     *
     * @author songkun
     * @param obj
     * @return Out
     */
    @RequestMapping("/listbycategory.do")
    @ResponseBody
    public Out<News> listByCategory(Pagination pagination, News obj) {
        try {
            List<News> list = this.getNewsService().listbycid(obj, pagination);
            if (list == null || list.size() < pagination.getPageSize()) {
                pagination.setTotalRows((pagination.getPageNumber()==0?0:pagination.getPageNumber() - 1) * pagination.getPageSize() + (list == null ? 0 : list.size()));
            } else {
                pagination.setTotalRows(this.getService().loadAll().size());
            }
            return new DataOut<News>(this.getNewsService().listbycid(obj,pagination), pagination);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * list
     *
     * @author songkun
     * @param keyword
     * @return Out
     */
    @RequestMapping("/search.do")
    @ResponseBody
    public Out<News> search(Pagination pagination, String keyword) {
        try {
            News o = new News();
            o.setTitle(keyword);
            List<News> list = this.getNewsService().search(o, pagination);
            if (list == null || list.size() < pagination.getPageSize()) {
                pagination.setTotalRows((pagination.getPageNumber()==0?0:pagination.getPageNumber() - 1) * pagination.getPageSize() + (list == null ? 0 : list.size()));
            } else {
                pagination.setTotalRows(this.getService().loadAll().size());
            }
            return new DataOut<News>(this.getNewsService().search(o, pagination), pagination);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/getsummary.do")
    @ResponseBody
    public List<Summary> getsummary() {
        try {
            List<News> list = this.getNewsService().getSummary();
            List<Summary> result = new ArrayList<Summary>();
            for(News news : list){
                Summary sum = new Summary();
                sum.setUsername(news.getAuthor());
                sum.setCount(""+news.getSort());
                sum.setUserid(news.getOperaterid());
                sum.setDepart(news.getSubtitle());
                result.add(sum);
            }
            return result;
        } catch (ServiceException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * getone
     *
     * @author songkun
     * @param nid
     * @return Out
     */
    @RequestMapping("/view.do")
    @ResponseBody
    public News view(Pagination pagination, Long nid) {
        try {
            News n = this.getService().getByKey(nid);
            n.setViewcount(n.getViewcount()+1);
            this.getService().update(n);
            return n;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * modify
     *
     * @author songkun
     * @param news
     * @return Out
     */
    @RequestMapping("/modify.do")
    @ResponseBody
    public Out<Object> modify(News news) {
        try {
            Long nid = news.getId();
            News cur = this.getService().getByKey(nid);
            cur.setTitle(news.getTitle());
            cur.setSubtitle(news.getSubtitle());
            cur.setSort(news.getSort());
            cur.setAdminaudit(news.getAdminaudit());
            cur.setAuthor(news.getAuthor());
            cur.setPosttime(new Date(news.getPosttime1()));
            cur.setCategoryid(news.getCategoryid());
            cur.setContent(news.getContent());
            cur.setEditname(news.getEditname());
            cur.setAuditname(news.getAuditname());
            Operater obj = this.getCurrentOperater();
            if(obj.getType()!=null&&obj.getType()==1){
                cur.setStatus(Constants.NEWS_STATUS_EDITED);
            }
            else if(news.getCategoryid()!=null&&news.getCategoryid()>0&&obj.getType()!=null&&obj.getType()==0){
                if(news.getTempaudit()==0)
                    cur.setStatus(Constants.NEWS_STATUS_FAILED_AUDIT);
                else if(news.getTempaudit()==1)
                    cur.setStatus(Constants.NEWS_STATUS_ALREADY_AUDIT);
            }
            this.getService().update(cur);
            return MessageOut.ADD_OK_MESSAGE;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageOut.ADD_FAIL_MESSAGE;
    }


    /**
     * delete
     *
     * @author songkun
     * @param news
     * @return Out
     */
    @RequestMapping("/delete.do")
    @ResponseBody
    public Out<Object> delete(News news) {
        try {
            Long nid = news.getId();
            this.getService().deleteByKey(nid);
            return MessageOut.ADD_OK_MESSAGE;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageOut.ADD_FAIL_MESSAGE;
    }

}
