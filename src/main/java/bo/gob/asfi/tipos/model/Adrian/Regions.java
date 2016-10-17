package bo.gob.asfi.tipos.model.Adrian;

/**
 * Created by lumartinez on 15/10/2016.
 */
public class Regions {
    private String regionId;
    private String countryId;
    private String region;
    private String code;
    private String aDM1Code;

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getaDM1Code() {
        return aDM1Code;
    }

    public void setaDM1Code(String aDM1Code) {
        this.aDM1Code = aDM1Code;
    }

    public Regions(String regionId, String countryId, String region, String code, String aDM1Code) {
        this.regionId = regionId;
        this.countryId = countryId;
        this.region = region;
        this.code = code;
        this.aDM1Code = aDM1Code;
    }
}
