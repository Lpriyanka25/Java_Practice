import java.util.Scanner;

public class Max {
    /*public static void main(String[] args) {
        //double a = 10, b = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();

        double max = Double.max(a, b);
        System.out.println("Max " + max);
    }*/

    static void value(double a, double b){
        double max = Double.max(a, b);
        System.out.println("Max " + max);
    }
    public static void main(String[] args) {
        //double a = 10, b = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();

        value(a,b);
        
        sc.close();
    }
}
