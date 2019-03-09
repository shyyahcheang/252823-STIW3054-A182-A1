package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExperienceFactors extends TechnicalFactors{
	
	public static double ucp;

	public ExperienceFactors() {
		
	}
	
	public ExperienceFactors(int totalAT, int unadjustedUCP, double szUC, double ucp) {
		super(totalAT, unadjustedUCP, szUC);
		this.ucp = ucp;
	}
	
    public void weightingExperienceFactors() {
    	// TODO Auto-generated method stub
    	@SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        int ratingE1 = 0, ratingE2 = 0, ratingE3 = 0, ratingE4 = 0, ratingE5 = 0, ratingE6 = 0, ratingE7 = 0, ratingE8 = 0;
        double totalRatingE1 = 0.0, totalRatingE2 = 0.0, totalRatingE3 = 0.0, totalRatingE4 = 0.0, totalRatingE5 = 0.0,
                totalRatingE6 = 0.0, totalRatingE7 = 0.0, totalRatingE8 = 0.0;
        double totalEFactor, ef;

        System.out.println("\nWeighting Experience Factors");
        System.out.println("=============================");
        System.out.print("E1 - Familiar with FPT software process : ");
        while (repeat) {
            try {
                ratingE1 = scan.nextInt();
                do {
                    if (ratingE1 < 0 || ratingE1 > 5) {
                        System.out.print("Please enter rating from 0 to 5 : ");
                        ratingE1 = scan.nextInt();
                        totalRatingE1 = ratingE1 * 1;
                    } else {
                        totalRatingE1 = ratingE1 * 1;
                    }
                } while (ratingE1 != 0 && ratingE1 != 1 && ratingE1 != 2 && ratingE1 != 3 &&
                        ratingE1 != 4 && ratingE1 != 5);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("E1 - Familiar with FPT software process : ");
                scan.next();
                do {
                    if (ratingE1 < 0 || ratingE1 > 5) {
                        System.out.println("Please enter rating from 0 to 5 : ");
                        ratingE1 = scan.nextInt();
                        totalRatingE1 = ratingE1 * 1;
                    } else {
                        totalRatingE1 = ratingE1 * 1;
                    }
                } while (ratingE1 != 0 && ratingE1 != 1 && ratingE1 != 2 && ratingE1 != 3 &&
                        ratingE1 != 4 && ratingE1 != 5);
                repeat = true;
            }
        }

        System.out.print("E2 - Application experience : ");
        while (repeat) {
            try {
                ratingE2 = scan.nextInt();
                do {
                    if (ratingE2 < 0 || ratingE2 > 5) {
                        System.out.print("Please enter rating from 0 to 5 : ");
                        ratingE2 = scan.nextInt();
                        totalRatingE2 = ratingE2 * 0.5;
                    } else {
                        totalRatingE2 = ratingE2 * 0.5;
                    }
                } while (ratingE2 != 0 && ratingE2 != 1 && ratingE2 != 2 && ratingE2 != 3 &&
                        ratingE2 != 4 && ratingE2 != 5);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("E2 - Application experience : ");
                scan.next();
                do {
                    if (ratingE2 < 0 || ratingE2 > 5) {
                        System.out.println("Please enter rating from 0 to 5 : ");
                        ratingE2 = scan.nextInt();
                        totalRatingE2 = ratingE2 * 0.5;
                    } else {
                        totalRatingE2 = ratingE2 * 0.5;
                    }
                } while (ratingE2 != 0 && ratingE2 != 1 && ratingE2 != 2 && ratingE2 != 3 &&
                        ratingE2 != 4 && ratingE2 != 5);
                repeat = true;
            }
        }

        System.out.print("E3 - Paradigm experience (OO) : ");
        while (repeat) {
            try {
                ratingE3 = scan.nextInt();
                do {
                    if (ratingE3 < 0 || ratingE3 > 5) {
                        System.out.print("Please enter rating from 0 to 5 : ");
                        ratingE3 = scan.nextInt();
                        totalRatingE3 = ratingE3 * 1;
                    } else {
                        totalRatingE3 = ratingE3 * 1;
                    }
                } while (ratingE3 != 0 && ratingE3 != 1 && ratingE3 != 2 && ratingE3 != 3 &&
                        ratingE3 != 4 && ratingE3 != 5);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("E3 - Paradigm experience (OO) : ");
                scan.next();
                do {
                    if (ratingE3 < 0 || ratingE3 > 5) {
                        System.out.println("Please enter rating from 0 to 5 : ");
                        ratingE3 = scan.nextInt();
                        totalRatingE3 = ratingE3 * 1;
                    } else {
                        totalRatingE3 = ratingE3 * 1;
                    }
                } while (ratingE3 != 0 && ratingE3 != 1 && ratingE3 != 2 && ratingE3 != 3 &&
                        ratingE3 != 4 && ratingE3 != 5);
                repeat = true;
            }
        }

        System.out.print("E4 - Lead analyst capability : ");
        while (repeat) {
            try {
                ratingE4 = scan.nextInt();
                do {
                    if (ratingE4 < 0 || ratingE4 > 5) {
                        System.out.print("Please enter rating from 0 to 5 : ");
                        ratingE4 = scan.nextInt();
                        totalRatingE4 = ratingE4 * 0.5;
                    } else {
                        totalRatingE4 = ratingE4 * 0.5;
                    }
                } while (ratingE4 != 0 && ratingE4 != 1 && ratingE4 != 2 && ratingE4 != 3 &&
                        ratingE4 != 4 && ratingE4 != 5);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("E4 - Lead analyst capability : ");
                scan.next();
                do {
                    if (ratingE4 < 0 || ratingE4 > 5) {
                        System.out.println("Please enter rating from 0 to 5 : ");
                        ratingE4 = scan.nextInt();
                        totalRatingE4 = ratingE4 * 0.5;
                    } else {
                        totalRatingE4 = ratingE4 * 0.5;
                    }
                } while (ratingE4 != 0 && ratingE4 != 1 && ratingE4 != 2 && ratingE4 != 3 &&
                        ratingE4 != 4 && ratingE4 != 5);
                repeat = true;
            }
        }

        System.out.print("E5 - Motivation : ");
        while (repeat) {
            try {
                ratingE5 = scan.nextInt();
                do {
                    if (ratingE5 < 0 || ratingE5 > 5) {
                        System.out.print("Please enter rating from 0 to 5 : ");
                        ratingE5 = scan.nextInt();
                        totalRatingE5 = ratingE5 * 0;
                    } else {
                        totalRatingE5 = ratingE5 * 0;
                    }
                } while (ratingE5 != 0 && ratingE5 != 1 && ratingE5 != 2 && ratingE5 != 3 &&
                        ratingE5 != 4 && ratingE5 != 5);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("E5 - Motivation : ");
                scan.next();
                do {
                    if (ratingE5 < 0 || ratingE5 > 5) {
                        System.out.println("Please enter rating from 0 to 5 : ");
                        ratingE5 = scan.nextInt();
                        totalRatingE5 = ratingE5 * 0;
                    } else {
                        totalRatingE5 = ratingE5 * 0;
                    }
                } while (ratingE5 != 0 && ratingE5 != 1 && ratingE5 != 2 && ratingE5 != 3 &&
                        ratingE5 != 4 && ratingE5 != 5);
                repeat = true;
            }
        }

        System.out.print("E6 - Stable requirements : ");
        while (repeat) {
            try {
                ratingE6 = scan.nextInt();
                do {
                    if (ratingE6 < 0 || ratingE6 > 5) {
                        System.out.print("Please enter rating from 0 to 5 : ");
                        ratingE6 = scan.nextInt();
                        totalRatingE6 = ratingE6 * 2;
                    } else {
                        totalRatingE6 = ratingE6 * 2;
                    }
                } while (ratingE6 != 0 && ratingE6 != 1 && ratingE6 != 2 && ratingE6 != 3 &&
                        ratingE6 != 4 && ratingE6 != 5);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("E6 - Stable requirements : ");
                scan.next();
                do {
                    if (ratingE6 < 0 || ratingE6 > 5) {
                        System.out.println("Please enter rating from 0 to 5 : ");
                        ratingE6 = scan.nextInt();
                        totalRatingE6 = ratingE6 * 2;
                    } else {
                        totalRatingE6 = ratingE6 * 2;
                    }
                } while (ratingE6 != 0 && ratingE6 != 1 && ratingE6 != 2 && ratingE6 != 3 &&
                        ratingE6 != 4 && ratingE6 != 5);
                repeat = true;
            }
        }

        System.out.print("E7 - Part-time workers : ");
        while (repeat) {
            try {
                ratingE7 = scan.nextInt();
                do {
                    if (ratingE7 < 0 || ratingE7 > 5) {
                        System.out.print("Please enter rating from 0 to 5 : ");
                        ratingE7 = scan.nextInt();
                        totalRatingE7 = ratingE7 * (-1);
                    } else {
                        totalRatingE7 = ratingE7 * (-1);
                    }
                } while (ratingE7 != 0 && ratingE7 != 1 && ratingE7 != 2 && ratingE7 != 3 &&
                        ratingE7 != 4 && ratingE7 != 5);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("E7 - Part-time workers : ");
                scan.next();
                do {
                    if (ratingE7 < 0 || ratingE7 > 5) {
                        System.out.println("Please enter rating from 0 to 5 : ");
                        ratingE7 = scan.nextInt();
                        totalRatingE7 = ratingE7 * (-1);
                    } else {
                        totalRatingE7 = ratingE7 * (-1);
                    }
                } while (ratingE7 != 0 && ratingE7 != 1 && ratingE7 != 2 && ratingE7 != 3 &&
                        ratingE7 != 4 && ratingE7 != 5);
                repeat = true;
            }
        }

        System.out.print("E8 - Difficulty of programming language : ");
        while (repeat) {
            try {
                ratingE8 = scan.nextInt();
                do {
                    if (ratingE8 < 0 || ratingE8 > 5) {
                        System.out.print("Please enter rating from 0 to 5 : ");
                        ratingE8 = scan.nextInt();
                        totalRatingE8 = ratingE8 * (-1);
                    } else {
                        totalRatingE8 = ratingE8 * (-1);
                    }
                } while (ratingE8 != 0 && ratingE8 != 1 && ratingE8 != 2 && ratingE8 != 3 &&
                        ratingE8 != 4 && ratingE8 != 5);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("E8 - Difficulty of programming language : ");
                scan.next();
                do {
                    if (ratingE8 < 0 || ratingE8 > 5) {
                        System.out.println("Please enter rating from 0 to 5 : ");
                        ratingE8 = scan.nextInt();
                        totalRatingE8 = ratingE8 * (-1);
                    } else {
                        totalRatingE8 = ratingE8 * (-1);
                    }
                } while (ratingE8 != 0 && ratingE8 != 1 && ratingE8 != 2 && ratingE8 != 3 &&
                        ratingE8 != 4 && ratingE8 != 5);
                repeat = true;
            }
        }

        totalEFactor = totalRatingE1 + totalRatingE2 + totalRatingE3 + totalRatingE4 + totalRatingE5 +
                totalRatingE6 + totalRatingE7 + totalRatingE8;
        System.out.print("\nSub total for E1 is " + totalRatingE1);
        if (ratingE1 == 0) {
            System.out.print(" (No experience on this factor)");
        }
        else if (ratingE1 == 3) {
            System.out.print(" (Average on this factor)");
        }
        else if (ratingE1 == 5) {
            System.out.print(" (Expert on this factor)");
        }
        else {
            System.out.print("");
        }

        System.out.print("\nSub total for E2 is " + totalRatingE2);
        if (ratingE2 == 0) {
            System.out.print(" (No experience on this factor)");
        }
        else if (ratingE2 == 3) {
            System.out.print(" (Average on this factor)");
        }
        else if (ratingE2 == 5) {
            System.out.print(" (Expert on this factor)");
        }
        else {
            System.out.print("");
        }

        System.out.print("\nSub total for E3 is " + totalRatingE3);
        if (ratingE3 == 0) {
            System.out.print(" (No experience on this factor)");
        }
        else if (ratingE3 == 3) {
            System.out.print(" (Average on this factor)");
        }
        else if (ratingE3 == 5) {
            System.out.print(" (Expert on this factor)");
        }
        else {
            System.out.print("");
        }

        System.out.print("\nSub total for E4 is " + totalRatingE4);
        if (ratingE4 == 0) {
            System.out.print(" (No experience on this factor)");
        }
        else if (ratingE4 == 3) {
            System.out.print(" (Average on this factor)");
        }
        else if (ratingE4 == 5) {
            System.out.print(" (Expert on this factor)");
        }
        else {
            System.out.print("");
        }

        System.out.print("\nSub total for E5 is " + totalRatingE5);
        if (ratingE5 == 0) {
            System.out.print(" (No motivation on the project)");
        }
        else if (ratingE5 == 3) {
            System.out.print(" (Average motivation on the project)");
        }
        else if (ratingE5 == 5) {
            System.out.print(" (High motivation on the project)");
        }
        else {
            System.out.print("");
        }

        System.out.print("\nSub total for E6 is " + totalRatingE6);
        if (ratingE6 == 0) {
            System.out.print(" (Unchanging requirements)");
        }
        else if (ratingE6 == 3) {
            System.out.print(" (Average amount of change expected)");
        }
        else if (ratingE6 == 5) {
            System.out.print(" (Extremely unstable requirements)");
        }
        else {
            System.out.print("");
        }

        System.out.print("\nSub total for E7 is " + totalRatingE7);
        if (ratingE7 == 0) {
            System.out.print(" (No part-time technical staff)");
        }
        else if (ratingE7 == 3) {
            System.out.print(" (Average half of the team is part-time)");
        }
        else if (ratingE7 == 5) {
            System.out.print(" (All of the team is part-time)");
        }
        else {
            System.out.print("");
        }

        System.out.print("\nSub total for E8 is " + totalRatingE8);
        if (ratingE8 == 0) {
            System.out.print(" (Easy to use programming language is planned for the project)");
        }
        else if (ratingE8 == 3) {
            System.out.print(" (The language is of average difficulty for the project)");
        }
        else if (ratingE8 == 5) {
            System.out.print(" (A very difficult language is planned for the project)");
        }
        else {
            System.out.print("");
        }

        System.out.println("\n---------------------------------------");
        System.out.printf("Total EFactor is %.2f" , totalEFactor);
        ef = ((-0.03)*totalEFactor) + 1.4;
        System.out.printf("\nExperience Factor (EF) is %.2f" , ef);
        ucp = TechnicalFactors.szUC * ef;
        System.out.printf("\nUse Case Points (UCP) is %.2f" , ucp);
        System.out.println("\n---------------------------------------");
    }
}
