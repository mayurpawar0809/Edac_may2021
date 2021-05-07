import java.util.*;
class Patternx10
{
public static void main(String args[])
{
int alpha=64;
for(int i=5;i>=1;i--)//row
{
for(int j=1;j<=i;j++)//column:space
{
System.out.print(" ");
}
for(int j=5;j>=i;j--)//column:star
{
System.out.print((char)(alpha+j)+" ");
}
System.out.println();
}
}
}