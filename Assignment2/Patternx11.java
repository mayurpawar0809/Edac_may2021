import java.util.*;
class Patternx11
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)//row
{
for(int j=5;j>=i;j--)//space c
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)//tri 1
{
System.out.print("*");
}
for(int l=2;l<=i;l++)//tri 2
{
System.out.print("*");
}
System.out.println();
}
}
}
