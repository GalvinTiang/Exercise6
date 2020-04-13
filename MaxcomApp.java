
//T2
import java.util.Scanner;

public class MaxcomApp {

    public static void main(String[] args) {
    
        int duration;
        int category;
        
        Scanner read = new Scanner(System.in);
        
        double charge = 0.0;
        int respond;
        
        CallChargeCalculator ccc = new CallChargeCalculator();
        do {
            System.out.println("Enter the call duration (in minutes):");
            duration = read.nextInt();
            
            System.out.println("Enter Rate Category:  1.Daytime  2.Evening  3.Off-Peak");
            category = read.nextInt();
            charge = ccc.computeCharge(duration, category);
            
            System.out.printf("The amount you have to pay is = RM%.2f ", charge);
            System.out.println();
            
            System.out.println("Do you want to continue? 1.Yes  2.No");
            respond = read.nextInt();
            System.out.println();
            
        } while (respond != 2);
        
        System.out.println("Thank you! See you again.");
    }
}

class CallChargeCalculator {
    double charge;

    public double computeCharge(int duration, int category) {
    
        double rate;
        
        if (category == 1) {
            rate = 0.07;
        } else if (category== 2) {
            rate = 0.12;
        } else {
            rate = 0.05;
        }
        charge = duration * rate;
        
        return charge;
    }
}

                                                   