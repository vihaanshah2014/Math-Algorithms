import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;


class Summation_Notation{
    public static double y(double x){
        //equation to change per problem
        double y = x;//whatever the equation is

        return y;
    }

    static private String convertDecimalToFraction(double x){
        if (x < 0){
            return "-" + convertDecimalToFraction(-x);
        }
        double tolerance = 1.0E-6;
        double h1=1; double h2=0;
        double k1=0; double k2=1;
        double b = x;
        do {
            double a = Math.floor(b);
            double aux = h1; h1 = a*h1+h2; h2 = aux;
            aux = k1; k1 = a*k1+k2; k2 = aux;
            b = 1/(b-a);
        } while (Math.abs(x-h1/k1) > x*tolerance);
    
        return h1+"/"+k1;
    }


    public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Max:");
    int i = s.nextInt();

    System.out.println("\nEnter K:");
    int k = s.nextInt();

    double sum = 0;

    for(int j = k; j < i + 1; j++){
        sum += y(j);
    } // for loop to find all the numbers between the lower and upper bound

    System.out.println("\n---------- \nSum is: " + sum + "\n----------");

    System.out.println("\nDo you want it as a fraction?");
    System.out.println("No[0] \nYes[1]");
    int lol = s.nextInt(); //determines if it should be a fraction
    if(lol == 1){
        System.out.println("\n---------- \nSum is: " + convertDecimalToFraction((sum)) + "\n----------");
    }
    

    }
}
