import java.util.Scanner;

public class Test9 {
    public static void main(String[] args){
		int row = 0;
		String space = "*";
		
		while (row < 5) {
			int star = 0;
			while (star <= row){
				System.out.printf("*");
				star = star + 1;
			}
			System.out.println("");
			row = row + 1;
		}
	}
}