import java.util.*;
class Patternz4
{
public static void main(String args[])
{
for(int i=1;i<9;i++)//row
{
for(int j=8;j>=i;j--)//column:space
{
System.out.print(" ");
}

for(int k=1;k<=i;k++)//column:tr1
{
System.out.print(""+k);
}

//for(int z=1;z<=8;i++)//row
for(int l=i-1;l>=1;l--)//column:tr2


{
System.out.print(""+l);
}

System.out.println();
}
}
}

