package com.jshop.entity;

// Generated 2012-6-14 14:52:11 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ShippingAddressT generated by hbm2java
 */
public class ShippingAddressT implements java.io.Serializable {

	private String shippingaddressid;
	private String userid;
	private String username;
	private String province;
	private String city;
	private String district;
	private String street;
	private String postcode;
	private String telno;
	private String mobile;
	private String email;
	private Date createtime;
	private String state;
	private String issend;
	private String deliveraddressid;
	private String orderid;
	private String country;

	public ShippingAddressT() {
	}

	public ShippingAddressT(String shippingaddressid, String userid,
			String username, String province, String city, String district,
			String street, String mobile, Date createtime, String state,
			String issend) {
		this.shippingaddressid = shippingaddressid;
		this.userid = userid;
		this.username = username;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.mobile = mobile;
		this.createtime = createtime;
		this.state = state;
		this.issend = issend;
	}

	public ShippingAddressT(String shippingaddressid, String userid,
			String username, String province, String city, String district,
			String street, String postcode, String telno, String mobile,
			String email, Date createtime, String state, String issend,
			String deliveraddressid, String orderid, String country) {
		this.shippingaddressid = shippingaddressid;
		this.userid = userid;
		this.username = username;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.postcode = postcode;
		this.telno = telno;
		this.mobile = mobile;
		this.email = email;
		this.createtime = createtime;
		this.state = state;
		this.issend = issend;
		this.deliveraddressid = deliveraddressid;
		this.orderid = orderid;
		this.country = country;
	}

	public String getShippingaddressid() {
		return this.shippingaddressid;
	}

	public void setShippingaddressid(String shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getTelno() {
		return this.telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIssend() {
		return this.issend;
	}

	public void setIssend(String issend) {
		this.issend = issend;
	}

	public String getDeliveraddressid() {
		return this.deliveraddressid;
	}

	public void setDeliveraddressid(String deliveraddressid) {
		this.deliveraddressid = deliveraddressid;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
