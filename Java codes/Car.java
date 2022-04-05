puassblic cl Car extends Vehicle {

    String color= "blue";
    int tyers = 4;
    String Owner = "Ali";

    public Car(String col, int c, int ty, String O, int m)
    {
        super(c,m);
        color = col;
        tyers = ty;

    }
    public void show_car()
    {
    System.out.println("My color is "+ color);
    System.out.println(" I hv tyers "+ tyers);
    System.out.println("My owner name is "+ Owner);
    }
}
