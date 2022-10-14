import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    static int gcd(int a , int b){
        return b==0 ? a : gcd(b , a%b);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter 2 numbers (seperated by space): ");
        int a = obj.nextInt() , b = obj.nextInt();
        print("GCD of nums: " + gcd(a,b));
        return ;
    }

}