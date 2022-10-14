import java.util.*;

class Main{

    static void print(Object toPrint){
        System.out.print(toPrint);
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        print("Enter array size: ");
        int i , max_freq=-1 , n = obj.nextInt();
        int arr[] = new int[n];
        Map<Integer , Integer> m = new HashMap<>();
        print("Enter array Elements: ");
        for(i=0 ; i<n ; ++i)arr[i] = obj.nextInt();
        Arrays.sort(arr);
        float mean = -1 , median = -1;
        int  mode = -1;
        for(i=0 ; i<n ; ++i){
            mean += arr[i];
            int freq = m.getOrDefault( arr[i] , 0 );
            m.put( arr[i] , freq+1 );
            if(max_freq < freq+1){
                max_freq = freq+1;
                mode = arr[i];
            }
        }
        mean = mean / (float)n;
        if(n%2==0) median = ( arr[n/2] + arr[n/2 -1] )/(float)2;
        else median = arr[n/2];
        print("Mean: " + mean + "\nMedian: " + median + "\nMode: " + mode);
        return ;
    }

}