import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        // Trim leading and trailing whitespaces first
s = s.trim();

// If the string is empty after trimming, there are 0 tokens
if (s.length() == 0) {
    System.out.println(0);
    scan.close();
    return;
}

// Split using the regex containing all specified delimiters
String[] tokens = s.split("[^a-zA-Z]+");

// Print the total number of tokens
System.out.println(tokens.length);

// Print each token on a new line
for (String token : tokens){
    System.out.println(token);
}
scan.close();
    }
}
    
