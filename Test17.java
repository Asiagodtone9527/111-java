import java.util.Scanner;

public class Test17 {
    public static void main(String[] args){
		for(int i=1; i<=6;i++){
			for(int k = 6; k >=1;k--){
				if(i< k)
					System.out.printf("*");
				else
					System.out.print(i-k+1);
			}
			System.out.println("");
			}
		}
	}

