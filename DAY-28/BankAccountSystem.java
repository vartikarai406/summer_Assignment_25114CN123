import java.util.*;

class Account {

    int accNo;
    String name;
    double balance;

    Account(int a,String n,double b){
        accNo=a;
        name=n;
        balance=b;
    }
}

public class BankAccountSystem {

static Scanner sc=new Scanner(System.in);
static Account acc;

public static void main(String args[]){

while(true){

System.out.println("\n1.Create Account\n2.Deposit\n3.Withdraw\n4.Show Balance\n5.Exit");
int ch=sc.nextInt();

switch(ch){

case 1:
System.out.print("Account No:");
int no=sc.nextInt();
sc.nextLine();

System.out.print("Name:");
String n=sc.nextLine();

System.out.print("Balance:");
double b=sc.nextDouble();

acc=new Account(no,n,b);
System.out.println("Account Created");
break;


case 2:
System.out.print("Amount:");
double d=sc.nextDouble();
acc.balance+=d;
System.out.println("Deposited");
break;


case 3:
System.out.print("Amount:");
double w=sc.nextDouble();

if(w<=acc.balance){
acc.balance-=w;
System.out.println("Withdraw Successful");
}
else
System.out.println("Insufficient Balance");

break;


case 4:
System.out.println("Balance:"+acc.balance);
break;


case 5:
System.exit(0);

}

}

}

}