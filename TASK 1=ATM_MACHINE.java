import java.util.*;
class ATM extends Balance
{
    Scanner sc=new Scanner(System.in);
    void options()
    {
        System.out.println("1.CHECK ACCOUNT BALANCE");
        System.out.println("2.WITHDRAW");
        System.out.println("3.DEPOSIT");
        System.out.println("4.EXIT");
        System.out.println("SELECT OPTION BETWEEN 1-4");
    }
    void withdraw()
    {
        System.out.println("ENTER AMOUNT TO BE WITHDRAWN");
        int withdraw=sc.nextInt();
        if(withdraw>balance)
        {
            System.out.println("INSUFFICIENT BANK BALANCE");
            System.out.println();
        }
        else
        {
            System.out.println(withdraw+" WITHDRAWN SUCCESSFULLY");
            System.out.println("CURRENT BALANCE= "+(balance-withdraw));
            System.out.println();
        }
    }
    void deposit()
    {
        System.out.println("ENTER AMOUNT TO BE DEPOSITED");
        int deposit=sc.nextInt();
        System.out.println(deposit+" DEPOSITED SUCCESSFULLY");
        System.out.println("CURRENT BALANCE= "+(balance+deposit));
        System.out.println();
    }
}

class Balance
{
   int balance=70000;
   void check_balance()
   {
       System.out.println("YOUR BALANCE IS: "+balance);
       System.out.println();
   }
}

public class ATM_MACHINE
{
    public static void main(String[] args)
    {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("WELCOME TO ATM");
            ATM user1 = new ATM();
            user1.options();
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    user1.check_balance();
                    break;
                case 2:
                    user1.withdraw();
                    break;
                case 3:
                    user1.deposit();
                    break;
                case 4:
                    System.out.println("THANK YOU FOR USING ATM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ENTER OPTION BETWEEN 1-4");
            }
        }
    }
}
