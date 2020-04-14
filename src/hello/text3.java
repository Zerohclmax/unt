package hello;

import java.util.Scanner;

public class text3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("要求:");
        int x =s.nextInt();
        if (x==1){
            System.out.println("知识就是力量");
        }
        else if (x==2){
            System.out.println("知识");
            System.out.println("就是");
            System.out.println("力量");
        }
        s.close();
    }
}
