package hello;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int flat=0,x=0;
        while(flat==0){
            System.out.print("请输入一个数字:");
            x =s.nextInt();
            if (x<8&&x>0){
                flat=1;
            }
            else{
                System.out.println("输入错误！");
            }
        }
        switch (x){
            case 1:
                System.out.print("星期一");break;
            case 2:
                System.out.print("星期二");break;
            case 3:
                System.out.print("星期三");break;
            case 4:
                System.out.print("星期四");break;
            case 5:
                System.out.print("星期五");break;
            case 6:
                System.out.print("星期六");break;
            case 7:
                System.out.print("星期日");break;
        }
        s.close();
    }
}
