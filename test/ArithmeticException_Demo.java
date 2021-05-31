//arithmetic exceptiom
class Arithmetc {
public static void main (String args[])
{
try{
int a=10 ,b=0;
int c=a/b;
System.out.println("result:"+c);
}
catch(ArithmeticException e)
{
 System.out.println ("Can't divide a number by 0");
 }
 }
 }