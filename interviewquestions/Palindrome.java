package interviewquestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        isPalindrome(s);
    }

    private static void isPalindrome(String s) {
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.println("it is not a palindrome");
                return;
            }
        }
        System.out.println("it is a palindrome");
    }
}
