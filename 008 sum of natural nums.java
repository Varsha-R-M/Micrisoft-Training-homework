import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter a value of number: ");
        int n = obj.nextInt();
        int sum = n * (n+1) / 2;
        print("Sum of first " + n + " natural numbers: " + sum);
        return ;
    }

}