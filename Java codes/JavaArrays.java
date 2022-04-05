//defining and initalizing an array and printing its elements
public class JavaArrays {
    public static void main(String[] args) {
        int num=5;
int []A= new int[5];
int []B= new int[5];
int []C= new int[5];

for(int i=0;i<5;i++)
{
    A[i]=i;

}
    for(int i=0;i<5;i++)
    {
        B[i]=num;
        ++num;
    }
    System.out.println("Values in Array A:");
    for(int i=0;i<5;i++){
        System.out.println(A[i]);
    }
    System.out.println("Values in Array B:");
    for(int i=0;i<5;i++)
    {
        System.out.println(B[i]+" ");
    }
    for(int i =0;i<5;i++)
    {
        C[i]=A[i]+B[i];
    }
    System.out.println();
    System.out.println("The addition of these two matrices");
    for(int i=0;i<5;i++)
    {
    System.out.println(C[i]+" ");
    }
}}
