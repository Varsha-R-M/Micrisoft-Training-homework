import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter size of matrix: ");
        int i , j , n = obj.nextInt();
        int mat[][] = new int[n][n];
        for(i=0 ; i<n ; ++i){
            for(j=0 ; j<n ; ++j){
                mat[j][i] = obj.nextInt();
            }
        }
        print("Transpose: \n");
        for(i=0 ; i<n ; ++i){
            for(j=0 ; j<n ; ++j){
                print(mat[i][j] + " ");
            }
            print("\n");
        }
        return ;
    }

}