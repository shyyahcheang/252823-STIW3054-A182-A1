package assignment1;

import java.util.Scanner;

public class SoftwareEffortEstimation {

    public static void main(String args[]) {

    	@SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        char ans;

        do{
            ActorType actorType = new ActorType();
            actorType.weightingActors();
            
            UseCases useCases = new UseCases();
            useCases.weightingUseCases();
            
            TechnicalFactors technicalFactors = new TechnicalFactors();
            technicalFactors.weightingTechnicalFactors();

            ExperienceFactors experienceFactors = new ExperienceFactors();
            experienceFactors.weightingExperienceFactors();

            ManHours manHours = new ManHours();
            manHours.calculatingManHours();
            
            AdjustedManHours adjustedManHours = new AdjustedManHours();
            adjustedManHours.adjustingManHours();
            
            EstimatingReport estimatingReport = new EstimatingReport();
            estimatingReport.weightingReports();

            System.out.print("\nDo you want to calculate again? 'Y' / 'N' : ");
            ans = scan.next().charAt(0);
            
        }while (ans == 'Y');
    }
}
