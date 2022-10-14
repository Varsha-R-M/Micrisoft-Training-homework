class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        int l=1 , en = x;
        while(l<en){
            int mid =l + (en-l)/2;
            // System.out.println(l+ " " + en +" " + mid);
            if(l+1 == en){
                if((long)en*en <= x)return en;
                else return l;
            }
            // System.out.println((mid*mid));
            if(mid*mid == x)return mid;
            if((long)mid*mid >x)en=mid;
            else l=mid;
        }
        
        return l;
    } 
}