import java.util.*;
import java.lang.*;
class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.print("Enter the the value of i ");
int i=sc.nextInt();
System.out.print("Enter the the value of j ");
int j=sc.nextInt();
int temp;
System.out.println("before swaping no:"+i+""+j);
temp=i;
i=j;
j=temp;
System.out.println("After swaping  no:"+i+""+j);
System.out.println();
}
}