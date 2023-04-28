package ase.dinith.sampleapplication.model;

import com.google.gson.annotations.SerializedName;

public class DataResponse {

    @SerializedName("success")
    private String success;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private HealthData data;

    public DataResponse() {
    }

    public DataResponse(String success, String message, HealthData data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HealthData getData() {
        return data;
    }

    public void setData(HealthData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataResponse{" +
                "success='" + success + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
