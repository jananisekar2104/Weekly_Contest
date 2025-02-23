/*
Write a program which takes the following input and prints them one by one. 1. An whole number 2. A letter 3. A number with fractional part 4. A word
Input Format
34 S 56.1 PowerRanger
Constraints
2 ≤ whole numer ≤ 10^6
Output Format
34
S
56.1
PowerRanger
Sample Input 0
34
S
56.7
Str
Sample Output 0
34
S
56.7
Str
*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int wholeNumber = scanner.nextInt(); 
        char letter = scanner.next().charAt(0); 
        double fractionalNumber = scanner.nextDouble();
        String word = scanner.next(); 
        System.out.println(wholeNumber);
        System.out.println(letter);
        System.out.println(fractionalNumber);
        System.out.println(word);
        
        
    }
}
