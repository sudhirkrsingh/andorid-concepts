package com.mega.constraintdesign.GetRetrofitGiftCardStore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GiftCardModel {

    @SerializedName("marketingContent01")
    @Expose
    private String marketingContent01;

    @SerializedName("giftCardImageUrl")
    @Expose
    private String giftCardImageUrl;

    @SerializedName("giftCardName")
    @Expose
    private String giftCardName;

    @SerializedName("marketingContent02")
    @Expose
    private String marketingContent02;

    public GiftCardModel(String marketingContent01, String giftCardImageUrl, String giftCardName, String marketingContent02) {
        this.marketingContent01 = marketingContent01;
        this.giftCardImageUrl = giftCardImageUrl;
        this.giftCardName = giftCardName;
        this.marketingContent02 = marketingContent02;
    }

    public String getMarketingContent01() {
        return marketingContent01;
    }

    public void setMarketingContent01(String marketingContent01) {
        this.marketingContent01 = marketingContent01;
    }

    public String getGiftCardImageUrl() {
        return giftCardImageUrl;
    }

    public void setGiftCardImageUrl(String giftCardImageUrl) {
        this.giftCardImageUrl = giftCardImageUrl;
    }

    public String getGiftCardName() {
        return giftCardName;
    }

    public void setGiftCardName(String giftCardName) {
        this.giftCardName = giftCardName;
    }

    public String getMarketingContent02() {
        return marketingContent02;
    }

    public void setMarketingContent02(String marketingContent02) {
        this.marketingContent02 = marketingContent02;
    }
}
