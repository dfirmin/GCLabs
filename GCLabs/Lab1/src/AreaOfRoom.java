
import java.util.Scanner;

public class AreaOfRoom {
	// method to return area
	public static double getArea(double x, double y) {
		double areaOfRoom = x * y;
		return areaOfRoom;
		
	}
	// method to return perimeter
	public static double getPerimeter(double x, double y) {
		double lengthOfRoom = (2 * x) + (2 * y);
		return lengthOfRoom;
		
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus' Room Detail Generator");
		boolean continueGen = true;
		double roomLength = 0.0;
		double roomWidth = 0.0;
		String continueYN;
		
		
		while (continueGen) {
			System.out.println("Enter Length:");
			roomLength = scnr.nextDouble();
			System.out.println("Enter Width:");
			roomWidth =  scnr.nextDouble();
			
			
			System.out.println("Area:" + getArea(roomLength, roomWidth));
			System.out.println("Perimeter:" + getPerimeter(roomLength, roomWidth));
			
			System.out.println("Continue? Y/N");
			continueYN = scnr.next().toLowerCase();

			if (continueYN.equals("n")) {
				scnr.close();
				continueGen = false;
				System.out.println("Program has stopped.");
			}
			else if (continueYN.equals("y")) {
				continueGen = true;
				
			}
			else {
				System.out.println("Enter Y or N.");
			}
		}
		
		
	}
}

