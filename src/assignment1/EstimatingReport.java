package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstimatingReport extends AdjustedManHours {
	
	public EstimatingReport() {
		
	}
	
	public EstimatingReport(int totalAT, int unadjustedUCP, double szUC, double ucp, double manHours, double adjustedManHours) {
		super(totalAT, unadjustedUCP, szUC, ucp, manHours, adjustedManHours);
	}

	public void weightingReports() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean repeat = true;
		int qtySimpleRT = 0, qtyAverageRT = 0, qtyComplexRT = 0;
		int averageSRT = 0, averageART = 0, averageCRT = 0;
		int subTotalSRT, subTotalART, subTotalCRT;
		int reportingManHours;
		double totalManHours;

		System.out.println("\nWeighting Reports for Complexity");
		System.out.println("==================================");
		System.out.print("Quantity of Simple Report Type : ");
		while (repeat) {
		    try {
			qtySimpleRT = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("Quantity of Simple Report Type : ");
			scan.next();
			repeat = true;
		    }
        	}

		System.out.print("Average Man-hours of Simple Report Type : ");
		while (repeat) {
		    try {
			averageSRT = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("Average Man-hours of Simple Report Type : ");
			scan.next();
			repeat = true;
		    }
		}

		System.out.print("Quantity of Average Report Type : ");
		while (repeat) {
		    try {
			qtyAverageRT = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("Quantity of Average Report Type : ");
			scan.next();
			repeat = true;
		    }
		}

		System.out.print("Average Man-hours of Average Report Type : ");
		while (repeat) {
		    try {
			averageART = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("Average Man-hours of Average Report Type : ");
			scan.next();
			repeat = true;
		    }
		}

		System.out.print("Quantity of Complex Report Type : ");
		while (repeat) {
		    try {
			qtyComplexRT = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("Quantity of Complex Report Type : ");
			scan.next();
			repeat = true;
		    }
		}

		System.out.print("Average Man-hours of Complex Report Type : ");
		while (repeat) {
		    try {
			averageCRT = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("Average Man-hours of Complex Report Type : ");
			scan.next();
			repeat = true;
		    }
		}

		subTotalSRT = qtySimpleRT * averageSRT;
		subTotalART = qtyAverageRT * averageART;
		subTotalCRT = qtyComplexRT * averageCRT;
		reportingManHours = subTotalSRT + subTotalART + subTotalCRT;
		totalManHours = AdjustedManHours.adjustedManHours + reportingManHours;

		System.out.println("\nSub total for simple report type is " + subTotalSRT);
		System.out.println("Sub total for average report type is " + subTotalART);
		System.out.println("Sub total for complex report type is " + subTotalCRT);
		System.out.println("-----------------------------------------------");
		System.out.println("Total Report Man-hour Estimate is " + reportingManHours);
		System.out.printf("Total Man-hours are %.2f" , totalManHours);
		System.out.println("\n-----------------------------------------------");
    	}
}
