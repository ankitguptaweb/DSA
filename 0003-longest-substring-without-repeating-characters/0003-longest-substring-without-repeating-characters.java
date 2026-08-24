// import java.util.HashSet;
// import java.util.Set;

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int res = 0;
//         for (int i = 0; i < n; i++) {
//             Set<Character> charSet = new HashSet<>();
//             for (int j = i; j < n; j++) {
//                 if (charSet.contains(s.charAt(j))) {
//                     break;
//                 } else {
//                     charSet.add(s.charAt(j));
//                     res = Math.max(res, j - i + 1);
//                 }
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
}