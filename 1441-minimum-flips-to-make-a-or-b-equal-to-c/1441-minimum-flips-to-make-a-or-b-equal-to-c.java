class Solution {
    public int minFlips(int a, int b, int c) {
        String s1=Integer.toBinaryString(a);
        String s2=Integer.toBinaryString(b);
        String t=Integer.toBinaryString(c);
        int maxLength=Math.max(s1.length(),s2.length());
        maxLength=Math.max(maxLength,t.length());
        s1=String.format("%" + maxLength + "s", s1).replace(' ', '0');
        s2=String.format("%" + maxLength + "s", s2).replace(' ', '0');
        t=String.format("%" + maxLength + "s", t).replace(' ', '0');
        int count=0;
        for(int i=0;i<maxLength;i++){
            int ch1=s1.charAt(i)-'0';
            int ch2=s2.charAt(i)-'0';
            int t2=t.charAt(i)-'0';
            if((ch1|ch2)!=t2){
                if(ch1==1 && ch2==1){
                    count+=2;
                }
                else{
                    count++;
                }
            }
        }
        return count;
    }
}