package com.ibgi.bean;

import javax.persistence.*;

@Table(name = "`handoutdatagridconfig`")
public class Handoutdatagridconfig {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handoutdatagridconfig.fieldvalue
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String fieldvalue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handoutdatagridconfig.width
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Integer width;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handoutdatagridconfig.align
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String align;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handoutdatagridconfig.fieldname
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String fieldname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handoutdatagridconfig.weights
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Integer weights;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handoutdatagridconfig.fieldvalue
     *
     * @return the value of handoutdatagridconfig.fieldvalue
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getFieldvalue() {
        return fieldvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handoutdatagridconfig.fieldvalue
     *
     * @param fieldvalue the value for handoutdatagridconfig.fieldvalue
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setFieldvalue(String fieldvalue) {
        this.fieldvalue = fieldvalue == null ? null : fieldvalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handoutdatagridconfig.width
     *
     * @return the value of handoutdatagridconfig.width
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handoutdatagridconfig.width
     *
     * @param width the value for handoutdatagridconfig.width
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handoutdatagridconfig.align
     *
     * @return the value of handoutdatagridconfig.align
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getAlign() {
        return align;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handoutdatagridconfig.align
     *
     * @param align the value for handoutdatagridconfig.align
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setAlign(String align) {
        this.align = align == null ? null : align.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handoutdatagridconfig.fieldname
     *
     * @return the value of handoutdatagridconfig.fieldname
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getFieldname() {
        return fieldname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handoutdatagridconfig.fieldname
     *
     * @param fieldname the value for handoutdatagridconfig.fieldname
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname == null ? null : fieldname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handoutdatagridconfig.weights
     *
     * @return the value of handoutdatagridconfig.weights
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Integer getWeights() {
        return weights;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handoutdatagridconfig.weights
     *
     * @param weights the value for handoutdatagridconfig.weights
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setWeights(Integer weights) {
        this.weights = weights;
    }
}