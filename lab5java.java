import java.util.Scanner;
import java.lang.Math;

class Account{

              String name = new String();
              int acc_no;
              double balance; 

              void setd(){
                           Scanner S = new Scanner(System.in);
                           System.out.println("Enter your name : ");
                           name = S.nextLine();
                           System.out.println("Enter Account number : ");
                           acc_no = S.nextInt();
                           System.out.println("Enter balance: ");
                           balance = S.nextDouble();
              }
              void display(){
                           System.out.println("Name  :  " + name);
                           System.out.println("Account number  :  " + acc_no);
                           System.out.println("Balance  :  " + balance);
              }
              Account(){}
}

class Savings extends Account{
              Scanner S = new Scanner(System.in);
              Savings(){
                           System.out.println("Facilities avilable are : ");
                           System.out.println("1.Withdraawal \n 2.Compound Intrest \n 3.No Cheque");
                           }

              void deposit(){
                           int choice;
                           double dep;
                           double wd;
                           System.out.println("Enter 1 to deposit : ");
                           choice = S.nextInt();
                           if(choice == 1){
                                         System.out.println("Enter the amount to deposit : ");
                                         dep = S.nextDouble();
                                         balance += dep;
                           }
                           else
                                         System.out.println("Invalid Input");
              }
              void intrest()
              {
                           System.out.println("Enter rate of interest  : ");
                           double r = S.nextDouble();
			   r = r/100;
                           System.out.println("Enter frequency of interest applied per time period  : ");
                           int n = S.nextInt();
                           System.out.println("Enter  time periods : ");
                           int t = S.nextInt();
                           double x = (1+(r/n));
                           double compond_intrest = balance*Math.pow(x,n*t);
                           System.out.println("Interest amount="+(compond_intrest-balance)+" \nBalance amount without interest is"+balance);
			   balance = compond_intrest;
                           System.out.println("Available balance after updating is : "+balance);
              }
              void withdraw(){
                  double wd;
                  int choice;
                           System.out.println("Enter 1 to withdraw : ");
                           choice = S.nextInt();
                           if(choice == 1){
                                         System.out.println("Enter the amount you want : ");
                                         wd = S.nextDouble();
                                         if(wd < balance){
                                                       balance = balance - wd;
                                                       System.out.println("Avilable balance is : " + balance);
                                         }
                                         else
                                              System.out.println("Insufficient balance");
                           }
                           else
                                   System.out.println("Invalid Input");
              }
}

class Current extends Account{
              Scanner S = new Scanner(System.in);
              Current()
              {
                           System.out.println("Cheque Facility available ");

              }
              void deposit()
              {
                           int choice;
                           double amount;
                           System.out.println("Press 1 to deposit ");
                           choice = S.nextInt();
                           if(choice==1)
                           {
                                         System.out.println("Enter amount to be deposited ");
                                         amount=S.nextDouble();
                                         balance += amount;
                           }
                           else
                                         System.out.println("Invalid Input");
              }

              void withdraw()
              {
                           System.out.println("Press 1 to withdraw ammount");
                           int choice=S.nextInt();
                           if(choice==1)
                           {
                                         System.out.println("Enter the amount to be withdrawn ");
                                         double wd=S.nextDouble();
                                         balance = balance - wd;
                                         System.out.println("Available Balance:"+balance);
                           }
                           else
                                         System.out.println("Invalid input");

                           if(balance<1000)
                           {
                                         System.out.println("You are running out of minimum balance \nAmount of rs 500 has been debited as service charge for having low balance");
                                         balance =balance - 500;
                                         System.out.println("Your Available Balance:"+balance);      
                           }        
              }
}

class Lab5
{
              public static void main(String xx[])
{
                           Scanner S = new Scanner(System.in);
                           int choice;
                           System.out.println("\nPress\n 1. for Savings account \n2.for Current account");
                           choice = S.nextInt();
                           switch(choice)
              {
                           case 1:
                                    Savings s1=new Savings();
                                     s1.setd();
                                     s1.display();
                                     s1.deposit();
                                     s1.intrest();
                                     s1.withdraw();
                                     break;
                           case 2:
                                    Current c1=new Current();
                                     c1.setd();
                                     c1.display();
                                     c1.deposit();
                                     c1.withdraw();
                                     break; 
                           default : System.exit(0);
              }
}

}