
public class Student1
{
int rollno;
 String name;
 Styring percentage ;
  String division;
 void get(int n,String m,String x,String per)
 {
 rollno=n;
 name=m;
  division=x;
  percentage=per;
 }
 void put()
 
 {
 System.out.println("Roll no:"+rollno);
  System.out.println("Name:"+name);
   System.out.println("Division:"+division);
   System.out.println("percentage:"+percentage);
   System.out.println();
   
 }
 public static void main (String args[])
 {
 Student s=new Student1();

 s.get(1,"sandy","A",56.54F);
 s.put();
 Student s1=new Student1();
 s1.get(5,"mxy","B",45.89F);
 s1.put();
 if(s.percentage>s1.percentage)
 System.out.println(s.percentage+"is max");
 else
 System.out.println(s1.percentage+"is min");
 
 }
 }
 