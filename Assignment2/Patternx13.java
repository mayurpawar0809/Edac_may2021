import java.util.*;
class Patternx13
{
public static void main(String args[])
{
int alpha=64;
for(int i=1;i<=5;i++)//row
{
for(int j=4;j>=i;j--)//column:space
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)//column:star
{
System.out.print((char)(alpha+i)+" ");
}
System.out.println();
}
}
}