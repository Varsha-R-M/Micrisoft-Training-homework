import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter a number: ");
        int n = obj.nextInt() , i , j;
        print("Pattern: \n");
        for(i=0 ; i<n ; ++i){
            for(j=1 ; j<=i+1 ; ++j){
                print(j);
            }
            print("\n");
        }
        return ;
    }

}