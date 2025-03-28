package interviewquestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fibonacci(n);
        System.out.println();
        System.out.print(0+" "+1+" ");
        FibonacciRec(0,1,n);
    }
    static void Fibonacci(int n){
        int k=0;
        int i=0;int j=1;
        System.out.print(i+" "+j+" ");
        while(k<n){
            int temp=i+j;
            System.out.print(temp+" ");
            i=j;
            j=temp;
            k++;
        }
    }
    static  void FibonacciRec(int i,int j,int n){
        if(n==0){
            return;
        }
        System.out.print(i+j+" ");
        FibonacciRec(j,i+j,--n);
    }
}
