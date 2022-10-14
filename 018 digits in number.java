import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter a number: ");
        int n = obj.nextInt();
        print("Digits: \n");
        while(n>0){
            print(n%10 + "\n") ;
            n/=10;
        }
        return ;
    }

}