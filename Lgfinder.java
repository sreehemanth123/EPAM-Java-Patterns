public class LongestWordFinder {
    public static String findLongestWord(String line) {
        if (line == null || line.isEmpty()) {
            return null;
        }

        String[] words = line.split(" ");
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String line = "abcd abcdefg abcdef";
        System.out.println("Longest word: " + findLongestWord(line));
    }
}
