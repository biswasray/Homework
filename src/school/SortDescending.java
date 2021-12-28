package school;
import java.util.*;
public class SortDescending {
    public static void main(String[] args) {
        int a[]=new int[10];
        System.out.println("Enter 10 numbers");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<10;i++)
            a[i]= sc.nextInt();
        for(int i=0;i<10;i++) {
            for(int j=i+1;j<10;j++) {
                if(a[j]>a[i]) {
                    a[i]+=a[j];//int t=a[i];
                    a[j]=a[i]-a[j];//a[i]=a[j];
                    a[i]=a[i]-a[j];//a[j]=t;
                }
            }
        }
        for (int i:a)
            System.out.print(i+"  ");
    }
}
