
package mypackage;


public abstract class Division  {
     private  String companyName;
      private int accountNumber;

    public String getCompanyName() {
        return companyName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Division(String companyName, int accountNumber) {
        this.companyName = companyName;
        this.accountNumber = accountNumber;
    }
      
      abstract void display();     
}
