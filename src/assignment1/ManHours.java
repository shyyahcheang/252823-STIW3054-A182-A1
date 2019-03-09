package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManHours extends ExperienceFactors {
	
	public static double manHours = 0.0;
	
	public ManHours() {
		
	}

	public ManHours(int totalAT, int unadjustedUCP, double szUC, double ucp, double manHours) {
		super(totalAT, unadjustedUCP, szUC, ucp);
		this.manHours = manHours;
	}

    public void calculatingManHours() {
    	// TODO Auto-generated method stub
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        int effortRate = 0;

        System.out.println("\nCalculating Man-hours from UCP");
        System.out.println("================================");
        System.out.print("Please key in the effort rate (20 or 28) : ");
        while (repeat) {
            try {
                effortRate = scan.nextInt();
                do {
                    if (effortRate == 20 || effortRate == 28) {
                        manHours = effortRate * ExperienceFactors.ucp;
                    } else {
                        System.out.print("Invalid! Please key in effort rate (20 or 28) : ");
                        effortRate = scan.nextInt();
                        manHours = effortRate * ExperienceFactors.ucp;
                    }
                } while (effortRate != 20 && effortRate != 28);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please key in an integer number.");
                System.out.print("Please key in effort rate (20 or 28) : ");
                scan.next();
                do {
                    if (effortRate == 20 || effortRate == 28) {
                        manHours = effortRate * ExperienceFactors.ucp;
                    } else {
                        System.out.print("Invalid! Please key in effort rate (20 or 28) : ");
                        effortRate = scan.nextInt();
                        manHours = effortRate * ExperienceFactors.ucp;
                    }
                } while (effortRate != 20 && effortRate != 28);
                repeat = true;
            }
        }

        System.out.println("-------------------------------------");
        System.out.printf("Man-Hours are %.2f" , manHours);
        System.out.println("\n-------------------------------------");
    }
}
