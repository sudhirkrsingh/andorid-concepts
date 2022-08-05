package com.mega.constraintdesign.Retrofitgetuser;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("id")
    @Expose
    private int userId;

    @SerializedName("title")
    @Expose
    private String userTitle;

    @SerializedName("body")
    @Expose
    private String userBody;

    public UserModel(int userId, String userTitle, String userBody) {
        this.userId = userId;
        this.userTitle = userTitle;
        this.userBody = userBody;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getUserBody() {
        return userBody;
    }

    public void setUserBody(String userBody) {
        this.userBody = userBody;
    }
}
