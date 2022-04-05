import java.util.Scanner;
public class LoopingClass {

    public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
System.out.println("Enter your age: ");
int age =scan.nextInt();
while(age!=25)
{
    System.out.println("Incorrect age please enter again :");
    age =scan.nextInt();
}   
System.out.println("Thank you for correct age");
}
}