package com.mega.constraintdesign.PostAPI;




import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserDataModel implements Parcelable {


    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("cityOid")
    @Expose
    private Integer cityOid;
    @SerializedName("countryOid")
    @Expose
    private Integer countryOid;
    @SerializedName("dateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("imagePath")
    @Expose
    private String imagePath;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("mobileNo")
    @Expose
    private String mobileNo;
    @SerializedName("nationalityOid")
    @Expose
    private Integer nationalityOid;
    public final static Creator<UserDataModel> CREATOR = new Creator<UserDataModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public UserDataModel createFromParcel(android.os.Parcel in) {
            return new UserDataModel(in);
        }

        public UserDataModel[] newArray(int size) {
            return (new UserDataModel[size]);
        }

    }
            ;

    protected UserDataModel(android.os.Parcel in) {
        this.address = ((String) in.readValue((String.class.getClassLoader())));
        this.cityOid = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.countryOid = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dateOfBirth = ((String) in.readValue((String.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));
        this.firstName = ((String) in.readValue((String.class.getClassLoader())));
        this.gender = ((String) in.readValue((String.class.getClassLoader())));
        this.imagePath = ((String) in.readValue((String.class.getClassLoader())));
        this.lastName = ((String) in.readValue((String.class.getClassLoader())));
        this.mobileNo = ((String) in.readValue((String.class.getClassLoader())));
        this.nationalityOid = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public UserDataModel() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param address
     * @param gender
     * @param imagePath
     * @param nationalityOid
     * @param dateOfBirth
     * @param mobileNo
     * @param countryOid
     * @param email
     * @param cityOid
     */
    public UserDataModel(String address, Integer cityOid, Integer countryOid, String dateOfBirth, String email, String firstName, String gender, String imagePath, String lastName, String mobileNo, Integer nationalityOid) {
        super();
        this.address = address;
        this.cityOid = cityOid;
        this.countryOid = countryOid;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.firstName = firstName;
        this.gender = gender;
        this.imagePath = imagePath;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.nationalityOid = nationalityOid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCityOid() {
        return cityOid;
    }

    public void setCityOid(Integer cityOid) {
        this.cityOid = cityOid;
    }

    public Integer getCountryOid() {
        return countryOid;
    }

    public void setCountryOid(Integer countryOid) {
        this.countryOid = countryOid;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getNationalityOid() {
        return nationalityOid;
    }

    public void setNationalityOid(Integer nationalityOid) {
        this.nationalityOid = nationalityOid;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(address);
        dest.writeValue(cityOid);
        dest.writeValue(countryOid);
        dest.writeValue(dateOfBirth);
        dest.writeValue(email);
        dest.writeValue(firstName);
        dest.writeValue(gender);
        dest.writeValue(imagePath);
        dest.writeValue(lastName);
        dest.writeValue(mobileNo);
        dest.writeValue(nationalityOid);
    }

    public int describeContents() {
        return 0;
    }
}
