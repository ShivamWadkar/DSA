package org.ds.String;

public class StringExamples {

    public static void main(String[] args) {

        // ============================
        // 1. Creating Strings
        // ============================
        String str = "Hello World";
        String str2 = new String("Java");

        System.out.println(str);
        System.out.println(str2);

        // ============================
        // 2. Length
        // ============================
        System.out.println("\nLength: " + str.length());

        // ============================
        // 3. Character at Index
        // ============================
        System.out.println("\nCharacter at 1: " + str.charAt(1));

        // ============================
        // 4. Substring
        // ============================
        System.out.println("\nSubstring(6): " + str.substring(6));
        System.out.println("Substring(0,5): " + str.substring(0,5));

        // ============================
        // 5. Contains
        // ============================
        System.out.println("\nContains 'World': " + str.contains("World"));

        // ============================
        // 6. Equals
        // ============================
        System.out.println("\nEquals: " + str.equals("Hello World"));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("hello world"));

        // ============================
        // 7. Compare
        // ============================
        System.out.println("\nCompareTo: " + "abc".compareTo("abd"));

        // ============================
        // 8. StartsWith / EndsWith
        // ============================
        System.out.println("\nStarts With Hello: " + str.startsWith("Hello"));
        System.out.println("Ends With World: " + str.endsWith("World"));

        // ============================
        // 9. Index Of
        // ============================
        System.out.println("\nIndex Of o: " + str.indexOf('o'));
        System.out.println("Last Index Of o: " + str.lastIndexOf('o'));

        // ============================
        // 10. Replace
        // ============================
        System.out.println("\nReplace: " + str.replace("World", "Java"));

        // ============================
        // 11. Upper / Lower
        // ============================
        System.out.println("\nUpper: " + str.toUpperCase());
        System.out.println("Lower: " + str.toLowerCase());

        // ============================
        // 12. Trim
        // ============================
        String s = "   Java   ";
        System.out.println("\nTrim: '" + s.trim() + "'");

        // ============================
        // 13. Split
        // ============================
        String csv = "Apple,Banana,Mango";

        String[] fruits = csv.split(",");

        System.out.println("\nSplit:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // ============================
        // 14. Join
        // ============================
        String joined = String.join("-", fruits);
        System.out.println("\nJoined: " + joined);

        // ============================
        // 15. To Char Array
        // ============================
        char[] chars = str.toCharArray();

        System.out.println("\nCharacters:");
        for(char c : chars){
            System.out.print(c + " ");
        }

        // ============================
        // 16. Value Of
        // ============================
        int num = 100;
        String number = String.valueOf(num);
        System.out.println("\n\nString Value: " + number);

        // ============================
        // 17. Is Empty
        // ============================
        System.out.println("\nEmpty: " + "".isEmpty());

        // ============================
        // 18. Is Blank (Java 11+)
        // ============================
        System.out.println("Blank: " + "   ".isBlank());

        // ============================
        // 19. Repeat (Java 11+)
        // ============================
        System.out.println("\nRepeat: " + "Hi ".repeat(3));

        // ============================
        // 20. Concatenation
        // ============================
        String first = "Hello";
        String second = "Java";

        System.out.println("\nUsing + : " + first + " " + second);
        System.out.println("Using concat(): " + first.concat(" ").concat(second));

        // ============================
        // 21. StringBuilder
        // ============================
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" DSA");
        sb.insert(4, " Interview");
        sb.delete(4, 14);
        sb.reverse();

        System.out.println("\nStringBuilder: " + sb);

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("\nStringBuildder equals: " + sb1.equals(sb2));

        // ============================
        // 22. Reverse String
        // ============================
        String reversed = reverse("Interview");
        System.out.println("\nReverse: " + reversed);

        // ============================
        // 23. Palindrome
        // ============================
        System.out.println("\nIs Palindrome (madam): " + isPalindrome("madam"));

        // ============================
        // 24. Count Characters
        // ============================
        System.out.println("\nOccurrences of 'l': " + countOccurrences(str, 'l'));

        // ============================
        // 25. Remove Spaces
        // ============================
        System.out.println("\nRemove Spaces: " + str.replace(" ", ""));
    }

    static String reverse(String s){

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }

    static boolean isPalindrome(String s){

        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            if(s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    static int countOccurrences(String s, char target){

        int count = 0;

        for(char c : s.toCharArray()){

            if(c == target)
                count++;
        }

        return count;
    }
}