package com.myprojet.entities;

// Generated Jun 10, 2016 10:34:30 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Area generated by hbm2java
 */
@Entity
@Table(name = "area", catalog = "travelguild")
public class Area implements java.io.Serializable {

	private Integer areaId;
	private String areaName;
	private String areaDescription;

	public Area() {
	}

	public Area(String areaName, String areaDescription) {
		this.areaName = areaName;
		this.areaDescription = areaDescription;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "areaId", unique = true, nullable = false)
	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	@Column(name = "areaName", nullable = false)
	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Column(name = "areaDescription", nullable = false)
	public String getAreaDescription() {
		return this.areaDescription;
	}

	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}

}
