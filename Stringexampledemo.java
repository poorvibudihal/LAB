package Stringexample01;

public class Stringexampledemo {

	    // Q1. Checking if a given string is null or contains only whitespace
	    public static boolean isNullOrEmpty(String str) {
	        // Checks if null or if the trimmed version is empty (covers whitespace only)
	        return str == null || str.trim().isEmpty();
	    }

	    // Q2. Counting how many times a substring appears in a main string
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }
	        int count = 0;
	        int index = 0;
	        // Use indexOf to find occurrences iteratively
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }

	    // Q3. Reversing the characters in a string
	    public static String reverseString(String str) {
	        if (str == null) return null;
	        // Efficiently reverse using StringBuilder
	        return new StringBuilder(str).reverse().toString();
	    }

	    // Q4. Checking if a string reads the same backward as forward (ignoring case/punctuation)
	    public static boolean isPalindrome(String str) {
	        if (str == null) return false;
	        // Remove non-alphanumeric characters and convert to lowercase
	        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
	        return cleanedStr.equals(reversedStr);
	    }

	    // Q5. Eliminating all whitespace characters from a string
	    public static String removeWhitespace(String str) {
	        if (str == null) return null;
	        // Use regex to replace all whitespace characters
	        return str.replaceAll("\\s", "");
	    }

	    public static void main(String[] args) {
	        // --- Examples ---
	        
	        // Test Q1
	        String testQ1 = "   ";
	        System.out.println("Q1: Is '" + testQ1 + "' null/whitespace? " + isNullOrEmpty(testQ1));

	        // Test Q2
	        String mainStr = "banana";
	        String subStr = "na";
	        System.out.println("Q2: Occurrences of '" + subStr + "' in '" + mainStr + "': " + countOccurrences(mainStr, subStr));

	        // Test Q3
	        String original = "Hello";
	        System.out.println("Q3: Reverse of '" + original + "': " + reverseString(original));

	        // Test Q4
	        String pal = "A man, a plan, a canal: Panama";
	        System.out.println("Q4: Is '" + pal + "' a palindrome? " + isPalindrome(pal));

	        // Test Q5
	        String spaced = "  H e l l o  W o r l d  ";
	        System.out.println("Q5: Remove spaces from '" + spaced + "': '" + removeWhitespace(spaced) + "'");
	    }
	}



