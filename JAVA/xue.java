import java.util.Scanner;
public class xue{
    public static void main(String args[]){
        System.out.println("请输入一个三位数:");
         Scanner sc=new Scanner(System.in);
         int i= sc.nextInt();
         int a=i/100;
         int b=i/10%10;
         int c=i%10;
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
    }
}