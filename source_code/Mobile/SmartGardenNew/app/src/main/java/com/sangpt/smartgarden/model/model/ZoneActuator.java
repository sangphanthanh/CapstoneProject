package com.sangpt.smartgarden.model.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ManhNV on 7/13/2016.
 */
public class ZoneActuator {
    @SerializedName("enddeviceId")
    private String endDeviceId;
    @SerializedName("statuscovered")
    private boolean statusCovered;
    @SerializedName("statusmisting")
    private boolean statusMisting;
    @SerializedName("statuspump")
    private boolean statusPump;
    @SerializedName("statusFertilize")
    private boolean statusFertilize;
    @SerializedName("zoneId")
    private String zoneId;
    @SerializedName("automatically")
    private boolean automatically;
    @SerializedName("statuslamp")
    private boolean statusLamp;
    @SerializedName("statusPH")
    private int statusPH;

    public String getEndDeviceId() {
        return endDeviceId;
    }

    public void setEndDeviceId(String endDeviceId) {
        this.endDeviceId = endDeviceId;
    }

    public boolean isStatusCovered() {
        return statusCovered;
    }

    public void setStatusCovered(boolean statusCovered) {
        this.statusCovered = statusCovered;
    }

    public boolean isStatusMisting() {
        return statusMisting;
    }

    public void setStatusMisting(boolean statusMisting) {
        this.statusMisting = statusMisting;
    }

    public boolean isStatusPump() {
        return statusPump;
    }

    public void setStatusPump(boolean statusPump) {
        this.statusPump = statusPump;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public boolean isStatusFertilize() {
        return statusFertilize;
    }

    public void setStatusFertilize(boolean statusFertilize) {
        this.statusFertilize = statusFertilize;
    }

    public boolean isAutomatically() {
        return automatically;
    }

    public void setAutomatically(boolean automatically) {
        this.automatically = automatically;
    }

    public boolean isStatusLamp() {
        return statusLamp;
    }

    public void setStatusLamp(boolean statusLamp) {
        this.statusLamp = statusLamp;
    }

    public int getStatusPH() {
        return statusPH;
    }
}
