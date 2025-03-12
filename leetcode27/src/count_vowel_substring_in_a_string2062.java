public class count_vowel_substring_in_a_string2062 {
    //glt wala(ye koi sa bhi 5 vovel count kr lega )

//        public int countVowelSubstrings(String word) {
//            int l = word.length(),i=0,count=0,j=0,count1=0;
//            while(i<l){
//                j=i;
//                if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
//                    count++; i++;
//                    if(count==5){
//                        count1++;
//                        count=0;
//                    }
//               }
//                else{
//                    i= i-j;
//                }
//                i++;
//            }
//            return count1;
//        }

//______________________________________________________________________________//
//O(n^3)
    public int countVowelSubstrings(String word) {
        int count = 0, l = word.length();
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                if (fun(word.substring(i, j + 1))) {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean fun(String s) {
        if (s.length() < 5) return false;
        boolean a = false, e = false, i = false, o = false, u = false;
        for (char ch : s.toCharArray()) {
            if (ch == 'a') a = true;
            else if (ch == 'e') e = true;
            else if (ch == 'i') i = true;
            else if (ch == 'o') o = true;
            else if (ch == 'u') u = true;
            else return false;
        }
        return a && e && i && o && u;
    }
//-------------------------------------------------------------------------------------------------------//

//Optimized O(n2)
}
