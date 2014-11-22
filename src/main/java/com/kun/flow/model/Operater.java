package com.kun.flow.model;

import java.math.BigDecimal;
import java.util.Date;

public class Operater {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.ID
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.TYPE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private Long type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.CODE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.NAME
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.PASSWORD
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.SUPERUSER
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private Long superuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.EMAIL
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.PHONE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.CREATETIME
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.UPDATETIME
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.OPERATERID
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private BigDecimal operaterid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.OPERATERCODE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private String operatercode;
    private String depart;

    public String getDepart() {
        if(depart == null)
            return "";
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPERATER.STATUS
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    private Long status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.ID
     *
     * @return the value of OPERATER.ID
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.ID
     *
     * @param id the value for OPERATER.ID
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.TYPE
     *
     * @return the value of OPERATER.TYPE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public Long getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.TYPE
     *
     * @param type the value for OPERATER.TYPE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.CODE
     *
     * @return the value of OPERATER.CODE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.CODE
     *
     * @param code the value for OPERATER.CODE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.NAME
     *
     * @return the value of OPERATER.NAME
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.NAME
     *
     * @param name the value for OPERATER.NAME
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.PASSWORD
     *
     * @return the value of OPERATER.PASSWORD
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.PASSWORD
     *
     * @param password the value for OPERATER.PASSWORD
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.SUPERUSER
     *
     * @return the value of OPERATER.SUPERUSER
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public Long getSuperUser() {
        return superuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.SUPERUSER
     *
     * @param superuser the value for OPERATER.SUPERUSER
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setSuperUser(Long superuser) {
        this.superuser = superuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.EMAIL
     *
     * @return the value of OPERATER.EMAIL
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.EMAIL
     *
     * @param email the value for OPERATER.EMAIL
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.PHONE
     *
     * @return the value of OPERATER.PHONE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.PHONE
     *
     * @param phone the value for OPERATER.PHONE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.CREATETIME
     *
     * @return the value of OPERATER.CREATETIME
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public Date getCreateTime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.CREATETIME
     *
     * @param createtime the value for OPERATER.CREATETIME
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setCreateTime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.UPDATETIME
     *
     * @return the value of OPERATER.UPDATETIME
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.UPDATETIME
     *
     * @param updatetime the value for OPERATER.UPDATETIME
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setUpdateTime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.OPERATERID
     *
     * @return the value of OPERATER.OPERATERID
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public BigDecimal getOperaterId() {
        return operaterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.OPERATERID
     *
     * @param operaterid the value for OPERATER.OPERATERID
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setOperaterId(BigDecimal operaterid) {
        this.operaterid = operaterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.OPERATERCODE
     *
     * @return the value of OPERATER.OPERATERCODE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public String getOperaterCode() {
        return operatercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.OPERATERCODE
     *
     * @param operatercode the value for OPERATER.OPERATERCODE
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setOperaterCode(String operatercode) {
        this.operatercode = operatercode == null ? null : operatercode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPERATER.STATUS
     *
     * @return the value of OPERATER.STATUS
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPERATER.STATUS
     *
     * @param status the value for OPERATER.STATUS
     *
     * @mbggenerated Wed Oct 29 22:00:16 CST 2014
     */
    public void setStatus(Long status) {
        this.status = status;
    }
}