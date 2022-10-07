import java.util.Scanner;
public class bbc {

      public static void main(String[] args){
		  int total = 0;
		   int gradeCounter = 0;
		    int aCount = 0;
			 int bCount = 0;
			  int cCount = 0;
			   int dCount = 0;
			    int eCount = 0;
				
		  int grade;
		  System.out.println("Enter you grade");
		  Scanner scanner = new Scanner(System.in);
		  grade = scanner.nextInt();
		  switch (grade / 10){
			case 10 :
			case 9 :
			System.out.println("A");
			break;
		  }
		  switch (grade / 10){
			case 8 :
			System.out.println("B");
			break;
		  }
		  switch (grade / 10){
			case 7 :
			System.out.println("C");
			break;
		  }
		  switch (grade / 10){
			case 6 :
			System.out.println("D");
			break;
		  }
		  {
		  default: 
		  System.out.println("E");
		  break;
		  }
		  
	
}
}