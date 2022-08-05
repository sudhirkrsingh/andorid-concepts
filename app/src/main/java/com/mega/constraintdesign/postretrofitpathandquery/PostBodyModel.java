package com.mega.constraintdesign.postretrofitpathandquery;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostBodyModel implements Parcelable {


    @SerializedName("stores")
    @Expose
    private String stores;
    public final static Creator<PostBodyModel> CREATOR = new Creator<PostBodyModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public PostBodyModel createFromParcel(android.os.Parcel in) {
            return new PostBodyModel(in);
        }

        public PostBodyModel[] newArray(int size) {
            return (new PostBodyModel[size]);
        }

    }
            ;

    protected PostBodyModel(android.os.Parcel in) {
        this.stores = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public PostBodyModel() {
    }

    /**
     *
     * @param stores
     */
    public PostBodyModel(String stores) {
        super();
        this.stores = stores;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(stores);
    }

    public int describeContents() {
        return 0;
    }
}
