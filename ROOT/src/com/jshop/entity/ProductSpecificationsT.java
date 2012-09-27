package com.jshop.entity;

// Generated 2012-9-18 10:14:54 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ProductSpecificationsT generated by hbm2java
 */
public class ProductSpecificationsT implements java.io.Serializable {

	private String specificationsid;
	private String name;
	private String note;
	private String sort;
	private String specificationsType;
	private String specificationsValue;
	private Date createtime;
	private String creatorid;
	private String state;

	public ProductSpecificationsT() {
	}

	public ProductSpecificationsT(String specificationsid, String name,
			String specificationsType, String specificationsValue,
			Date createtime, String creatorid, String state) {
		this.specificationsid = specificationsid;
		this.name = name;
		this.specificationsType = specificationsType;
		this.specificationsValue = specificationsValue;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
	}

	public ProductSpecificationsT(String specificationsid, String name,
			String note, String sort, String specificationsType,
			String specificationsValue, Date createtime, String creatorid,
			String state) {
		this.specificationsid = specificationsid;
		this.name = name;
		this.note = note;
		this.sort = sort;
		this.specificationsType = specificationsType;
		this.specificationsValue = specificationsValue;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
	}

	public String getSpecificationsid() {
		return this.specificationsid;
	}

	public void setSpecificationsid(String specificationsid) {
		this.specificationsid = specificationsid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSpecificationsType() {
		return this.specificationsType;
	}

	public void setSpecificationsType(String specificationsType) {
		this.specificationsType = specificationsType;
	}

	public String getSpecificationsValue() {
		return this.specificationsValue;
	}

	public void setSpecificationsValue(String specificationsValue) {
		this.specificationsValue = specificationsValue;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
