package com.mega.constraintdesign.GetRetrofitGiftCardStore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GiftCardStoreResponse {

    @SerializedName("giftCardResponseList")
    @Expose
    private List<GiftCardModel> giftCardResponseList = null;
    @SerializedName("status")
    @Expose
    private String status;

    public List<GiftCardModel> getGiftCardResponseList() {
        return giftCardResponseList;
    }

    public void setGiftCardResponseList(List<GiftCardModel> giftCardResponseList) {
        this.giftCardResponseList = giftCardResponseList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
