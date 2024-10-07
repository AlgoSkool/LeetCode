public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());
        
        // Merge the characters in alternating order
        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        
        // Append any remaining characters from the longer word
        if (minLength < word1.length()) {
            result.append(word1.substring(minLength));
        }
        if (minLength < word2.length()) {
            result.append(word2.substring(minLength));
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));  // Output: "apbqcr"
        
        word1 = "ab";
        word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));  // Output: "apbqrs"
    }
}
