
//T3
import java.util.Scanner;

public class Average {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        int d;
        
        System.out.println("Please Enter Three integer");
        System.out.print("Integer 1: ");
        a = input.nextInt();
        
        System.out.print("Integer 2: ");
        b = input.nextInt();
        
        System.out.print("Integer 3: ");
        c = input.nextInt();
        System.out.println("Average for 3 integer  = " + average(a,b,c));

        System.out.println("Enter fourth integer:");
        System.out.print("Integer 4: ");
        d = input.nextInt();
        System.out.println("Average for 4 integer above = " + average(a,b,c,d));

    }

    public static double average(int a, int b, int c){
    
        double avg= ((double)(a+b+c))/3;
        return avg;
    }

    public static double average(int a, int b, int c, int d){
    
        double avg = ((double)(a+b+c+d))/4;
        return avg;
    }

}
