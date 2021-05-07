import java.util.*;
import java.lang.*;
class Star
{
public static void main(String args[])
{
for(int i=1;i<=3;i++) //row
{
for (int j=1;j<=i;j++) // Column
{
System.out.print(" * ");
}
System.out.println();
}
}
}