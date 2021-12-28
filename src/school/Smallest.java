package school;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        int a[]=new int[10];
        System.out.println("Enter 10 numbers");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<10;i++)
            a[i]= sc.nextInt();
        int small=a[0];
        for(int i=1;i<10;i++) {
            small=small<a[i]?small:a[i];
        }
        System.out.print("Smallest="+small);
    }
}
