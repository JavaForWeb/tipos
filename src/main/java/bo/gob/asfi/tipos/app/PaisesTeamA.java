package bo.gob.asfi.tipos.app;

/**
 * Created by alesanchez on 15/10/2016.
 */
public class PaisesTeamA {
    private int CountryId;
    private String Country;
    private String FIPS104;
    private String ISO2;

    public int getCountryId() {
        return CountryId;
    }

    public void setCountryId(int countryId) {
        CountryId = countryId;
    }

    public PaisesTeamA(int countryId, String country, String FIPS104, String ISO2, String ISO3, String ISON, String internet, String capital, String mapReference, String nationalitySingular, String nationalityPlural, String currency, String currencyCode, String population, String title, String comment) {
        CountryId = countryId;
        Country = country;
        this.FIPS104 = FIPS104;
        this.ISO2 = ISO2;
        this.ISO3 = ISO3;
        this.ISON = ISON;
        Internet = internet;
        Capital = capital;
        MapReference = mapReference;
        NationalitySingular = nationalitySingular;
        NationalityPlural = nationalityPlural;
        Currency = currency;
        CurrencyCode = currencyCode;
        Population = population;
        Title = title;
        Comment = comment;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getFIPS104() {
        return FIPS104;
    }

    public void setFIPS104(String FIPS104) {
        this.FIPS104 = FIPS104;
    }

    public String getISO2() {
        return ISO2;
    }

    public void setISO2(String ISO2) {
        this.ISO2 = ISO2;
    }

    public String getISO3() {
        return ISO3;
    }

    public void setISO3(String ISO3) {
        this.ISO3 = ISO3;
    }

    public String getISON() {
        return ISON;
    }

    public void setISON(String ISON) {
        this.ISON = ISON;
    }

    public String getInternet() {
        return Internet;
    }

    public void setInternet(String internet) {
        Internet = internet;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public String getMapReference() {
        return MapReference;
    }

    public void setMapReference(String mapReference) {
        MapReference = mapReference;
    }

    public String getNationalitySingular() {
        return NationalitySingular;
    }

    public void setNationalitySingular(String nationalitySingular) {
        NationalitySingular = nationalitySingular;
    }

    public String getNationalityPlural() {
        return NationalityPlural;
    }

    public void setNationalityPlural(String nationalityPlural) {
        NationalityPlural = nationalityPlural;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        Population = population;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    private String ISO3;
    private String ISON;
    private String Internet;
    private String Capital;
    private String MapReference;
    private String NationalitySingular;
    private String NationalityPlural;
    private String Currency;
    private String CurrencyCode;
    private String Population;
    private String Title;
    private String Comment;
}
