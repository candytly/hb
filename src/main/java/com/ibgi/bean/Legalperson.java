package com.ibgi.bean;

import javax.persistence.*;

@Table(name = "`legalperson`")
public class Legalperson {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column legalperson.id
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column legalperson.name
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column legalperson.companyid
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private String companyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column legalperson.land_id
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    private Integer landId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column legalperson.id
     *
     * @return the value of legalperson.id
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column legalperson.id
     *
     * @param id the value for legalperson.id
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column legalperson.name
     *
     * @return the value of legalperson.name
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column legalperson.name
     *
     * @param name the value for legalperson.name
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column legalperson.companyid
     *
     * @return the value of legalperson.companyid
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public String getCompanyid() {
        return companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column legalperson.companyid
     *
     * @param companyid the value for legalperson.companyid
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column legalperson.land_id
     *
     * @return the value of legalperson.land_id
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public Integer getLandId() {
        return landId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column legalperson.land_id
     *
     * @param landId the value for legalperson.land_id
     *
     * @mbg.generated Tue Sep 11 15:54:41 CST 2018
     */
    public void setLandId(Integer landId) {
        this.landId = landId;
    }
}