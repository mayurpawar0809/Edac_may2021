import java.util.*;
import java.lang.*;
class Star2
{
public static void main(String args[])
{
for(i=1;i<=7;i++)// row
{
for(j=1;j<=i;j++)//column
{
System.out.print("*");
}
for(i=1;i<=7;i++)// row
{
for(j=7;j>=i;j--)//column
{
System.out.print("*");
}
}
}
}
}