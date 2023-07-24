package HouseRobber;
import java.util.Scanner;

public class HouseRobber {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int c=0;
	   int d=0;
	   int n=sc.nextInt();
	   int ar[]=new int[n];
	   for(int i=0;i<n;i++) {
		   ar[i]=sc.nextInt();
	   }
	
	  for(int i=0;i<n;i++) {
		  if(i%2==0) {
			  c+=ar[i];
		  }
	  }System.out.println(c);
	   
	   

	}

}
