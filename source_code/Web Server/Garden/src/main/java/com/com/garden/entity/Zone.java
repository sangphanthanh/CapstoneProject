package com.garden.entity;

// Generated Jun 10, 2016 12:51:31 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Zone generated by hbm2java
 */
@Entity
@Table(name = "zone", catalog = "travelguild", uniqueConstraints = @UniqueConstraint(columnNames = "userlibary"))
public class Zone implements java.io.Serializable {

	private int zoneId;
	private String zonename;
	private String username;
	private Integer userlibary;
	private Integer devidecode;
	private String location;
	private Date dayofplan;

	public Zone() {
	}

	public Zone(int zoneId) {
		this.zoneId = zoneId;
	}

	public Zone(int zoneId, String zonename, String username,
			Integer userlibary, Integer devidecode, String location,
			Date dayofplan) {
		this.zoneId = zoneId;
		this.zonename = zonename;
		this.username = username;
		this.userlibary = userlibary;
		this.devidecode = devidecode;
		this.location = location;
		this.dayofplan = dayofplan;
	}

	@Id
	@Column(name = "zoneID", unique = true, nullable = false)
	public int getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

	@Column(name = "zonename", length = 45)
	public String getZonename() {
		return this.zonename;
	}

	public void setZonename(String zonename) {
		this.zonename = zonename;
	}

	@Column(name = "username", length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "userlibary", unique = true)
	public Integer getUserlibary() {
		return this.userlibary;
	}

	public void setUserlibary(Integer userlibary) {
		this.userlibary = userlibary;
	}

	@Column(name = "devidecode")
	public Integer getDevidecode() {
		return this.devidecode;
	}

	public void setDevidecode(Integer devidecode) {
		this.devidecode = devidecode;
	}

	@Column(name = "location", length = 45)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dayofplan", length = 10)
	public Date getDayofplan() {
		return this.dayofplan;
	}

	public void setDayofplan(Date dayofplan) {
		this.dayofplan = dayofplan;
	}

}
