import java.io.*;
import java.util.Scanner;
//Scanner scan = new Scanner(System.in);
public class bills
{
  public static void main(String args[])
  {
    int i,num=3;
	int bill,fnl,tax;
    System.out.print("give units consumed");
	Scanner scan = new Scanner(System.in);
	int units= scan.nextInt();
	 if(units<=100)
	 {
		 bill=(int)(units*1+units*0.1+50);
		 System.out.println(bill);
	 }
	  else if(units>100&&units<=200)
	  {
		  fnl=(int)(100*1+(units-100)*2);
		  tax=(int)(fnl*0.1);
		  bill=(int)(fnl+tax+50);
		  System.out.println(bill);
	  }
	  else if(units>200&&units<=300)
	  {
		  fnl=(int)(100*1+100*2+(units-200)*3);
		  tax=(int)(fnl*0.1);
		  bill=(int)(fnl+tax+50);
		  System.out.println(bill);
	  }
	  else if(units>300&&units<=500)
	  {
		  fnl=(int)(100*1+100*2+100*3+(units-300)*4);
		  tax=(int)(fnl*0.1);
		  bill=(int)(fnl+tax+50);
		  System.out.println(bill);
	  }
	  else if(units>500)
	  {
		  fnl=(int)(100*1+100*2+100*3+200*4+(units-500)*5);
		  tax=(int)(fnl*0.1);
		  bill=(int)(fnl+tax+50);
		  System.out.println(bill);
	  }
    
    
  }
}     