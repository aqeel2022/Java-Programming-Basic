public class SimpleMaths{
    
     public static void main(String []args){
        
    int x=20;
    int y=10;
    SimpleMaths obj = new SimpleMaths();
    int Res=obj.add(x,y);
       System.out.println("Result after addition is "+Res);
    
       int Subs=obj.sub(x,y);
       System.out.println("Result after substraction is "+Subs);
       
       int Mult=obj.mult(x,y);
       System.out.println("Result after multiplication is "+ Mult);
       int Div = obj.div(x,y);
       System.out.println("Result after division is "+ Div);
     }
     
     public static int add(int num1,int num2)
     {
         int Result=num1+num2;
         return Result;
     }
     
     public static int sub(int num1,int num2)
     {
     int Result =num1-num2;
     return Result;
     }
     
    public static int mult(int num1,int num2)
    {
    int Result =num2*num1;
    return Result;
}

public static int div(int num1, int num2)
{
    int Result=num1/num2;
    return Result;
}
}
