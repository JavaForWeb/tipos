package bo.gob.asfi.tipos.model.Adrian;

/**
 * Created by lumartinez on 15/10/2016.
 */
public class City {
    private String cityId;
    private String countryID;
    private String regionID;
    private String cityName;
    private String  latitude;
    private String  longitude;
    private String  timeZone;
    private String  dmaId;
    private String code;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDmaId() {
        return dmaId;
    }

    public void setDmaId(String dmaId) {
        this.dmaId = dmaId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City(String cityId, String countryID, String regionID, String cityName, String latitude, String longitude, String timeZone, String dmaId, String code) {
        this.cityId = cityId;
        this.countryID = countryID;
        this.regionID = regionID;
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeZone = timeZone;
        this.dmaId = dmaId;
        this.code = code;
    }
}
