package bo.gob.asfi.tipos.model.Adrian;

/**
 * Created by lumartinez on 15/10/2016.
 */
public class Countries {

    private String countryId;
    private String country;
    private String fIPS104;
    private String iSO2;
    private String iSO3;
    private String iSON;
    private String internet;
    private String capital;
    private String mapReference;
    private String nationalitySingular;
    private String nationalityPlural;
    private String currency;
    private String currencyCode;
    private String population;
    private String title;
    private String comment;

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getfIPS104() {
        return fIPS104;
    }

    public void setfIPS104(String fIPS104) {
        this.fIPS104 = fIPS104;
    }

    public String getiSO2() {
        return iSO2;
    }

    public void setiSO2(String iSO2) {
        this.iSO2 = iSO2;
    }

    public String getiSO3() {
        return iSO3;
    }

    public void setiSO3(String iSO3) {
        this.iSO3 = iSO3;
    }

    public String getiSON() {
        return iSON;
    }

    public void setiSON(String iSON) {
        this.iSON = iSON;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getMapReference() {
        return mapReference;
    }

    public void setMapReference(String mapReference) {
        this.mapReference = mapReference;
    }

    public String getNationalitySingular() {
        return nationalitySingular;
    }

    public void setNationalitySingular(String nationalitySingular) {
        this.nationalitySingular = nationalitySingular;
    }

    public String getNationalityPlural() {
        return nationalityPlural;
    }

    public void setNationalityPlural(String nationalityPlural) {
        this.nationalityPlural = nationalityPlural;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Countries(String countryId, String country, String fIPS104, String iSO2, String iSO3, String iSON, String internet, String capital, String mapReference, String nationalitySingular, String nationalityPlural, String currency, String currencyCode, String population, String title, String comment) {
        this.countryId = countryId;
        this.country = country;
        this.fIPS104 = fIPS104;
        this.iSO2 = iSO2;
        this.iSO3 = iSO3;
        this.iSON = iSON;
        this.internet = internet;
        this.capital = capital;
        this.mapReference = mapReference;
        this.nationalitySingular = nationalitySingular;
        this.nationalityPlural = nationalityPlural;
        this.currency = currency;
        this.currencyCode = currencyCode;
        this.population = population;
        this.title = title;
        this.comment = comment;
    }
}
