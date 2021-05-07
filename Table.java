import java.util.*;
import java.lang.*;
public class Table
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.print("Input Number:");
int i= sc.nextInt();
for (int j=1;j<=10;j++)
{
System.out.println(i+" * "+j+" = "+(i*j));
}
}
}