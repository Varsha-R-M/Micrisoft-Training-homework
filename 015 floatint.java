import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter a Integer: ");
        int a = obj.nextInt();
        print("Enter a floating point value: ");
        float b = obj.nextFloat();
        float ans = (float)a + b;
        System.out.printf("Sum: %.2f" , ans);
        return ;
    }

}