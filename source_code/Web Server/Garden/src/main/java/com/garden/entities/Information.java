package com.garden.entities;

// Generated May 29, 2016 3:43:09 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Information generated by hbm2java
 */
@Entity
@Table(name = "information", catalog = "garden")
public class Information implements java.io.Serializable {

	private int imformationid;
	private int plantid;
	private Integer ph;
	private Integer light;
	private Integer humidity;
	private Integer temperature;
	private Integer temperatureofsoil;
	private Integer datefertilizer;
	private Integer daygrowth;

	public Information() {
	}

	public Information(int imformationid, int plantid) {
		this.imformationid = imformationid;
		this.plantid = plantid;
	}

	public Information(int imformationid, int plantid, Integer ph,
			Integer light, Integer humidity, Integer temperature,
			Integer temperatureofsoil, Integer datefertilizer, Integer daygrowth) {
		this.imformationid = imformationid;
		this.plantid = plantid;
		this.ph = ph;
		this.light = light;
		this.humidity = humidity;
		this.temperature = temperature;
		this.temperatureofsoil = temperatureofsoil;
		this.datefertilizer = datefertilizer;
		this.daygrowth = daygrowth;
	}

	@Id
	@Column(name = "imformationid", unique = true, nullable = false)
	public int getImformationid() {
		return this.imformationid;
	}

	public void setImformationid(int imformationid) {
		this.imformationid = imformationid;
	}

	@Column(name = "plantid", nullable = false)
	public int getPlantid() {
		return this.plantid;
	}

	public void setPlantid(int plantid) {
		this.plantid = plantid;
	}

	@Column(name = "ph")
	public Integer getPh() {
		return this.ph;
	}

	public void setPh(Integer ph) {
		this.ph = ph;
	}

	@Column(name = "light")
	public Integer getLight() {
		return this.light;
	}

	public void setLight(Integer light) {
		this.light = light;
	}

	@Column(name = "humidity")
	public Integer getHumidity() {
		return this.humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	@Column(name = "temperature")
	public Integer getTemperature() {
		return this.temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	@Column(name = "temperatureofsoil")
	public Integer getTemperatureofsoil() {
		return this.temperatureofsoil;
	}

	public void setTemperatureofsoil(Integer temperatureofsoil) {
		this.temperatureofsoil = temperatureofsoil;
	}

	@Column(name = "datefertilizer")
	public Integer getDatefertilizer() {
		return this.datefertilizer;
	}

	public void setDatefertilizer(Integer datefertilizer) {
		this.datefertilizer = datefertilizer;
	}

	@Column(name = "daygrowth")
	public Integer getDaygrowth() {
		return this.daygrowth;
	}

	public void setDaygrowth(Integer daygrowth) {
		this.daygrowth = daygrowth;
	}

}
