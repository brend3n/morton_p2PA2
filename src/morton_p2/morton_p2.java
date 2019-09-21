package morton_p2;
import java.util.Scanner;

public class morton_p2 {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		int choice;
		double bmi;
		
		// Display menu
		
		System.out.println("         Menu");
		System.out.println("---Calculate your BMI---");
		System.out.println("------------------------");
		System.out.println("");
		System.out.println("Select an option");
		System.out.println("1. BMI in Pounds ........(Enter 1)");
		System.out.println("2. BMI in Kilograms .....(Enter 2)");
		
		
		// Get user unit choice
		choice = scan.nextInt();
		

		
		if( choice == 1){
			
			int heightInch;
			int weightPound;
			
			System.out.print("Enter your weight in pounds: (round to nearest pound)");
			weightPound = scan.nextInt();
			
			System.out.print("Enter your height in inches: (round to nearest inch)");
			heightInch = scan.nextInt();
			
			
			// Empirical BMI calculation
			bmi = (703 * weightPound) / (double)(heightInch * heightInch);
		
			
		}else {
			
			double heightMeter;
			int weightKilo;
			
			System.out.print("Enter your weight in kilograms: (round to nearest kilogram)");
			weightKilo = scan.nextInt();
			
			System.out.print("Enter your height in meters: (round to nearest meter)");
			heightMeter = scan.nextDouble();
			
			// Metric BMI calculation
			bmi = (weightKilo) / (heightMeter * heightMeter);
			
	
		}
		
		System.out.println("");
		
		
		// Display of Results and Categories
		
		System.out.printf("Your BMI: %.1f\n", bmi);
		System.out.println("--- BMI Categories ---");
		
		System.out.println("");
		
		System.out.printf("%-8s %-3s   BMI < 18.5\n", "Underweight", " ");
		System.out.printf("%-8s %-3s 18.5 < BMI < 24.9 \n", "Normal weight"," ");
		System.out.printf("%-8s %-3s    25 < BMI < 29.9\n", "Overweight", " ");
		System.out.printf("%-8s %-3s      BMI >= 30\n", "Obesity"," ");
		scan.close();
		
		
		
	}

}
