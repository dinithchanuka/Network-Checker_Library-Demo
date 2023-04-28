package ase.dinith.sampleapplication.model;

import com.google.gson.annotations.SerializedName;

public class HealthData {

    @SerializedName("update_date_time")
    private String update_date_time;
    @SerializedName("local_new_cases")
    private String local_new_cases;
    @SerializedName("local_total_cases")
    private String local_total_cases;
    @SerializedName("local_total_number_of_individuals_in_hospitals")
    private String hospitalize;
    @SerializedName("local_deaths")
    private String local_deaths;
    @SerializedName("local_new_deaths")
    private String local_new_deaths;
    @SerializedName("local_recovered")
    private String local_recovered;
    @SerializedName("local_active_cases")
    private String local_active_cases;
    @SerializedName("global_new_cases")
    private String global_new_cases;
    @SerializedName("global_total_cases")
    private String global_total_cases;
    @SerializedName("global_deaths")
    private String global_deaths;
    @SerializedName("global_new_deaths")
    private String global_new_deaths;
    @SerializedName("global_recovered")
    private String global_recovered;

    public HealthData() {
    }

    public HealthData(String update_date_time, String local_new_cases, String local_total_cases, String hospitalize, String local_deaths, String local_new_deaths, String local_recovered, String local_active_cases, String global_new_cases, String global_total_cases, String global_deaths, String global_new_deaths, String global_recovered) {
        this.update_date_time = update_date_time;
        this.local_new_cases = local_new_cases;
        this.local_total_cases = local_total_cases;
        this.hospitalize = hospitalize;
        this.local_deaths = local_deaths;
        this.local_new_deaths = local_new_deaths;
        this.local_recovered = local_recovered;
        this.local_active_cases = local_active_cases;
        this.global_new_cases = global_new_cases;
        this.global_total_cases = global_total_cases;
        this.global_deaths = global_deaths;
        this.global_new_deaths = global_new_deaths;
        this.global_recovered = global_recovered;
    }

    public String getUpdate_date_time() {
        return update_date_time;
    }

    public void setUpdate_date_time(String update_date_time) {
        this.update_date_time = update_date_time;
    }

    public String getLocal_new_cases() {
        return local_new_cases;
    }

    public void setLocal_new_cases(String local_new_cases) {
        this.local_new_cases = local_new_cases;
    }

    public String getLocal_total_cases() {
        return local_total_cases;
    }

    public void setLocal_total_cases(String local_total_cases) {
        this.local_total_cases = local_total_cases;
    }

    public String getHospitalize() {
        return hospitalize;
    }

    public void setHospitalize(String hospitalize) {
        this.hospitalize = hospitalize;
    }

    public String getLocal_deaths() {
        return local_deaths;
    }

    public void setLocal_deaths(String local_deaths) {
        this.local_deaths = local_deaths;
    }

    public String getLocal_new_deaths() {
        return local_new_deaths;
    }

    public void setLocal_new_deaths(String local_new_deaths) {
        this.local_new_deaths = local_new_deaths;
    }

    public String getLocal_recovered() {
        return local_recovered;
    }

    public void setLocal_recovered(String local_recovered) {
        this.local_recovered = local_recovered;
    }

    public String getLocal_active_cases() {
        return local_active_cases;
    }

    public void setLocal_active_cases(String local_active_cases) {
        this.local_active_cases = local_active_cases;
    }

    public String getGlobal_new_cases() {
        return global_new_cases;
    }

    public void setGlobal_new_cases(String global_new_cases) {
        this.global_new_cases = global_new_cases;
    }

    public String getGlobal_total_cases() {
        return global_total_cases;
    }

    public void setGlobal_total_cases(String global_total_cases) {
        this.global_total_cases = global_total_cases;
    }

    public String getGlobal_deaths() {
        return global_deaths;
    }

    public void setGlobal_deaths(String global_deaths) {
        this.global_deaths = global_deaths;
    }

    public String getGlobal_new_deaths() {
        return global_new_deaths;
    }

    public void setGlobal_new_deaths(String global_new_deaths) {
        this.global_new_deaths = global_new_deaths;
    }

    public String getGlobal_recovered() {
        return global_recovered;
    }

    public void setGlobal_recovered(String global_recovered) {
        this.global_recovered = global_recovered;
    }

    @Override
    public String toString() {
        return "HealthData{" +
                "update_date_time='" + update_date_time + '\'' +
                ", local_new_cases='" + local_new_cases + '\'' +
                ", local_total_cases='" + local_total_cases + '\'' +
                ", hospitalize='" + hospitalize + '\'' +
                ", local_deaths='" + local_deaths + '\'' +
                ", local_new_deaths='" + local_new_deaths + '\'' +
                ", local_recovered='" + local_recovered + '\'' +
                ", local_active_cases='" + local_active_cases + '\'' +
                ", global_new_cases='" + global_new_cases + '\'' +
                ", global_total_cases='" + global_total_cases + '\'' +
                ", global_deaths='" + global_deaths + '\'' +
                ", global_new_deaths='" + global_new_deaths + '\'' +
                ", global_recovered='" + global_recovered + '\'' +
                '}';
    }
}
