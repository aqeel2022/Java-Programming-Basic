import java.util.Scanner;
public class AtmPin {
    public static void main(String[] args) {
        int amount=0;
        int total_bank_balance=340000;
        int remaining_balance=0;
    Scanner scan =new Scanner(System.in);
System.out.println("=======>WELCOME TO SINDH BANK<=========");
System.out.println("********===========*********");
System.out.print("\n");
System.out.println("-----Enter the 4 digit pin------ :");
int PIN_Entered=scan.nextInt();
if (PIN_Entered == 1234)
{
    System.out.println("Please Enter the amount your want to withdraw:--");
     amount = scan.nextInt();
     remaining_balance = total_bank_balance - amount;
}
else if (PIN_Entered !=1234)
{
    System.out.println("-------Sorry Wrong Pin code Your transaction declined------\n ");
}
System.out.print("Thank you! Do you confirm your transaction, Y/N : ");
    char choice = scan.next().charAt(0);
  if (choice == 'Y')    
    {
    System.out.println("Thank you your transaction is confirmed, You withdrew "+ amount);
    System.out.println("*******************************");
    System.out.println("Your remaining balance is  "+ remaining_balance);
    }
    else{
        System.out.println("Transaction Declined...!");
    }
    
}
}