import java.util.*;
class Patternz3
{
public static void main(String args[])
{
for(int i=1;i<=9;i++)//row
{
for(int j=8;j>=i;j--)//column:space
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)//column:star
{
System.out.print(" *");
}
System.out.println();
}
}
}