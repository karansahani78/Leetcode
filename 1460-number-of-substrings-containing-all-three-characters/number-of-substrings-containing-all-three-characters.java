class Solution {
    public int numberOfSubstrings(String s) {
        int start =0;
        int count=0;
        int a=0;
        int b=0;
        int c =0;
        /*
        generate all the substring first
        if charAt(end) match a b c then incerase their count
        then while a b c greater 0 means it is present
        so then count the valid substring also 
        then if start of the string find a b or c then remove them and shring thew window

         */
        for(int end = start; end<s.length(); end++){
            if(s.charAt(end)=='a') a++;
            if(s.charAt(end)=='b') b++;
            if(s.charAt(end)=='c') c++;

            while(a>0 & b>0 & c>0){
                // counting all the valid substring
                count+=(s.length()-end);
                if(s.charAt(start)=='a') a--;
                if(s.charAt(start)=='b') b--;
                if(s.charAt(start)=='c') c--;
                start++;
            }

        }
        return count;

    }
}