package interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name");
        String s1=sc.next();
        System.out.println("enter second name");
        String s2=sc.next();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1,c2));
    }
}
