public class LongestWordFinder {
    public static String findLongestWord(String line) {
        if (line == null || line.isEmpty()) {
            return null;
        }

        String[] words = line.trim().split("\\s+");
        if (words.length == 0) {
            return null;
        }

        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        System.out.println(findLongestWord("abcd abcdefg abcdef")); // Expected: abcdefg
        System.out.println(findLongestWord("qwerty1234 xyz abc")); // Expected: qwerty1234
        System.out.println(findLongestWord("    ")); // Expected: null
        System.out.println(findLongestWord("singleword")); // Expected: singleword
        System.out.println(findLongestWord(null)); // Expected: null
    }
}

