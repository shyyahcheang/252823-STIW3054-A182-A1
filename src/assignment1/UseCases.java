package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseCases extends ActorType {
	
	public static int unadjustedUCP;

    	public UseCases() {

    	}

    	public UseCases(int totalAT, int unadjustedUCP) {
        	super(totalAT);
        	this.unadjustedUCP = unadjustedUCP;
    	}

    	public void weightingUseCases() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
		boolean repeat = true;
		int ucSimpleQty = 0, ucAverageQty = 0, ucComplexQty = 0;
		int totalSimpleUC, totalAverageUC, totalComplexUC;
		int totalUC;

		System.out.println("\nWeighting Use Cases for Complexity");
		System.out.println("==================================");
		System.out.print("Simple - 3 or fewer transactions : ");
		while (repeat) {
		    try {
			ucSimpleQty = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("Simple - 3 or fewer transactions : ");
			scan.next();
			repeat = true;
		    }
		}

		System.out.print("Average - 4 to 7 transactions : ");
		while (repeat) {
		    try {
			ucAverageQty = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("Average - 4 to 7 transactions : ");
			scan.next();
			repeat = true;
		    }
		}

		System.out.print("Complex - Greater than 7 transactions : ");
		while (repeat) {
		    try {
			ucComplexQty = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("Complex - Greater than 7 transactions : ");
			scan.next();
			repeat = true;
		    }
		}

		totalSimpleUC = ucSimpleQty*5;
		totalAverageUC = ucAverageQty*10;
		totalComplexUC = ucComplexQty*15;
		totalUC = totalSimpleUC + totalAverageUC + totalComplexUC;

		System.out.println("\nSub total for simple use case is " + totalSimpleUC);
		System.out.println("Sub total for average use case is " + totalAverageUC);
		System.out.println("Sub total for complex use case is " + totalComplexUC);
		System.out.println("-------------------------------------");
		System.out.println("Total Use Cases are " + totalUC);

		unadjustedUCP = ActorType.totalAT + totalUC;
		System.out.println("Unadjusted Use Case Points are " + unadjustedUCP);
		System.out.println("-------------------------------------");
    	}
}
