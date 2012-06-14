package com.jshop.entity;

// Generated 2012-6-14 14:52:11 by Hibernate Tools 3.4.0.CR1

/**
 * LogisticsbusinessareaT generated by hbm2java
 */
public class LogisticsbusinessareaT implements java.io.Serializable {

	private String logbusareaid;
	private String logisticsid;
	private String logisticsname;
	private String areaname;
	private String costway;
	private Double normalcost;
	private Double overcost;
	private Double freecount;
	private String sendarea;
	private String state;
	private Double overvalue;
	private Double needcostmin;
	private Double needcostmax;

	public LogisticsbusinessareaT() {
	}

	public LogisticsbusinessareaT(String logbusareaid, String logisticsid,
			String areaname, String state) {
		this.logbusareaid = logbusareaid;
		this.logisticsid = logisticsid;
		this.areaname = areaname;
		this.state = state;
	}

	public LogisticsbusinessareaT(String logbusareaid, String logisticsid,
			String logisticsname, String areaname, String costway,
			Double normalcost, Double overcost, Double freecount,
			String sendarea, String state, Double overvalue,
			Double needcostmin, Double needcostmax) {
		this.logbusareaid = logbusareaid;
		this.logisticsid = logisticsid;
		this.logisticsname = logisticsname;
		this.areaname = areaname;
		this.costway = costway;
		this.normalcost = normalcost;
		this.overcost = overcost;
		this.freecount = freecount;
		this.sendarea = sendarea;
		this.state = state;
		this.overvalue = overvalue;
		this.needcostmin = needcostmin;
		this.needcostmax = needcostmax;
	}

	public String getLogbusareaid() {
		return this.logbusareaid;
	}

	public void setLogbusareaid(String logbusareaid) {
		this.logbusareaid = logbusareaid;
	}

	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	public String getLogisticsname() {
		return this.logisticsname;
	}

	public void setLogisticsname(String logisticsname) {
		this.logisticsname = logisticsname;
	}

	public String getAreaname() {
		return this.areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getCostway() {
		return this.costway;
	}

	public void setCostway(String costway) {
		this.costway = costway;
	}

	public Double getNormalcost() {
		return this.normalcost;
	}

	public void setNormalcost(Double normalcost) {
		this.normalcost = normalcost;
	}

	public Double getOvercost() {
		return this.overcost;
	}

	public void setOvercost(Double overcost) {
		this.overcost = overcost;
	}

	public Double getFreecount() {
		return this.freecount;
	}

	public void setFreecount(Double freecount) {
		this.freecount = freecount;
	}

	public String getSendarea() {
		return this.sendarea;
	}

	public void setSendarea(String sendarea) {
		this.sendarea = sendarea;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getOvervalue() {
		return this.overvalue;
	}

	public void setOvervalue(Double overvalue) {
		this.overvalue = overvalue;
	}

	public Double getNeedcostmin() {
		return this.needcostmin;
	}

	public void setNeedcostmin(Double needcostmin) {
		this.needcostmin = needcostmin;
	}

	public Double getNeedcostmax() {
		return this.needcostmax;
	}

	public void setNeedcostmax(Double needcostmax) {
		this.needcostmax = needcostmax;
	}

}
