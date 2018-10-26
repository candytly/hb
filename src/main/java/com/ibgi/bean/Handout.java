package com.ibgi.bean;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "`handout`")
public class Handout {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.year
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Integer year;

    @Override
    public String toString() {
        return "Handout{" +
                "year=" + year +
                ", account='" + account + '\'' +
                ", usename='" + usename + '\'' +
                ", giftid='" + giftid + '\'' +
                ", giftname='" + giftname + '\'' +
                ", phone='" + phone + '\'' +
                ", openid='" + openid + '\'' +
                ", birthday='" + birthday + '\'' +
                ", status=" + status +
                ", administrator='" + administrator + '\'' +
                ", ismail=" + ismail +
                ", mailaddress='" + mailaddress + '\'' +
                ", mailstatus=" + mailstatus +
                ", addresscode='" + addresscode + '\'' +
                ", mailphone='" + mailphone + '\'' +
                ", messageboard='" + messageboard + '\'' +
                ", appointmenttime=" + appointmenttime +
                ", collecttime=" + collecttime +
                ", posttime=" + posttime +
                ", noticetime=" + noticetime +
                ", remark='" + remark + '\'' +
                ", mailcode='" + mailcode + '\'' +
                ", legalperson='" + legalperson + '\'' +
                '}';
    }

    public Handout() {
    }

    public Handout(Integer year, String account, String usename, String giftid, String giftname, String phone, String openid, String birthday, Integer status, String administrator, Integer ismail, String mailaddress, Integer mailstatus, String addresscode, String mailphone, String messageboard, Date appointmenttime, Date collecttime, Date posttime, Date noticetime, String remark, String mailcode, String legalperson) {
        this.year = year;
        this.account = account;
        this.usename = usename;
        this.giftid = giftid;
        this.giftname = giftname;
        this.phone = phone;
        this.openid = openid;
        this.birthday = birthday;
        this.status = status;
        this.administrator = administrator;
        this.ismail = ismail;
        this.mailaddress = mailaddress;
        this.mailstatus = mailstatus;
        this.addresscode = addresscode;
        this.mailphone = mailphone;
        this.messageboard = messageboard;
        this.appointmenttime = appointmenttime;
        this.collecttime = collecttime;
        this.posttime = posttime;
        this.noticetime = noticetime;
        this.remark = remark;
        this.mailcode = mailcode;
        this.legalperson = legalperson;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.account
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.usename
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String usename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.giftid
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String giftid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.giftname
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String giftname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.phone
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.openid
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.birthday
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.status
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.administrator
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String administrator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.ismail
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Integer ismail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.mailaddress
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String mailaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.mailstatus
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Integer mailstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.addresscode
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String addresscode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.mailphone
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String mailphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.messageboard
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String messageboard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.appointmenttime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Date appointmenttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.collecttime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Date collecttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.posttime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Date posttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.noticetime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Date noticetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.remark
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.mailcode
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String mailcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handout.legalperson
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String legalperson;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.year
     *
     * @return the value of handout.year
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Integer getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.year
     *
     * @param year the value for handout.year
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.account
     *
     * @return the value of handout.account
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.account
     *
     * @param account the value for handout.account
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.usename
     *
     * @return the value of handout.usename
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getUsename() {
        return usename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.usename
     *
     * @param usename the value for handout.usename
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setUsename(String usename) {
        this.usename = usename == null ? null : usename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.giftid
     *
     * @return the value of handout.giftid
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getGiftid() {
        return giftid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.giftid
     *
     * @param giftid the value for handout.giftid
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setGiftid(String giftid) {
        this.giftid = giftid == null ? null : giftid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.giftname
     *
     * @return the value of handout.giftname
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getGiftname() {
        return giftname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.giftname
     *
     * @param giftname the value for handout.giftname
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setGiftname(String giftname) {
        this.giftname = giftname == null ? null : giftname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.phone
     *
     * @return the value of handout.phone
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.phone
     *
     * @param phone the value for handout.phone
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.openid
     *
     * @return the value of handout.openid
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.openid
     *
     * @param openid the value for handout.openid
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.birthday
     *
     * @return the value of handout.birthday
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.birthday
     *
     * @param birthday the value for handout.birthday
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.status
     *
     * @return the value of handout.status
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.status
     *
     * @param status the value for handout.status
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.administrator
     *
     * @return the value of handout.administrator
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getAdministrator() {
        return administrator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.administrator
     *
     * @param administrator the value for handout.administrator
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setAdministrator(String administrator) {
        this.administrator = administrator == null ? null : administrator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.ismail
     *
     * @return the value of handout.ismail
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Integer getIsmail() {
        return ismail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.ismail
     *
     * @param ismail the value for handout.ismail
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setIsmail(Integer ismail) {
        this.ismail = ismail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.mailaddress
     *
     * @return the value of handout.mailaddress
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getMailaddress() {
        return mailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.mailaddress
     *
     * @param mailaddress the value for handout.mailaddress
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setMailaddress(String mailaddress) {
        this.mailaddress = mailaddress == null ? null : mailaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.mailstatus
     *
     * @return the value of handout.mailstatus
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Integer getMailstatus() {
        return mailstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.mailstatus
     *
     * @param mailstatus the value for handout.mailstatus
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setMailstatus(Integer mailstatus) {
        this.mailstatus = mailstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.addresscode
     *
     * @return the value of handout.addresscode
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getAddresscode() {
        return addresscode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.addresscode
     *
     * @param addresscode the value for handout.addresscode
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setAddresscode(String addresscode) {
        this.addresscode = addresscode == null ? null : addresscode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.mailphone
     *
     * @return the value of handout.mailphone
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getMailphone() {
        return mailphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.mailphone
     *
     * @param mailphone the value for handout.mailphone
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setMailphone(String mailphone) {
        this.mailphone = mailphone == null ? null : mailphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.messageboard
     *
     * @return the value of handout.messageboard
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getMessageboard() {
        return messageboard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.messageboard
     *
     * @param messageboard the value for handout.messageboard
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setMessageboard(String messageboard) {
        this.messageboard = messageboard == null ? null : messageboard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.appointmenttime
     *
     * @return the value of handout.appointmenttime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Date getAppointmenttime() {
        return appointmenttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.appointmenttime
     *
     * @param appointmenttime the value for handout.appointmenttime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setAppointmenttime(Date appointmenttime) {
        this.appointmenttime = appointmenttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.collecttime
     *
     * @return the value of handout.collecttime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Date getCollecttime() {
        return collecttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.collecttime
     *
     * @param collecttime the value for handout.collecttime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setCollecttime(Date collecttime) {
        this.collecttime = collecttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.posttime
     *
     * @return the value of handout.posttime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Date getPosttime() {
        return posttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.posttime
     *
     * @param posttime the value for handout.posttime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.noticetime
     *
     * @return the value of handout.noticetime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Date getNoticetime() {
        return noticetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.noticetime
     *
     * @param noticetime the value for handout.noticetime
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setNoticetime(Date noticetime) {
        this.noticetime = noticetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.remark
     *
     * @return the value of handout.remark
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.remark
     *
     * @param remark the value for handout.remark
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.mailcode
     *
     * @return the value of handout.mailcode
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getMailcode() {
        return mailcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.mailcode
     *
     * @param mailcode the value for handout.mailcode
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setMailcode(String mailcode) {
        this.mailcode = mailcode == null ? null : mailcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handout.legalperson
     *
     * @return the value of handout.legalperson
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getLegalperson() {
        return legalperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handout.legalperson
     *
     * @param legalperson the value for handout.legalperson
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson == null ? null : legalperson.trim();
    }
}