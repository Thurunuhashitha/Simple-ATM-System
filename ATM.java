import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        
        double account_balance=120000.75;
  
        Scanner what=new Scanner(System.in);
        
        System.out.println("01) Account Balance");
        System.out.println("02) Deposit");
        System.out.println("03) Withdraw");
        System.out.println("04) Exite");
        int x=what.nextInt();
        
        
        switch (x) {
            case 1:
                System.out.println("Your Account Balance is"+ account_balance );
                return;

            case 2:
                //Scanner ammount=new Scanner(System.in);
                System.out.print("Enter Your Ammount :-" );
                double new_ammount=what.nextDouble();
                account_balance=account_balance+new_ammount;
                System.out.print("new Account Balance is :-"+account_balance);
                return;
                
            case 3:
                //Scanner ammoun=new Scanner(System.in);
                System.out.print("Enter Your Ammount :-" );
                double new_ammoun=what.nextDouble();
                account_balance=account_balance-new_ammoun;
                System.out.print("new Account Balance is :-"+account_balance);
                return;

            case 4:
                System.out.println("THANK YOU!"  );
                break;
         
            default:
                System.out.println("error");
                return;
        }
 
        
    }
     
}