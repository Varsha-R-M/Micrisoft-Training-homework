import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter a String: ");
        String str = obj.next();
        int i , hash[] = new int[26];
        for(char ch : str.toCharArray()){
            hash[ ch - 97 ]++;
        }
        for(i=0 ; i<26 ; ++i){
            print(hash[i]!=0 ? ( (char)(97+i) + " : " + hash[i] + "\n" ) : "");
        }
        return ;
    }

}