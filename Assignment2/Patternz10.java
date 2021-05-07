import java.util.*;
public class Patternz10
{
    public static void main(String[] args)
{
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
    System.out.print("Enter Symbol : ");
    char c = sc.next().charAt(0);
	int i=n;
	int j;
	while(i>0)
{
	if(i==1 || i==n)
{
    j=1;
    while(j <=i)
{
    System.out.print(c);
     j++;
}
}
     else
{
     j=1;
      while(j<=i)
{
     if(j==1 || j==i)
     System.out.print(c);
      else
     System.out.print(" ");
	  j++;
}
}
     System.out.println();
       i--;
}             
}
}