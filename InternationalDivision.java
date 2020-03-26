
package mypackage;


public class InternationalDivision extends Division {
    InternationalDivision international;
    private String country;

    public InternationalDivision(String country, String language, String companyName, int accountNumber) {
        super(companyName, accountNumber);
        this.country = country;
        this.language = language;
    }
    private String language;


    @Override
    void display() {
        System.out.println("International division : country: " +international.getCountry()+ "language: " +international.getLanguage()+ " company name:" +international.getCompanyName() + "account number: " +international.getAccountNumber() );
        
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
   
}
