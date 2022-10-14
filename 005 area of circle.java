import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter radius of circle: ");
        double r = obj.nextDouble();
        double area = Math.PI * r * r;
        print("Area of circle of radius " + r + ": ");
        System.out.printf("%.2f" , area);
        return ;
    }

}