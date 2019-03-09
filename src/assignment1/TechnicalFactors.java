package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TechnicalFactors extends UseCases {
	
	public static double szUC;

	public TechnicalFactors() {
		
	}
	
	public TechnicalFactors(int totalAT, int unadjustedUCP, double szUC) {
		super(totalAT, unadjustedUCP);
		this.szUC = szUC;
	}
	
    	public void weightingTechnicalFactors() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean repeat = true;
		int ratingT1 = 0, ratingT2 = 0, ratingT3 = 0, ratingT4 = 0, ratingT5 = 0, ratingT6 = 0,
			ratingT7 = 0, ratingT8 = 0, ratingT9 = 0, ratingT10 = 0, ratingT11 = 0, ratingT12 = 0, ratingT13 = 0;
		double totalRatingT1 = 0.0, totalRatingT2 = 0.0, totalRatingT3 = 0.0, totalRatingT4 = 0.0, totalRatingT5 = 0.0,
			totalRatingT6 = 0.0, totalRatingT7 = 0.0, totalRatingT8 = 0.0, totalRatingT9 = 0.0, totalRatingT10 = 0.0,
			totalRatingT11 = 0.0, totalRatingT12 = 0.0, totalRatingT13 = 0.0;
		double tcf, totalTFactor;

		System.out.println("\nWeighting Technical Factors");
		System.out.println("===========================");
		System.out.print("T1 - Must have a distributed solution : ");
		while (repeat) {
		    try {
			ratingT1 = scan.nextInt();
			do {
			    if (ratingT1 < 0 || ratingT1 > 5) {
				System.out.print("Please enter rating from 0 to 5 : ");
				ratingT1 = scan.nextInt();
				totalRatingT1 = ratingT1 * 2;
			    } else {
				totalRatingT1 = ratingT1 * 2;
			    }
			} while (ratingT1 != 0 && ratingT1 != 1 && ratingT1 != 2 && ratingT1 != 3 &&
				ratingT1 != 4 && ratingT1 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T1 - Must have a distributed solution : ");
			scan.next();
			do {
			    if (ratingT1 < 0 || ratingT1 > 5) {
				System.out.print("Please enter rating from 0 to 5 : ");
				ratingT1 = scan.nextInt();
				totalRatingT1 = ratingT1 * 2;
			    } else {
				totalRatingT1 = ratingT1 * 2;
			    }
			} while (ratingT1 != 0 && ratingT1 != 1 && ratingT1 != 2 && ratingT1 != 3 &&
				ratingT1 != 4 && ratingT1 != 5);
			repeat = true;
		    }
		}

		System.out.print("T2 - Must respond to specific performance objectives : ");
		while (repeat) {
		    try {
			ratingT2 = scan.nextInt();
			do {
			    if (ratingT2 < 0 || ratingT2 > 5) {
				System.out.print("Please enter rating from 0 to 5 : ");
				ratingT2 = scan.nextInt();
				totalRatingT2 = ratingT2 * 1;
			    } else {
				totalRatingT2 = ratingT2 * 1;
			    }
			} while (ratingT2 != 0 && ratingT2 != 1 && ratingT2 != 2 && ratingT2 != 3 &&
				ratingT2 != 4 && ratingT2 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T2 - Must respond to specific performance objectives : ");
			scan.next();
			do {
			    if (ratingT2 < 0 || ratingT2 > 5) {
				System.out.print("Please enter rating from 0 to 5 : ");
				ratingT2 = scan.nextInt();
				totalRatingT2 = ratingT2 * 2;
			    } else {
				totalRatingT2 = ratingT2 * 2;
			    }
			} while (ratingT2 != 0 && ratingT2 != 1 && ratingT2 != 2 && ratingT2 != 3 &&
				ratingT2 != 4 && ratingT2 != 5);
			repeat = true;
		    }
		}

		System.out.print("T3 - Must meet end-user efficiency desires : ");
		while (repeat) {
		    try {
			ratingT3 = scan.nextInt();
			do {
			    if (ratingT3 < 0 || ratingT3 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT3 = scan.nextInt();
				totalRatingT3 = ratingT3 * 1;
			    } else {
				totalRatingT3 = ratingT3 * 1;
			    }
			} while (ratingT3 != 0 && ratingT3 != 1 && ratingT3 != 2 && ratingT3 != 3 &&
				ratingT3 != 4 && ratingT3 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T3 - Must meet end-user efficiency desires : ");
			scan.next();
			do {
			    if (ratingT3 < 0 || ratingT3 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT3 = scan.nextInt();
				totalRatingT3 = ratingT3 * 1;
			    } else {
				totalRatingT3 = ratingT3 * 1;
			    }
			} while (ratingT3 != 0 && ratingT3 != 1 && ratingT3 != 2 && ratingT3 != 3 &&
				ratingT3 != 4 && ratingT3 != 5);
			repeat = true;
		    }
		}

		System.out.print("T4 - Complex internal processing : ");
		while (repeat) {
		    try {
			ratingT4 = scan.nextInt();
			do {
			    if (ratingT4 < 0 || ratingT4 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT4 = scan.nextInt();
				totalRatingT4 = ratingT4 * 1;
			    } else {
				totalRatingT4 = ratingT4 * 1;
			    }
			} while (ratingT4 != 0 && ratingT4 != 1 && ratingT4 != 2 && ratingT4 != 3 &&
				ratingT4 != 4 && ratingT4 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T4 - Complex internal processing : ");
			scan.next();
			do {
			    if (ratingT4 < 0 || ratingT4 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT4 = scan.nextInt();
				totalRatingT4 = ratingT4 * 1;
			    } else {
				totalRatingT4 = ratingT4 * 1;
			    }
			} while (ratingT4 != 0 && ratingT4 != 1 && ratingT4 != 2 && ratingT4 != 3 &&
				ratingT4 != 4 && ratingT4 != 5);
			repeat = true;
		    }
		}

		System.out.print("T5 - Code must be reusable : ");
		while (repeat) {
		    try {
			ratingT5 = scan.nextInt();
			do {
			    if (ratingT5 < 0 || ratingT5 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT5 = scan.nextInt();
				totalRatingT5 = ratingT5 * 1;
			    } else {
				totalRatingT5 = ratingT5 * 1;
			    }
			} while (ratingT5 != 0 && ratingT5 != 1 && ratingT5 != 2 && ratingT5 != 3 &&
				ratingT5 != 4 && ratingT5 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T5 - Code must be reusable : ");
			scan.next();
			do {
			    if (ratingT5 < 0 || ratingT5 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT5 = scan.nextInt();
				totalRatingT5 = ratingT5 * 1;
			    } else {
				totalRatingT5 = ratingT5 * 1;
			    }
			} while (ratingT5 != 0 && ratingT5 != 1 && ratingT5 != 2 && ratingT5 != 3 &&
				ratingT5 != 4 && ratingT5 != 5);
			repeat = true;
		    }
		}

		System.out.print("T6 - Must be easy to install : ");
		while (repeat) {
		    try {
			ratingT6 = scan.nextInt();
			do {
			    if (ratingT6 < 0 || ratingT6 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT6 = scan.nextInt();
				totalRatingT6 = ratingT6 * 0.5;
			    } else {
				totalRatingT6 = ratingT6 * 0.5;
			    }
			} while (ratingT6 != 0 && ratingT6 != 1 && ratingT6 != 2 && ratingT6 != 3 &&
				ratingT6 != 4 && ratingT6 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T6 - Must be easy to install : ");
			scan.next();
			do {
			    if (ratingT6 < 0 || ratingT6 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT6 = scan.nextInt();
				totalRatingT6 = ratingT6 * 0.5;
			    } else {
				totalRatingT6 = ratingT6 * 0.5;
			    }
			} while (ratingT6 != 0 && ratingT6 != 1 && ratingT6 != 2 && ratingT6 != 3 &&
				ratingT6 != 4 && ratingT6 != 5);
			repeat = true;
		    }
		}

		System.out.print("T7 - Must be easy to use : ");
		while (repeat) {
		    try {
			ratingT7 = scan.nextInt();
			do {
			    if (ratingT7 < 0 || ratingT7 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT7 = scan.nextInt();
				totalRatingT7 = ratingT7 * 0.5;
			    } else {
				totalRatingT7 = ratingT7 * 0.5;
			    }
			} while (ratingT7 != 0 && ratingT7 != 1 && ratingT7 != 2 && ratingT7 != 3 &&
				ratingT7 != 4 && ratingT7 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T7 - Must be easy to use : ");
			scan.next();
			do {
			    if (ratingT7 < 0 || ratingT7 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT7 = scan.nextInt();
				totalRatingT7 = ratingT7 * 0.5;
			    } else {
				totalRatingT7 = ratingT7 * 0.5;
			    }
			} while (ratingT7 != 0 && ratingT7 != 1 && ratingT7 != 2 && ratingT7 != 3 &&
				ratingT7 != 4 && ratingT7 != 5);
			repeat = true;
		    }
		}

		System.out.print("T8 - Must be portable : ");
		while (repeat) {
		    try {
			ratingT8 = scan.nextInt();
			do {
			    if (ratingT8 < 0 || ratingT8 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT8 = scan.nextInt();
				totalRatingT8 = ratingT8 * 2;
			    } else {
				totalRatingT8 = ratingT8 * 2;
			    }
			} while (ratingT8 != 0 && ratingT8 != 1 && ratingT8 != 2 && ratingT8 != 3 &&
				ratingT8 != 4 && ratingT8 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T8 - Must be portable : ");
			scan.next();
			do {
			    if (ratingT8 < 0 || ratingT8 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT8 = scan.nextInt();
				totalRatingT8 = ratingT8 * 2;
			    } else {
				totalRatingT8 = ratingT8 * 2;
			    }
			} while (ratingT8 != 0 && ratingT8 != 1 && ratingT8 != 2 && ratingT8 != 3 &&
				ratingT8 != 4 && ratingT8 != 5);
			repeat = true;
		    }
		}

		System.out.print("T9 - Must be easy to change : ");
		while (true) {
		    try {
			ratingT9 = scan.nextInt();
			do {
			    if (ratingT9 < 0 || ratingT9 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT9 = scan.nextInt();
				totalRatingT9 = ratingT9 * 1;
			    } else {
				totalRatingT9 = ratingT9 * 1;
			    }
			} while (ratingT9 != 0 && ratingT9 != 1 && ratingT9 != 2 && ratingT9 != 3 &&
				ratingT9 != 4 && ratingT9 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T9 - Must be easy to change : ");
			scan.next();
			do {
			    if (ratingT9 < 0 || ratingT9 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT9 = scan.nextInt();
				totalRatingT9 = ratingT9 * 1;
			    } else {
				totalRatingT9 = ratingT9 * 1;
			    }
			} while (ratingT9 != 0 && ratingT9 != 1 && ratingT9 != 2 && ratingT9 != 3 &&
				ratingT9 != 4 && ratingT9 != 5);
			repeat = true;
		    }
		}

		System.out.print("T10 - Must allow concurrent users : ");
		while (repeat) {
		    try {
			ratingT10 = scan.nextInt();
			do {
			    if (ratingT10 < 0 || ratingT10 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT10 = scan.nextInt();
				totalRatingT10 = ratingT10 * 1;
			    } else {
				totalRatingT10 = ratingT10 * 1;
			    }
			} while (ratingT10 != 0 && ratingT10 != 1 && ratingT10 != 2 && ratingT10 != 3 &&
				ratingT10 != 4 && ratingT10 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T10 - Must allow concurrent users : ");
			scan.next();
			do {
			    if (ratingT10 < 0 || ratingT10 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT10 = scan.nextInt();
				totalRatingT10 = ratingT10 * 1;
			    } else {
				totalRatingT10 = ratingT10 * 1;
			    }
			} while (ratingT10 != 0 && ratingT10 != 1 && ratingT10 != 2 && ratingT10 != 3 &&
				ratingT10 != 4 && ratingT10 != 5);
			repeat = true;
		    }
		}

		System.out.print("T11 - Includes special security features : ");
		while (repeat) {
		    try {
			ratingT11 = scan.nextInt();
			do {
			    if (ratingT11 < 0 || ratingT11 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT11 = scan.nextInt();
				totalRatingT11 = ratingT11 * 1;
			    } else {
				totalRatingT11 = ratingT11 * 1;
			    }
			} while (ratingT11 != 0 && ratingT11 != 1 && ratingT11 != 2 && ratingT11 != 3 &&
				ratingT11 != 4 && ratingT11 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T11 - Includes special security features : ");
			scan.next();
			do {
			    if (ratingT11 < 0 || ratingT11 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT11 = scan.nextInt();
				totalRatingT11 = ratingT11 * 1;
			    } else {
				totalRatingT11 = ratingT11 * 1;
			    }
			} while (ratingT11 != 0 && ratingT11 != 1 && ratingT11 != 2 && ratingT11 != 3 &&
				ratingT11 != 4 && ratingT11 != 5);
			repeat = true;
		    }
		}

		System.out.print("T12 - Must provide direct access for 3rd parties : ");
		while (repeat) {
		    try {
			ratingT12 = scan.nextInt();
			do {
			    if (ratingT12 < 0 || ratingT12 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT12 = scan.nextInt();
				totalRatingT12 = ratingT12 * 1;
			    } else {
				totalRatingT12 = ratingT12 * 1;
			    }
			} while (ratingT12 != 0 && ratingT12 != 1 && ratingT12 != 2 && ratingT12 != 3 &&
				ratingT12 != 4 && ratingT12 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T12 - Must provide direct access for 3rd parties : ");
			scan.next();
			do {
			    if (ratingT12 < 0 || ratingT12 > 5) {
				System.out.println("Please enter rating from 0 to 5 : ");
				ratingT12 = scan.nextInt();
				totalRatingT12 = ratingT12 * 1;
			    } else {
				totalRatingT12 = ratingT12 * 1;
			    }
			} while (ratingT12 != 0 && ratingT12 != 1 && ratingT12 != 2 && ratingT12 != 3 &&
				ratingT12 != 4 && ratingT12 != 5);
			repeat = true;
		    }
		}

		System.out.print("T13 - Requires special user training facilities : ");
		while (repeat) {
		    try {
			ratingT13 = scan.nextInt();
			do {
			    if (ratingT13 < 0 || ratingT13 > 5) {
				System.out.println("PLease enter rating from 0 to 5 : ");
				ratingT13 = scan.nextInt();
				totalRatingT13 = ratingT13 * 1;
			    } else {
				totalRatingT13 = ratingT13 * 1;
			    }
			} while (ratingT13 != 0 && ratingT13 != 1 && ratingT13 != 2 && ratingT13 != 3 &&
				ratingT13 != 4 && ratingT13 != 5);
			break;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid input! Please key in an integer number.");
			System.out.print("T13 - Requires special user training facilities : ");
			scan.next();
			do {
			    if (ratingT13 < 0 || ratingT13 > 5) {
				System.out.println("PLease enter rating from 0 to 5 : ");
				ratingT13 = scan.nextInt();
				totalRatingT13 = ratingT13 * 1;
			    } else {
				totalRatingT13 = ratingT13 * 1;
			    }
			} while (ratingT13 != 0 && ratingT13 != 1 && ratingT13 != 2 && ratingT13 != 3 &&
				ratingT13 != 4 && ratingT13 != 5);
			repeat = true;
		    }
		}

		totalTFactor = totalRatingT1 + totalRatingT2 + totalRatingT3 + totalRatingT4 + totalRatingT5 +
			totalRatingT6 + totalRatingT7 + totalRatingT8 + totalRatingT9 + totalRatingT10 +
			totalRatingT11 + totalRatingT12 + totalRatingT13;
		System.out.print("\nSub total for T1 is " + totalRatingT1);
		if (ratingT1 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT1 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T2 is " + totalRatingT2);
		if (ratingT2 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT2 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T3 is " + totalRatingT3);
		if (ratingT3 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT3 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T4 is " + totalRatingT4);
		if (ratingT4 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT4 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T5 is " + totalRatingT5);
		if (ratingT5 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT5 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T6 is " + totalRatingT6);
		if (ratingT6 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT6 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T7 is " + totalRatingT7);
		if (ratingT7 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT7 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T8 is " + totalRatingT8);
		if (ratingT8 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT8 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T9 is " + totalRatingT9);
		if (ratingT9 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT9 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T10 is " + totalRatingT10);
		if (ratingT10 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT10 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T11 is " + totalRatingT11);
		if (ratingT11 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT11 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T12 is " + totalRatingT12);
		if (ratingT12 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT12 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.print("\nSub total for T13 is " + totalRatingT13);
		if (ratingT13 == 0) {
		    System.out.print(" (This factor is irrelevant)");
		}
		else if (ratingT13 == 5) {
		    System.out.print(" (This factor is essential)");
		}
		else {
		    System.out.print("");
		}

		System.out.println("\n------------------------------------------");
		System.out.printf("Total TFactor is %.2f" , totalTFactor);
		tcf = (0.01*totalTFactor) + 0.6;
		System.out.printf("\nTechnical Complexity Factor is %.2f" , tcf);
		szUC = UseCases.unadjustedUCP * tcf;
		System.out.printf("\nSize of the software (use case) is %.2f" , szUC);
		System.out.println("\n------------------------------------------");
    	}
}
