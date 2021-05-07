import java.util.*;
class Patternz5
{
public static void main(String args[])
{
for(int i=10-1;i>=1;i--)//row
{
for(int j=1;j<=i;j++)//column:space
{
System.out.print(" ");
}

for(int k=i;k<=9;k++)//column:tr1
{
System.out.print(""+k);
}

//for(int z=1;z<=8;i++)//row
for(int l=i;l<=9-1;l++)//column:tr2


{
System.out.print(""+l);
}

System.out.println();
}
}
}


