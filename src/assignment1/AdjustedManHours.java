package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdjustedManHours extends ManHours{
	
	public static double adjustedManHours;
	
	public AdjustedManHours() {
		
	}
	
	public AdjustedManHours(int totalAT, int unadjustedUCP, double szUC, double ucp, double manHours, double adjustedManHours) {
		super(totalAT, unadjustedUCP, szUC, ucp, manHours);
		this.adjustedManHours = adjustedManHours;
	}

    	public void adjustingManHours() {
    		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean repeat = true;
		double rcp = 0.0;

		System.out.println("\nAdjusting Man-hours for Risk");
		System.out.println("==============================");
		System.out.print("Please key in the risk coefficient percentage : ");
		while (repeat) {
		    try {
			rcp = scan.nextDouble();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in number.");
			System.out.print("Please key in the risk coefficient percentage : ");
			scan.next();
			repeat = true;
		    }
		}

		adjustedManHours = (1.0 + rcp) * ManHours.manHours;
		System.out.println("\n---------------------------------------");
		System.out.printf("Adjusted Man-Hours are %.2f" , adjustedManHours);
		System.out.println("\n---------------------------------------");
	}
}
