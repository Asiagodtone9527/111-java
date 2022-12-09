import java.net.*;
import java.util.*;

public class Test21 {
	public static void main(String[] args) {
			int[] iArr = {2, 7, 3, 4, 9, 6};
			int t;
			for (int x = 0; x < iArr.length; x++) {
				for (int j = x+1; j < iArr.length; j++) {
					if (iArr[x] > iArr[j]) {
						t = iArr[x];
							iArr[x] = iArr[j];
							iArr[j] = t; 
					}
				}
			}
			for (int x = 0; x<iArr.length; x++) {
				System.out.print("<" + iArr[x] + ">");
			}
		}
	}

