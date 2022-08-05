package com.mega.constraintdesign.postretrofitpathandquery;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StoreSingleModel implements Parcelable {

    @SerializedName("countryId")
    @Expose
    private Integer countryId;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("cityId")
    @Expose
    private Integer cityId;
    @SerializedName("cityName")
    @Expose
    private String cityName;
    @SerializedName("locataion")
    @Expose
    private String locataion;
    @SerializedName("mallId")
    @Expose
    private Integer mallId;
    @SerializedName("mallName")
    @Expose
    private String mallName;
    @SerializedName("storeId")
    @Expose
    private Integer storeId;
    @SerializedName("brandId")
    @Expose
    private Integer brandId;
    @SerializedName("brandName")
    @Expose
    private String brandName;
    @SerializedName("brandCode")
    @Expose
    private String brandCode;
    @SerializedName("storeName")
    @Expose
    private String storeName;
    @SerializedName("storeAddress")
    @Expose
    private String storeAddress;
    @SerializedName("storeImageUrl")
    @Expose
    private String storeImageUrl;
    @SerializedName("contactPerson")
    @Expose
    private String contactPerson;
    @SerializedName("contactNumber")
    @Expose
    private String contactNumber;
    @SerializedName("videoUrl")
    @Expose
    private String videoUrl;
    @SerializedName("brandIconUrl")
    @Expose
    private String brandIconUrl;
    @SerializedName("storeWall")
    @Expose
    private Boolean storeWall;
    @SerializedName("lifeStyleProducts")
    @Expose
    private Boolean lifeStyleProducts;
    @SerializedName("lifeStyleProductsImagePath")
    @Expose
    private String lifeStyleProductsImagePath;
    @SerializedName("storeImages")
    @Expose
    private List<String> storeImages = null;
    @SerializedName("mrBrandId")
    @Expose
    private Integer mrBrandId;
    public final static Creator<StoreSingleModel> CREATOR = new Creator<StoreSingleModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public StoreSingleModel createFromParcel(android.os.Parcel in) {
            return new StoreSingleModel(in);
        }

        public StoreSingleModel[] newArray(int size) {
            return (new StoreSingleModel[size]);
        }

    }
            ;

    protected StoreSingleModel(android.os.Parcel in) {
        this.countryId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.countryName = ((String) in.readValue((String.class.getClassLoader())));
        this.cityId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.cityName = ((String) in.readValue((String.class.getClassLoader())));
        this.locataion = ((String) in.readValue((String.class.getClassLoader())));
        this.mallId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.mallName = ((String) in.readValue((String.class.getClassLoader())));
        this.storeId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.brandId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.brandName = ((String) in.readValue((String.class.getClassLoader())));
        this.brandCode = ((String) in.readValue((String.class.getClassLoader())));
        this.storeName = ((String) in.readValue((String.class.getClassLoader())));
        this.storeAddress = ((String) in.readValue((String.class.getClassLoader())));
        this.storeImageUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.contactPerson = ((String) in.readValue((String.class.getClassLoader())));
        this.contactNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.videoUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.brandIconUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.storeWall = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.lifeStyleProducts = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.lifeStyleProductsImagePath = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.storeImages, (java.lang.String.class.getClassLoader()));
        this.mrBrandId = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public StoreSingleModel() {
    }

    /**
     *
     * @param mallName
     * @param brandName
     * @param storeImageUrl
     * @param lifeStyleProductsImagePath
     * @param mallId
     * @param lifeStyleProducts
     * @param contactPerson
     * @param mrBrandId
     * @param cityId
     * @param storeId
     * @param countryId
     * @param storeWall
     * @param storeImages
     * @param cityName
     * @param videoUrl
     * @param storeAddress
     * @param brandId
     * @param contactNumber
     * @param locataion
     * @param storeName
     * @param countryName
     * @param brandCode
     * @param brandIconUrl
     */
    public StoreSingleModel(Integer countryId, String countryName, Integer cityId, String cityName, String locataion, Integer mallId, String mallName, Integer storeId, Integer brandId, String brandName, String brandCode, String storeName, String storeAddress, String storeImageUrl, String contactPerson, String contactNumber, String videoUrl, String brandIconUrl, Boolean storeWall, Boolean lifeStyleProducts, String lifeStyleProductsImagePath, List<String> storeImages, Integer mrBrandId) {
        super();
        this.countryId = countryId;
        this.countryName = countryName;
        this.cityId = cityId;
        this.cityName = cityName;
        this.locataion = locataion;
        this.mallId = mallId;
        this.mallName = mallName;
        this.storeId = storeId;
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandCode = brandCode;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeImageUrl = storeImageUrl;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.videoUrl = videoUrl;
        this.brandIconUrl = brandIconUrl;
        this.storeWall = storeWall;
        this.lifeStyleProducts = lifeStyleProducts;
        this.lifeStyleProductsImagePath = lifeStyleProductsImagePath;
        this.storeImages = storeImages;
        this.mrBrandId = mrBrandId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLocataion() {
        return locataion;
    }

    public void setLocataion(String locataion) {
        this.locataion = locataion;
    }

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreImageUrl() {
        return storeImageUrl;
    }

    public void setStoreImageUrl(String storeImageUrl) {
        this.storeImageUrl = storeImageUrl;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getBrandIconUrl() {
        return brandIconUrl;
    }

    public void setBrandIconUrl(String brandIconUrl) {
        this.brandIconUrl = brandIconUrl;
    }

    public Boolean getStoreWall() {
        return storeWall;
    }

    public void setStoreWall(Boolean storeWall) {
        this.storeWall = storeWall;
    }

    public Boolean getLifeStyleProducts() {
        return lifeStyleProducts;
    }

    public void setLifeStyleProducts(Boolean lifeStyleProducts) {
        this.lifeStyleProducts = lifeStyleProducts;
    }

    public String getLifeStyleProductsImagePath() {
        return lifeStyleProductsImagePath;
    }

    public void setLifeStyleProductsImagePath(String lifeStyleProductsImagePath) {
        this.lifeStyleProductsImagePath = lifeStyleProductsImagePath;
    }

    public List<String> getStoreImages() {
        return storeImages;
    }

    public void setStoreImages(List<String> storeImages) {
        this.storeImages = storeImages;
    }

    public Integer getMrBrandId() {
        return mrBrandId;
    }

    public void setMrBrandId(Integer mrBrandId) {
        this.mrBrandId = mrBrandId;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(countryId);
        dest.writeValue(countryName);
        dest.writeValue(cityId);
        dest.writeValue(cityName);
        dest.writeValue(locataion);
        dest.writeValue(mallId);
        dest.writeValue(mallName);
        dest.writeValue(storeId);
        dest.writeValue(brandId);
        dest.writeValue(brandName);
        dest.writeValue(brandCode);
        dest.writeValue(storeName);
        dest.writeValue(storeAddress);
        dest.writeValue(storeImageUrl);
        dest.writeValue(contactPerson);
        dest.writeValue(contactNumber);
        dest.writeValue(videoUrl);
        dest.writeValue(brandIconUrl);
        dest.writeValue(storeWall);
        dest.writeValue(lifeStyleProducts);
        dest.writeValue(lifeStyleProductsImagePath);
        dest.writeList(storeImages);
        dest.writeValue(mrBrandId);
    }

    public int describeContents() {
        return 0;
    }
}
