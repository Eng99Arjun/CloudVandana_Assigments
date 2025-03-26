import java.util.HashMap;
import java.util.Scanner;

class Anagram {

    static boolean checkAnagram(String s1, String s2) {

        // Removing whitespaces and converting to lowercase for case-insensitive comparison
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();

        // Counting characters in the first string
        for (char c : s1.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        // Subtracting character counts using the second string
        for (char c : s2.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                return false;
            }
            hashMap.put(c, hashMap.get(c) - 1);
            if (hashMap.get(c) == 0) {
                hashMap.remove(c);
            }
        }

        // If the map is empty, the strings are anagrams
        return hashMap.isEmpty();
    }

    public static void main(String[] arg) {

        //Taking Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = scanner.nextLine();

        //Printing output
        System.out.println(checkAnagram(s1,s2));
        scanner.close();
    }
}