import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    static long factorial(int n){
        if(n==0)return 1;
        return n * factorial(n-1);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter N: ");
        int n = obj.nextInt();
        print("Factorial: " + factorial(n));
        return ;
    }

}