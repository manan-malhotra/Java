import java.util.*;
public class DigitSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int x= summation(a);
        System.out.println(x);
        sc.close();
    }
    public static int summation(int a){
        int rem,sum=0;
        if (a>=10){
            while (a>0){
                rem=a%10;
                sum+=rem;
                a/=10;
            }
            return sum;
        }else{
            return -1;
        }
        

    }
}