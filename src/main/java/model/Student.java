package model;

import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.PictureRenderData;

public class Student {
    private String name;
    private String sex;
//    private String IDtype;
//    private String IDNumber;
//    private String health;
//    private String brithDate;
//    private String country;
//    private String nation;
//    private String nativePlace;
//    private String brithPlace;
//    private String marry;
//    private String politics;
//    private String fristWorkDate;
    private PictureRenderData image;
    private MiniTableRenderData educationTable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
//
//    public String getIDtype() {
//        return IDtype;
//    }
//
//    public void setIDtype(String IDtype) {
//        this.IDtype = IDtype;
//    }
//
//    public String getIDNumber() {
//        return IDNumber;
//    }
//
//    public void setIDNumber(String IDNumber) {
//        this.IDNumber = IDNumber;
//    }
//
//    public String getHealth() {
//        return health;
//    }
//
//    public void setHealth(String health) {
//        this.health = health;
//    }
//
//    public String getBrithDate() {
//        return brithDate;
//    }
//
//    public void setBrithDate(String brithDate) {
//        this.brithDate = brithDate;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getNation() {
//        return nation;
//    }
//
//    public void setNation(String nation) {
//        this.nation = nation;
//    }
//
//    public String getNativePlace() {
//        return nativePlace;
//    }
//
//    public void setNativePlace(String nativePlace) {
//        this.nativePlace = nativePlace;
//    }
//
//    public String getBrithPlace() {
//        return brithPlace;
//    }
//
//    public void setBrithPlace(String brithPlace) {
//        this.brithPlace = brithPlace;
//    }
//
//    public String getMarry() {
//        return marry;
//    }
//
//    public void setMarry(String marry) {
//        this.marry = marry;
//    }
//
//    public String getPolitics() {
//        return politics;
//    }
//
//    public void setPolitics(String politics) {
//        this.politics = politics;
//    }
//
//    public String getFristWorkDate() {
//        return fristWorkDate;
//    }
//
//    public void setFristWorkDate(String fristWorkDate) {
//        this.fristWorkDate = fristWorkDate;
//    }


    public PictureRenderData getImage() {
        return image;
    }

    public void setImage(PictureRenderData image) {
        this.image = image;
    }

    public MiniTableRenderData getEducationTable() {
        return educationTable;
    }

    public void setEducationTable(MiniTableRenderData educationTable) {
        this.educationTable = educationTable;
    }
}
