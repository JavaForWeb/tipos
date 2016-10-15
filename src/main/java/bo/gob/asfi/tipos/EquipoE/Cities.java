package bo.gob.asfi.tipos.EquipoE;

/**
 * Created by jaduran on 15/10/2016.
 */
public class Cities {
    private String CityId;

    public String getCityId() {
        return CityId;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public String getCountryID() {
        return CountryID;
    }

    public void setCountryID(String countryID) {
        CountryID = countryID;
    }

    public String getRegionID() {
        return RegionID;
    }

    public void setRegionID(String regionID) {
        RegionID = regionID;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }

    public String getDmaId() {
        return DmaId;
    }

    public void setDmaId(String dmaId) {
        DmaId = dmaId;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    private String CountryID;
    private String RegionID;
    private String City;
    private String Latitude;
    private String Longitude;
    private String TimeZone;
    private String DmaId;
    private String Code;


    public Cities(String CityId ,String CountryID,String RegionID , String City, String Latitude, String Longitude, String TimeZone, String DmaId, String Code) {
        this.CityId=CityId;
        this.CountryID = CountryID;
        this.RegionID = RegionID;
        this.City = City;
        this.Latitude = Latitude;
        this.Longitude= Longitude;
         this.TimeZone=TimeZone;
        this.DmaId=DmaId;
        this.Code=Code;
    }

    public Cities() {
        this.CityId=CityId;
        this.CountryID = CountryID;
        this.RegionID = RegionID;
        this.City = City;
        this.Latitude = Latitude;
        this.Longitude= Longitude;
        this.TimeZone=TimeZone;
        this.DmaId=DmaId;
        this.Code=Code;
    }




}
