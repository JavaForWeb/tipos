package bo.gob.asfi.tipos.app;

/**
 * Created by alesanchez on 15/10/2016.
 */
public class Region {
    private int RegionId;
    private int CountryId;
    private String Region;

    public int getRegionId() {
        return RegionId;
    }

    public Region(int regionId, int countryId, String region, String code, String ADM1Code) {
        RegionId = regionId;
        CountryId = countryId;
        Region = region;
        Code = code;
        this.ADM1Code = ADM1Code;
    }

    public void setRegionId(int regionId) {
        RegionId = regionId;
    }

    public int getCountryId() {
        return CountryId;
    }

    public void setCountryId(int countryId) {
        CountryId = countryId;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getADM1Code() {
        return ADM1Code;
    }

    public void setADM1Code(String ADM1Code) {
        this.ADM1Code = ADM1Code;
    }

    private String Code;
    private String ADM1Code;
}
