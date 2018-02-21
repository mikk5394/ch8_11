package ch8;
/*
 Suppose the following BankAccount class has been created:
    1  // Each BankAccount object represents one user's account
    2  // information including name and balance of money.
    3  public class BankAccount {
    4      String name;
    5      double balance;
    6
    7      public void deposit(double amount) {
8
9} 10
balance = balance + amount;
11      public void withdraw(double amount) {
12
13 } 14 }
balance = balance - amount;
Add a field to the BankAccount class named transactionFee for a real number representing an
amount of money to deduct every time the user withdraws money. The default value is $0.00,
but the client can change the value. Deduct the transaction fee money during every withdraw
call (but not from deposits). Make sure that the balance cannot go negative during a withdrawal.
If the withdrawal (amount plus transaction fee) would cause it to become negative, don’t modify
the balance at all.
 */
public class ch8_11_BankAccount {

    String name;
    double balance;
    double transactionFee = 0.0;

    public void deposit(double amount){
        balance = balance + amount;
    }

    //sørger for at transactionFee ikke kan få ens balance til at blive negativ ved at bruge et if- statement
    public void withdraw(double amount){
        if (balance-amount-transactionFee < 0){

        } else {
            balance = balance - amount - transactionFee;
        }
    }
    //En af kravene er at clienten skal kunne ændre transactionfee'en.
    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }
}

