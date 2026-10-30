import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
         
        // Clear case sensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // If lengths don't match, they aren't anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Frequency array for english letters a-z
        int[] frequencies = new int[26];
        
        // Populate frequencies
        for (int i = 0; i < a.length(); i++) {
            frequencies[a.charAt(i) - 'a']++;
            frequencies[b.charAt(i) - 'a']--;
        }
        
        // The rest of the template code handles the verification:
        for (int count : frequencies) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}