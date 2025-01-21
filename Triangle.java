import java.util.Scanner;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;
  
    
        public Triangle(){
           
        }
        public Triangle(double side1, double side2, double side3){
                this.side1=side1;
                this.side2=side2;
                this.side3=side3;
        }
        Scanner sc = new Scanner(System.in);
    public void getsides() {
        
        System.out.println("Enter the side1: ");
        side1 = sc.nextDouble();
        System.out.println("Enter the side2: ");
        side2 = sc.nextDouble();
        System.out.println("Enter the side3: ");
        side3 = sc.nextDouble();
	}
    
    public void setsides(double side1, double side2, double side3) {
        System.out.println("side1: "+this.side1);
        System.out.println("side2: "+this.side2);
        System.out.println("side3: "+this.side3);	
	}

    public double calcPeri(){
            return side1 + side2 + side3;
    }
    public boolean IsValid() {
        if((side1>side2+side3) || (side2>side1+side3) || (side3>side1+side2)){

            return true;
            
        }
        else{

            return false;
        }
        
    }
    public static void main(String[] args) {
        /*Triangle t = new Triangle();
        t.getsides();
        t.setsides(10, 20, 30);*/
        Triangle[] arr = new Triangle[4];
        for(int i= 0; i<arr.length;i++){
            arr[i] = new Triangle();
            arr[i].getsides();
            arr[i].IsValid();
            System.out.println("Valid : "+arr[i].IsValid());
            arr[i].calcPeri();
            System.out.println("Peri : "+arr[i].calcPeri());
        }
       
    }
}
