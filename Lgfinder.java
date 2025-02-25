public class LongestWordFinder {
    public static String findLongestWord(String line) {
        if (line == null || line.isEmpty()) {
            return null;
        }

        String[] words = line.trim().split("\\s+");  
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord.isEmpty() ? null : longestWord;
    }

    public static void main(String[] args) {
        System.out.println(findLongestWord("abcd abcdefg abcdef")); // Expected: abcdefg
        System.out.println(findLongestWord("qwerty1234 xyz abc")); // Expected: qwerty1234
        System.out.println(findLongestWord("    ")); // Expected: null
        System.out.println(findLongestWord("singleword")); // Expected: singleword
        System.out.println(findLongestWord(null)); // Expected: null
    }
}
