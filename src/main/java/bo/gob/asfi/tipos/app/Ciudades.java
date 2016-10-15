package bo.gob.asfi.tipos.app;

/**
 * Created by alesanchez on 15/10/2016.
 */
public class Ciudades {
    private int cityId;
    private int countryId;
    private int regionId;

    @Override
    public String toString() {
        return "|"  + String.format("%-30s", this.city)   + "|" + String.format("%-30s", this.countryId) + "|" + String.format("%-30s", this.latitude) + "|" + String.format("%-30s", this.longitude) + "|" ;
    }

    public Ciudades(int cityId, int countryId, int regionId, String city, double latitude, double longitude, String timeZone, int dmaID, String code) {
        this.cityId = cityId;
        this.countryId = countryId;
        this.regionId = regionId;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeZone = timeZone;
        this.dmaID = dmaID;
        this.code = code;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public int getDmaID() {
        return dmaID;
    }

    public void setDmaID(int dmaID) {
        this.dmaID = dmaID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String city;
    private double latitude;
    private double longitude;
    private String timeZone;
    private int dmaID;
    private String code;
}
