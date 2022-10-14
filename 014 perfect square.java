import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter N: ");
        int n = obj.nextInt();
        int sqrt = (int)Math.sqrt(n);
        print(sqrt*sqrt == n ? "perfect square" : "not a perfect square");
        return ;
    }

}