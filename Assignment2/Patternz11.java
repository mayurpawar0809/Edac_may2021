import java.util.*;
class Patternz11
{
public static void main(String args[])
{
for(int i=1;i<=6;i++)//row
{
for(int j=6;j>=i;j--)//column:space
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)//column:star
{
System.out.print(  " * " );
}
System.out.println();
}
}
}