
package com.av.creditscore.retofit_demo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserdLogin {

    @SerializedName("connection")
    @Expose
    private Integer connection;
    @SerializedName("result")
    @Expose
    private Integer result;
    @SerializedName("UserData")
    @Expose
    private UserData userData;

    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    @Override
    public String toString() {
        return "UserdLogin{" +
                "connection=" + connection +
                ", result=" + result +
                ", userData=" + userData +
                '}';
    }
}
