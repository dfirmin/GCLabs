import java.util.Scanner;
public class OddOrEven {
	
	public static boolean isEven (int number) {
		return number % 2 == 0;
	
	}
	
	
	
	public static void main(String[] args) {
		boolean continueTest = true;
		
		while (continueTest) {
			int num = 0;
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter a number between 1 and 100");
			num = scnr.nextInt();
				
			if (isEven(num) && (num > 60)) {
				System.out.println(num + " " + "Even");
			}
			else if (isEven(num) && (num >= 26) && (num <=  60)) {
				
				System.out.println("Even");
			}
			else if (isEven(num) && (num >= 2) && (num <=  25)) {
				
				System.out.println("Even and less than 25");
			}
			
			if (!isEven(num) && (num > 60)) {
				System.out.println(num + " " + "Odd and over 60");
			}
			
			else if (!isEven(num)) {
				
				System.out.println(num + " " + "and" + " " + "Odd");
			}
			if (continueTest) {
				System.out.println("Continue? (y/n):");
				String exitLab = scnr.next();
				if (exitLab.equals("n")) {
					System.out.print("Bye!");
					scnr.close();
					continueTest = false;
				}
				
			}
				
		}
	}
}
		
		



