package pl.sdacademy.unit.test.basic.exercises.task3;

public class Account {

    private float balance;
    private final String accountNumber;
    private final Customer customer;

    public Account(float balance, String accountNumber, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void transferMoney(Account account, float amount){
        if (validate(account)&&ifThereIsEnoughMoneyToTransferFromAccount(amount)){
            this.balance-=amount;
            account.balance+=amount;
        }

//        this.balance-=amount;
//        account.balance+=amount;
    }

    private boolean validate(Account account){
        return validateStringAccountNumber(this.accountNumber ) && validateStringAccountNumber(account.accountNumber);


    }

    private boolean validateStringAccountNumber(String accountNumber){
//        if (accountNumber.length()!=26 || accountNumber.matches("\\d+")){
//            return false;
//        }
        return accountNumber.length()==26 && accountNumber.matches("\\d+");
    }

    private boolean ifThereIsEnoughMoneyToTransferFromAccount(float amount){
        if (this.balance-amount<0){
            return false;
        }
        return true;
    }


}
