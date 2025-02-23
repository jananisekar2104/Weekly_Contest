/*
Write a program to print N numbers starting from 2. Take N as input and print from 2 to N;
Input Format
6
Constraints
3<=N<=10^3
Output Format
2 3 4 5 6
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=2;i<=n;i++)
        System.out.print(i+" " );
    }
}
