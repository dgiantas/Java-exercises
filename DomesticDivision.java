
package mypackage;

public class DomesticDivision extends Division {
    DomesticDivision domestic;
    private String state;

    public DomesticDivision(String state, String companyName, int accountNumber) {
        super(companyName, accountNumber);
        this.state = state;
    }

   
    @Override
    void display() {
        System.out.println("International division : country: " + domestic.getState()+ "language: " + " company name:" +domestic.getCompanyName() + "account number: " +domestic.getAccountNumber() );
        
    }

    public String getState() {
        return state;
    }
    
}
