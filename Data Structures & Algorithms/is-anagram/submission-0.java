class Solution {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        for(char ch='a'; ch<='z'; ch++) {

            int count1 = 0;
            int count2 = 0;

            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == ch)
                    count1++;
            }

            for(int i=0; i<t.length(); i++) {
                if(t.charAt(i) == ch)
                    count2++;
            }

            if(count1 != count2)
                return false;
        }

        return true;
    }
}