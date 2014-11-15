package exercises;
//Write a BankAccount class. It should have actHolderName, accountNumber, initialAmount properties. 
//AccountNumber should get incremented and assigned automatically to the object everytime when a BAcc object is created.
//Create BankAccountCaller class. Create 5 BankAccount objects and print accountNumber for every object. 

public class Exercise11 {
    
    private String acctHolderName;
    private int acctNumber;
    private int initialAmount;
     
    private static int incrementAccount;
     
    public Exercise11(String acctHolderName, int initialAmount){        
        this.acctHolderName = acctHolderName;
        this.initialAmount = initialAmount;
        //this is a static variable. which will be shared across all the objects
        //Every time constructor will get called, this value
        // will be incremented by 1.
        incrementAccount++;
        acctNumber = incrementAccount;
    }   
 
    public String getAcctHolderName() {
        return acctHolderName;
    }
 
    public void setAcctHolderName(String acctHolderName) {
        this.acctHolderName = acctHolderName;
    }
 
    public int getAcctNumber() {
        return acctNumber;
    }
 
    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }
 
    public int getInitialAmount() {
        return initialAmount;
    }
 
    public void setInitialAmount(int initialAmount) {
        this.initialAmount = initialAmount;
    }   
}