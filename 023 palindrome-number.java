class Solution {
    public boolean isPalindrome(int x) {
        int a=x,r,s=0;
        while(a>0){
            r=a%10;
            s=s*10+r;
            a/=10;
        }
        return s==x;
    }
}