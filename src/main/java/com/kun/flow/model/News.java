package com.kun.flow.model;

import com.kun.flow.constants.Constants;
import com.kun.flow.util.JsonDateSerializer;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class News {
    public Long getViewcount() {
        return viewcount;
    }

    public void setViewcount(Long viewcount) {
        this.viewcount = viewcount;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.id
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    private Long id;
    private Long viewcount;

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    private Long sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.editname
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    private String editname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.auditname
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    private String auditname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.title
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    private String title;
    private String subtitle;

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.content
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.author
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    private String author;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.posttime
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    private Date posttime;
    private String posttime1;

    public String getPosttime1() {
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm");
        if(posttime==null && posttime1==null) posttime = new Date();
        return sdf.format(posttime);
    }

    public void setPosttime1(String posttime1)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        this.posttime1 = posttime1;
        this.posttime = new Date(posttime1);
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.categoryid
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    private Long categoryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.status
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.id
     *
     * @return the value of news.id
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.id
     *
     * @param id the value for news.id
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.editname
     *
     * @return the value of news.editname
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public String getEditname() {
        return editname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.editname
     *
     * @param editname the value for news.editname
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public void setEditname(String editname) {
        this.editname = editname == null ? null : editname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.auditname
     *
     * @return the value of news.auditname
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public String getAuditname() {
        return auditname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.auditname
     *
     * @param auditname the value for news.auditname
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public void setAuditname(String auditname) {
        this.auditname = auditname == null ? null : auditname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.title
     *
     * @return the value of news.title
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.title
     *
     * @param title the value for news.title
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.content
     *
     * @return the value of news.content
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.content
     *
     * @param content the value for news.content
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.author
     *
     * @return the value of news.author
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.author
     *
     * @param author the value for news.author
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.posttime
     *
     * @return the value of news.posttime
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    @DateTimeFormat(pattern="MM/dd/yyyy")
    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getPosttime() {
        if(posttime==null||posttime.getTime()==0)
            return new Date();
        else
            return posttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.posttime
     *
     * @param posttime the value for news.posttime
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.categoryid
     *
     * @return the value of news.categoryid
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public Long getCategoryid() {
        return categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.categoryid
     *
     * @param categoryid the value for news.categoryid
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.status
     *
     * @return the value of news.status
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public Integer getStatus() {
        return status;
    }

    public String getStatusdis(){
        switch (status){
            case 4:
                return Constants.NEWS_STATUS_NONAUDIT_DISPLAY;
            case 5:
                return Constants.NEWS_STATUS_ALREADY_AUDIT_DISPLAY;
            default:
                return null;
        }

    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.status
     *
     * @param status the value for news.status
     *
     * @mbggenerated Fri Aug 08 16:19:05 CST 2014
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}