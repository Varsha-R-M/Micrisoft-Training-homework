import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter a number: ");
        int n = obj.nextInt() , i , j;
        for(i=n ; i>0 ; --i){
            for(j=i ; j>0 ; --j){
                print(j);
            }
            print("\n");
        }
        return ;
    }

}