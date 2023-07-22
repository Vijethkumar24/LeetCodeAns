class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        char[] chars = s.toCharArray();

        while (i < j) {
            // Find the leftmost vowel
            while (i <n && !isVowel(chars[i])) {
                i++;
            }
            // Find the rightmost vowel
            while (j >= i && !isVowel(chars[j])) {
                j--;
            }
            // Swap the vowels
            if (i < j && isVowel(chars[i]) && isVowel(chars[j])) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            i++;
            j--;
        }
        return String.valueOf(chars);
    }
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
