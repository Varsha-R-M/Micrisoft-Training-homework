import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter a string: ");
        StringBuilder sb = new StringBuilder(obj.next());
        StringBuilder org = new StringBuilder(sb.toString());
        sb.reverse();
        print(sb.compareTo(org)==0 ? "palindrome" : "Not Palindrome");
        return ;
    }

}