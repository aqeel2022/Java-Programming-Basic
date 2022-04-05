public class AreaFunction{
    
     public static void main(String []args){
        
    int h=10;
    int b=20;
    int Rect=area(h,b);
    System.out.println("Area is "+Rect);
     float r=3.45f;
     float s=5.43f;
     float Circ=area(r,s);
     System.out.println("Area Circ "+Circ);
     }

     public static int area(int h,int b)
     {
         int area=h*b;
         return area;
     }
     public static float area(float r, float s)
     {
     float area=r*s;
     return area;
     }
}
