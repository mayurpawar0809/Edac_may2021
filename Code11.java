import java.util.*;
import java.lang.*;
public class Code11
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
{
System.out.print("Input radius:");
double radius=sc.nextDouble();
double area=Math.PI * (radius*radius);
System.out.println("The area of circle:" +area);
double perimeter= Math.PI*2*radius;
System.out.println("The perimeter of circle:" +perimeter);
}
}
}