import java.util.*;
import java.lang.*;
class Patterny8
{
public static void main(String args[])
{
for(int i=1;i<9;i++)// row
{
for(int j=1;j<=i;j++)//column
{
System.out.print("*");
}
System.out.println();
}
for(int i=1;i<=9;i++)// row
{
for(int j=9;j>=i;j--)//column
{
System.out.print("*");
}
System.out.println();
}
}
}
