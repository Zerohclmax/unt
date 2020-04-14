package hello;

import java.util.Scanner;

public class text7 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("请输入一个数:");
        int x=s.nextInt();
        int sum=1,y=x;
        while(x>0){
            sum*=x;
            x-=1;
        }
        System.out.println(y+"的阶乘是:"+sum);
        s.close();
    }
}
