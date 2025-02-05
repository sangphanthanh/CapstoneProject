package com.myprojet.entities;

// Generated Jun 10, 2016 10:34:30 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Zone generated by hbm2java
 */
@Entity
@Table(name = "zone", catalog = "travelguild", uniqueConstraints = {
		@UniqueConstraint(columnNames = "userLibID"),
		@UniqueConstraint(columnNames = "zonename"),
		@UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "devideCode"),
		@UniqueConstraint(columnNames = "dateOfGrow") })
public class Zone implements java.io.Serializable {

	private Integer zoneId;
	private String zonename;
	private String username;
	private Integer userLibId;
	private String devideCode;
	private String location;
	private Date dateOfGrow;

	public Zone() {
	}

	public Zone(String zonename, String username, Integer userLibId,
			String devideCode, String location, Date dateOfGrow) {
		this.zonename = zonename;
		this.username = username;
		this.userLibId = userLibId;
		this.devideCode = devideCode;
		this.location = location;
		this.dateOfGrow = dateOfGrow;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "zoneID", unique = true, nullable = false)
	public Integer getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	@Column(name = "zonename", unique = true)
	public String getZonename() {
		return this.zonename;
	}

	public void setZonename(String zonename) {
		this.zonename = zonename;
	}

	@Column(name = "username", unique = true)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "userLibID", unique = true)
	public Integer getUserLibId() {
		return this.userLibId;
	}

	public void setUserLibId(Integer userLibId) {
		this.userLibId = userLibId;
	}

	@Column(name = "devideCode", unique = true)
	public String getDevideCode() {
		return this.devideCode;
	}

	public void setDevideCode(String devideCode) {
		this.devideCode = devideCode;
	}

	@Column(name = "location")
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateOfGrow", unique = true, length = 19)
	public Date getDateOfGrow() {
		return this.dateOfGrow;
	}

	public void setDateOfGrow(Date dateOfGrow) {
		this.dateOfGrow = dateOfGrow;
	}

}
