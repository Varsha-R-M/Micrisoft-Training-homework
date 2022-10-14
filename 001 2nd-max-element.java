import java.util.*;

class Main(){

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter the number of elements in array: ");
        int i , max=-1 , second_max = -1 , n = obj.nextInt();
        print("Enter array elements: ");
        for(i=0 ; i<n ; ++i){
            int a = obj.nextInt();
            if(max < a){
                second_max = max;
                max = a;
            }else if(second_max < a){
                second_max = a;
            }
        }
        print("Second max element: " + second_max);
        return ;
    }

}