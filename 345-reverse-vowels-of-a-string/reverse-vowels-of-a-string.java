class Solution {
    public String reverseVowels(String st) {
        int n = st.length();
        char ch[] = st.toCharArray();
        int s = 0;
        int e = n-1;
        String arr = "aeiouAEIOU";
        while(e>s){
            while(s<e && arr.indexOf(ch[s])==-1){
                s++;
            }
            while(s<e && arr.indexOf(ch[e])==-1){
                e--;
            }
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;

            s++;
            e--;
        }
        return new String(ch);
    }
}