package com.mega.constraintdesign.postretrofitpathandquery;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StoreListModel {

    @SerializedName("stores")
    @Expose
    private List<StoreSingleModel> storeSingleModels = null;
    public final static Parcelable.Creator<StoreListModel> CREATOR = new Parcelable.Creator<StoreListModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public StoreListModel createFromParcel(android.os.Parcel in) {
            return new StoreListModel(in);
        }

        public StoreListModel[] newArray(int size) {
            return (new StoreListModel[size]);
        }

    }
            ;

    protected StoreListModel(android.os.Parcel in) {
        in.readList(this.storeSingleModels, (StoreSingleModel.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public StoreListModel() {
    }

    /**
     *
     * @param storeSingleModels
     */
    public StoreListModel(List<StoreSingleModel> storeSingleModels) {
        super();
        this.storeSingleModels = storeSingleModels;
    }

    public List<StoreSingleModel> getStores() {
        return storeSingleModels;
    }

    public void setStores(List<StoreSingleModel> storeSingleModels) {
        this.storeSingleModels = storeSingleModels;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeList(storeSingleModels);
    }

    public int describeContents() {
        return 0;
    }
}
