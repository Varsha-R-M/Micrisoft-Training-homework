import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter N: ");
        int i , j , n = obj.nextInt();
        int mat[][] = new int[n][n];
        mat[0][0]=mat[1][0]=mat[1][1]=1;
        if(n>2){
            for(i=2 ; i<n ; ++i){
                mat[i][0]=1;
                for(j=1 ; j<i ; ++j){
                    mat[i][j] = mat[i-1][j] + mat[i-1][j];
                }
                mat[i][i]=1;
            }
        }
        print("Pascals Triangle: \n");
        for(i=0 ; i<n ; ++i){
            for(j=0 ; j<n ; ++j){
                print(mat[i][j]+ " ");
            }
            print("\n");
        }
        return ;
    }

}