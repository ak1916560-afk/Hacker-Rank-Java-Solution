import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
         
        // Initialize smallest and largest with the first substring of length k
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Iterate through all possible substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String currentSubstring = s.substring(i, i + k);
            
            // Compare and update smallest
            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }
            
            // Compare and update largest
            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }
        }
        
    
    
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}