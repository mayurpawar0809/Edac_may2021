import java.util.*;
class Patternx8
{
public static void main(String args[])
{
for(int i=6-1;i>=1;i--)//row
{
for(int j=1;j<=i;j++)//column:space
{
System.out.print(" ");
}
for(int j=i;j<=5;j++)//column:star
{
System.out.print( j+" ");
}
System.out.println();
}
}
}