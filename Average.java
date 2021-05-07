import java.util.*;
import java.lang.*;
class Average
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.print("Input Three values");
int i=sc.nextInt();
int j=sc.nextInt();
int k=sc.nextInt();
int c=(i+j+k)/3;
System.out.println("Average:"+c);
}
}