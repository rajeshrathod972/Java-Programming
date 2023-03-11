package classes_and_object;


class account{
//attribute
int accountNo;
String name;
float balance;


//actions


void createAccount(int ac_no,String n,float bl){
          accountNo=ac_no;
          name=n;
          balance=bl;
}

void print(){
    System.out.println("**************************************");
    System.out.println("account number:"+accountNo);
    System.out.println("Name:"+name);
    System.out.println("Balance:"+balance);
}

void deposite(float amt){
    balance+=amt;

}

void withdraw(float amt){
    balance-=amt;
}
}


public class bank_account {
    public static void main(String[] args) {
        account c1=new account();
        c1.createAccount(895685, "Rajesh Rathod", 15000);
        account c2=new account();
        c2.createAccount(586695, "Gopal Chauhan", 10000);
        c2.deposite(5000);
        c1.deposite(2000);
        c1.print();
        c2.print();
        c1.withdraw(7000);
        c1.print();;

    }
}
