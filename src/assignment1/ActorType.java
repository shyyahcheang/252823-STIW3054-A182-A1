package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ActorType {
	
	public static int totalAT;

	public ActorType() {

    	}

	public ActorType(int totalAT){
		super();
        	this.totalAT = totalAT;
    	}

	public void weightingActors() {
		// TODO Auto-generated method stub
		int qtySimpleAT = 0, qtyAverageAT = 0, qtyComplexAT = 0;
        int totalSimpleAT, totalAverageAT, totalComplexAT;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        boolean repeat = true;

        System.out.println("Weighting Actors for Complexity");
        System.out.println("===============================");
        System.out.print("Simple - Defined API : ");
        while (repeat) {
            try {
                qtySimpleAT = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("Simple - Defined API : ");
                scan.next();
                repeat = true;
            }
        }

        System.out.print("Average - Interactive or Protocol driven interface : ");
        while (repeat) {
            try {
                qtyAverageAT = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("Average - Interactive or Protocol driven interface : ");
                scan.next();
                repeat = true;
            }
        }

        System.out.print("Complex - Graphical User Interface : ");
        while (repeat) {
            try {
                qtyComplexAT = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("Complex - Graphical User Interface : ");
                scan.next();
                repeat = true;
            }
        }

        totalSimpleAT = qtySimpleAT*1;
        totalAverageAT = qtyAverageAT*2;
        totalComplexAT = qtyComplexAT*3;
        totalAT = totalSimpleAT + totalAverageAT + totalComplexAT;

        System.out.println("\nSub total for simple actor is " + totalSimpleAT);
        System.out.println("Sub total for average actor is " + totalAverageAT);
        System.out.println("Sub total for complex actor is " + totalComplexAT);
        System.out.println("--------------------------------");
        System.out.println("Total Actor Points are " + totalAT);
        System.out.println("--------------------------------");
	}
}
