import java.util.*;
class Patternx15
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)//row
{
for(int j=5;j>=i;j--)//column
{
System.out.print(j+" ");
}
System.out.println();
}
}
}