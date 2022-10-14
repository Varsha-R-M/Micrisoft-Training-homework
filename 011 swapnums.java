import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int a , b;
        print("Enter A: ");
        a = obj.nextInt();
        print("Enter B: ");
        b = obj.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        print();
        print("Value of A: " + a + "\nValue of B: "+ b);
        return ;
    }

}