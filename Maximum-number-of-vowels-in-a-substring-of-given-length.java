class Solution {
    
    public int maxVowels(String s, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        int maxCount = count;


        for (int i = k; i < s.length(); i++) {

            char leftChar = s.charAt(i - k);
            if (leftChar == 'a' || leftChar == 'e' || leftChar == 'i' || leftChar == 'o' || leftChar == 'u') {
                count--;
            }

            char rightChar = s.charAt(i);
            if (rightChar == 'a' || rightChar == 'e' || rightChar == 'i' || rightChar == 'o' || rightChar == 'u') {
                count++;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}