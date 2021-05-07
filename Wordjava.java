import java.util.Scanner;
class Wordjava
{	
  
  public static void main(String args[])
    {
    System.out.println();
    System.out.println("BIG JAVA Matrixprogram"); System.out.println("");
    
    System.out.println("Enter the number of rows and colomnns minimum 4x22:");
    Scanner mk=new Scanner(System.in);
    int rows=mk.nextInt();
    System.out.println("Number of rows entered:"+rows);
    System.out.println("Enter the number of coloumns");
    int coloumns=mk.nextInt();
    System.out.println("Number of coloumns entered:"+coloumns); 

    System.out.println("");
    System.out.println("This is your matrix of size:"+rows+"X"+coloumns);
    System.out.println("");
    
   
    for(int i=1;i<=rows;i++)
    {

    for(int j=1;j<=coloumns;j++)  //J==1X4, 2X4, 3X1, 3X4, 4X3, 4x2 
    {

    if( (i==1 && j==4) || (i==2 && j==4) || (i==3 && j==1) || (i==3 && j==4) || (i==4 && j==3)  || (i==4 && j==2) )   
    System.out.print("J");  //printing J
    else 
    if( (i==1 && j==9) || (i==2 && j==8) || (i==2 && j==10) || (i==3 && j==7) || (i==3 && j==8) || (i==3 && j==9) || (i==3 && j==10) ||       (i==3  && j==11) || (i==4 && j==6) || (i==4 && j==12) ) //A 1X9, 2X8, 2x10, 3X7, 3X8, 3X9,3X10, 3X11 4X6,4X12
     System.out.print("A");  //printing A
    else
    if( (i==1 && j==11) || (i==1 && j==17) || (i==2 && j==12) || (i==2 && j==16) || (i==3 && j==13) || (i==3 && j==15) ||  (i==4 && j==14) )
     System.out.print("V"); //printing V                               //V== 1X11, 1X17, 2X12, 2X16, 3X13, 3X15, 4X14
    else
    if( (i==1 && j==19) || (i==2 && j==18) || (i==2 && j==20) || (i==3 && j==17) || (i==3 && j==18) || (i==3 && j==19) || (i==3 && j==20) ||   (i==3  && j==21) || (i==4 && j==16) || (i==4 && j==22) )  //A== 1X19, 2X18, 2X20, 3X17,3X18,3X19,3X20,3X21,4X16,4X22
    System.out.print("A");  //printing A
    else
    System.out.print(" ");  //printing space elsewhere

     }
    
    System.out.println();
    }

    System.out.println("");
    }
    

    
}