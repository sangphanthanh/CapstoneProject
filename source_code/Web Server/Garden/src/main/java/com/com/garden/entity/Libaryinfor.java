package com.garden.entity;

// Generated Jun 10, 2016 12:51:31 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Libaryinfor generated by hbm2java
 */
@Entity
@Table(name = "libaryinfor", catalog = "travelguild")
public class Libaryinfor implements java.io.Serializable {

	private int phlanId;
	private String planname;
	private String typeplan;
	private float phhight;
	private float lighthight;
	private float humidityhight;
	private float temperaturehight;
	private Float humidityofsoilhight;
	private Float phlower;
	private Float lightlower;
	private Float humiditylower;
	private Float temperaturelower;
	private Float humidityofsoillower;

	public Libaryinfor() {
	}

	public Libaryinfor(int phlanId, String planname, float phhight,
			float lighthight, float humidityhight, float temperaturehight) {
		this.phlanId = phlanId;
		this.planname = planname;
		this.phhight = phhight;
		this.lighthight = lighthight;
		this.humidityhight = humidityhight;
		this.temperaturehight = temperaturehight;
	}

	public Libaryinfor(int phlanId, String planname, String typeplan,
			float phhight, float lighthight, float humidityhight,
			float temperaturehight, Float humidityofsoilhight, Float phlower,
			Float lightlower, Float humiditylower, Float temperaturelower,
			Float humidityofsoillower) {
		this.phlanId = phlanId;
		this.planname = planname;
		this.typeplan = typeplan;
		this.phhight = phhight;
		this.lighthight = lighthight;
		this.humidityhight = humidityhight;
		this.temperaturehight = temperaturehight;
		this.humidityofsoilhight = humidityofsoilhight;
		this.phlower = phlower;
		this.lightlower = lightlower;
		this.humiditylower = humiditylower;
		this.temperaturelower = temperaturelower;
		this.humidityofsoillower = humidityofsoillower;
	}

	@Id
	@Column(name = "phlanID", unique = true, nullable = false)
	public int getPhlanId() {
		return this.phlanId;
	}

	public void setPhlanId(int phlanId) {
		this.phlanId = phlanId;
	}

	@Column(name = "planname", nullable = false)
	public String getPlanname() {
		return this.planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	@Column(name = "typeplan")
	public String getTypeplan() {
		return this.typeplan;
	}

	public void setTypeplan(String typeplan) {
		this.typeplan = typeplan;
	}

	@Column(name = "phhight", nullable = false, precision = 12, scale = 0)
	public float getPhhight() {
		return this.phhight;
	}

	public void setPhhight(float phhight) {
		this.phhight = phhight;
	}

	@Column(name = "lighthight", nullable = false, precision = 12, scale = 0)
	public float getLighthight() {
		return this.lighthight;
	}

	public void setLighthight(float lighthight) {
		this.lighthight = lighthight;
	}

	@Column(name = "humidityhight", nullable = false, precision = 12, scale = 0)
	public float getHumidityhight() {
		return this.humidityhight;
	}

	public void setHumidityhight(float humidityhight) {
		this.humidityhight = humidityhight;
	}

	@Column(name = "temperaturehight", nullable = false, precision = 12, scale = 0)
	public float getTemperaturehight() {
		return this.temperaturehight;
	}

	public void setTemperaturehight(float temperaturehight) {
		this.temperaturehight = temperaturehight;
	}

	@Column(name = "humidityofsoilhight", precision = 12, scale = 0)
	public Float getHumidityofsoilhight() {
		return this.humidityofsoilhight;
	}

	public void setHumidityofsoilhight(Float humidityofsoilhight) {
		this.humidityofsoilhight = humidityofsoilhight;
	}

	@Column(name = "phlower", precision = 12, scale = 0)
	public Float getPhlower() {
		return this.phlower;
	}

	public void setPhlower(Float phlower) {
		this.phlower = phlower;
	}

	@Column(name = "lightlower", precision = 12, scale = 0)
	public Float getLightlower() {
		return this.lightlower;
	}

	public void setLightlower(Float lightlower) {
		this.lightlower = lightlower;
	}

	@Column(name = "humiditylower", precision = 12, scale = 0)
	public Float getHumiditylower() {
		return this.humiditylower;
	}

	public void setHumiditylower(Float humiditylower) {
		this.humiditylower = humiditylower;
	}

	@Column(name = "temperaturelower", precision = 12, scale = 0)
	public Float getTemperaturelower() {
		return this.temperaturelower;
	}

	public void setTemperaturelower(Float temperaturelower) {
		this.temperaturelower = temperaturelower;
	}

	@Column(name = "humidityofsoillower", precision = 12, scale = 0)
	public Float getHumidityofsoillower() {
		return this.humidityofsoillower;
	}

	public void setHumidityofsoillower(Float humidityofsoillower) {
		this.humidityofsoillower = humidityofsoillower;
	}

}
