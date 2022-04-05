//Inheritance with Constructor
import java.util.Scanner;
public class Vehicle {
    int cost = 0;
    int mileage= 0;
public Vehicle(int c, int m)
{
    cost = c;
    mileage = m;

}
    public void show_vehicle_details(){
    System.out.println("I am a vehicle");
    System.out.println("My cost is  "+cost);
    System.out.println("mileage is "+mileage); 
    }   
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter the cost");
    int cost = scan.nextInt();
    System.out.println("Enter the milegae");
    int mileage = scan.nextInt();
    System.out.println("Enter the Color");
    String color = scan.next();
    System.out.println("Enter the Owner");
    String Owner = scan.next();
    System.out.println("Enter the tyers");
    int tyers = scan.nextInt();
    Car c = new Car(color, mileage, tyers, Owner, cost);
    c.show_vehicle_details();
    
    c.show_car();
   
}
}