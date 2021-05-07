import java.util.*;
import java.lang.*;
class Multifunction
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.print("Input First No:");
int i=sc.nextInt();
System.out.print("Input Second No:");
int j=sc.nextInt();
System.out.println(i+"+"+j+"="+(i+j));
System.out.println(i+"-"+j+"="+(i-j));
System.out.println(i+"*"+j+"="+(i*j));
System.out.println(i+"/"+j+"="+(i/j));
System.out.println(i+"%"+j+"="+(i%j));

}
}