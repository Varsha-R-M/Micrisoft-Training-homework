class Solution {
    public int myAtoi(String str) {
        int i=0, sign=1, b=0;
        String s=str.trim();
        System.out.print(s.length());
        if(s.length()==0){return 0;}
        long val=0;
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){i=1; if(s.charAt(0)=='-'){sign=-1;}}
        for(i=i ; i<s.length() && Character.isDigit(s.charAt(i)) ; ++i){
            // System.out.println(val+" "+ (val>Integer.MAX_VALUE));
            if(val>Integer.MAX_VALUE || (val==Integer.MAX_VALUE/10 && s.charAt(i)-'0' > 7)){
                if(sign==-1){return Integer.MIN_VALUE;}
                return Integer.MAX_VALUE;
            }
            val=val*10 + s.charAt(i)-'0';
        }
        if(val>Integer.MAX_VALUE){
            if(sign==-1){return Integer.MIN_VALUE;}
            return Integer.MAX_VALUE;
        }
        return (int)  val*sign;
    }
}