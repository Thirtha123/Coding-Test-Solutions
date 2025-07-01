package p4;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        int a = scanner.nextInt();

	        int limit = a;
	        if (a % 2 == 0) {
	            limit = a - 1;
	        }

	        int printed = 0;
	        int num = 1;

	        while (printed < limit) {
	            System.out.print(num);
	            printed++;
	            num += 2;

	            if (printed < limit) {
	                System.out.print(", ");
	            }
	        }

	        scanner.close();
	    }


}
