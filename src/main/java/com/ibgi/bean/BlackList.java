package com.ibgi.bean;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "`blacklist`")
public class BlackList {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blacklist.id
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blacklist.account
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blacklist.name
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blacklist.comment
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blacklist.createTime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blacklist.id
     *
     * @return the value of blacklist.id
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blacklist.id
     *
     * @param id the value for blacklist.id
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blacklist.account
     *
     * @return the value of blacklist.account
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blacklist.account
     *
     * @param account the value for blacklist.account
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blacklist.name
     *
     * @return the value of blacklist.name
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blacklist.name
     *
     * @param name the value for blacklist.name
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blacklist.comment
     *
     * @return the value of blacklist.comment
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blacklist.comment
     *
     * @param comment the value for blacklist.comment
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blacklist.createTime
     *
     * @return the value of blacklist.createTime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blacklist.createTime
     *
     * @param createtime the value for blacklist.createTime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}