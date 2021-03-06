package com.kun.flow.web.control;

import com.kun.flow.bean.Pagination;
import com.kun.flow.exception.ServiceException;
import com.kun.flow.model.News;
import com.kun.flow.model.NewsCategory;
import com.kun.flow.service.INewsCategoryService;
import com.kun.flow.service.INewsService;
import com.kun.flow.web.response.DataOut;
import com.kun.flow.web.response.MessageOut;
import com.kun.flow.web.response.Out;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xianing
 * Date: 7/17/14
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/newscategory")
public class NewsCategoryControl extends BaseControl<NewsCategory> {

    public INewsCategoryService getNewsCategoryService() {
        return (INewsCategoryService) this.getService();
    }

    private INewsService newsService;

    public INewsService getNewsService() {
        return newsService;
    }

    public void setNewsService(INewsService newsService) {
        this.newsService = newsService;
    }

    /**
     * 新增
     *
     * @author songkun
     * @param newsCategory
     * @return Out
     */
    @RequestMapping("/add.do")
    @ResponseBody
    public Out<Object> add(NewsCategory newsCategory) {
        try {
            this.getService().save(newsCategory);
            return MessageOut.ADD_OK_MESSAGE;
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageOut.ADD_FAIL_MESSAGE;
    }

    /**
     * modify
     *
     * @author songkun
     * @param newsCategory
     * @return Out
     */
    @RequestMapping("/modify.do")
    @ResponseBody
    public Out<Object> modify(NewsCategory newsCategory) {
        try {
            // TODO method modify category
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
     * @param newsCategory
     * @return Out
     */
    @RequestMapping("/delete.do")
    @ResponseBody
    public Out<Object> delete(NewsCategory newsCategory) {
        try {
            // TODO method remove category
            return MessageOut.ADD_OK_MESSAGE;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageOut.ADD_FAIL_MESSAGE;
    }

    /**
     * listRoot
     *
     * @author songkun
     * @return Out
     */
    @RequestMapping("/listRoot.do")
    @ResponseBody
    public Out<NewsCategory> list(Pagination pagination) {
        try {
            return new DataOut<NewsCategory>(this.getNewsCategoryService().listRoot(), pagination);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * listByPid
     *
     * @author songkun
     * @return Out
     */
    @RequestMapping("/listByPid.do")
    @ResponseBody
    public Out<NewsCategory> list(Pagination pagination, long pid) {
        try {
            List<NewsCategory> list = this.getNewsCategoryService().listByPid(pid);
            return new DataOut<NewsCategory>(list, pagination);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * getone
     *
     * @author songkun
     * @return Out
     */
    @RequestMapping("/view.do")
    @ResponseBody
    public NewsCategory view(Pagination pagination, Long cid) {
        try {
            return this.getService().getByKey(cid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * getfirstchild
     *
     * @author
     * @return Out
     */
    @RequestMapping("/firstchild.do")
    @ResponseBody
    public NewsCategory firstchild(Pagination pagination, Long cid) {
        try {
            NewsCategory c = this.getService().getByKey(cid);
            return this.getService().getByKey(c.getParentid());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * listTree
     *
     * @author songkun
     * @return Out
     */
    /*@RequestMapping("/listTree.do")
    @ResponseBody
    public List<CategoryTree> listAll(Pagination pagination, long cid) {
        try {
            List<CategoryTree> clist = new ArrayList<CategoryTree>();
            for(NewsCategory cc : this.getNewsCategoryService().listByPid(cid)){
                CategoryTree schild = new CategoryTree();
                schild.setViewarticle(cc.getViewarticle());
                schild.setArticleid(cc.getArticleid());
                schild.setId(""+cc.getId());
                schild.setText(cc.getName());
                List<CategoryTree> list = new ArrayList<CategoryTree>();
                for(NewsCategory c : this.getNewsCategoryService().listByPid(cc.getId())){
                    CategoryTree child = new CategoryTree();
                    child.setId(""+c.getId());
                    child.setText(c.getName());
                    child.setViewarticle(c.getViewarticle());
                    child.setArticleid(c.getArticleid());
                    list.add(child);
                    schild.setState("closed");
                }
                if (list.size()>0){
                    schild.setChildren(list);
                }
                clist.add(schild);
            }
            return clist;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    /**
     * listTree
     *
     * @author songkun
     * @return Out
     */
    /*@RequestMapping("/listTreePermission.do")
    @ResponseBody
    public List<CategoryTree> listPermission(Pagination pagination, long cid) {
        try {
            Long userid = this.getCurrentOperater().getId();
            List<CategoryTree> clist = new ArrayList<CategoryTree>();
            for(NewsCategory cc : this.getNewsCategoryService().listByPidPremission(cid,userid)){
                CategoryTree schild = new CategoryTree();
                schild.setId(""+cc.getId());
                schild.setText(cc.getName());
                List<CategoryTree> list = new ArrayList<CategoryTree>();
                for(NewsCategory c : this.getNewsCategoryService().listByPidPremission(cc.getId(),userid)){
                    CategoryTree child = new CategoryTree();
                    child.setId(""+c.getId());
                    child.setText(c.getName());
                    list.add(child);
                    schild.setState("closed");
                }
                if (list.size()>0){
                    schild.setChildren(list);
                }
                clist.add(schild);
            }
            return clist;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
