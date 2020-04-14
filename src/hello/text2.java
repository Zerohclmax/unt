package hello;

import java.util.Scanner;

public class text2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        int num1 =s.nextInt();
        System.out.print("请输入第二个数字:");
        int num2 =s.nextInt();
        System.out.println("两数积是:"+num2*num1);
        s.close();

    }
}
