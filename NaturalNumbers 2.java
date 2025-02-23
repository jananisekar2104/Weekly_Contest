/*
Write a program which takes a value N and prints the sum of N natural numbers. Natural numbers start from 1.
Explanation: Sum of natural numbers from 1 to N, here N is 5, so 1+2+3+4+5 is 15. Input N = 5; Expected output : 15
Input Format
5
Constraints
1<= N <= 10^2
Output Format
15
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
       Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        if(N<1 || N>100){
            return;
        }else{
            int ans = N*(N+1)/2;
            System.out.println(ans);
        }
    }
    
}
