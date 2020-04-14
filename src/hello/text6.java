package hello;

public class text6 {
    public static void main(String[] args){
        int x=0,sum=0;
        while(x<=1000){
            x+=1;
            if(x%7==0){
                sum+=x;
            }

        }
        System.out.println("1000以内不能被7整除和是:"+sum);
    }
}
