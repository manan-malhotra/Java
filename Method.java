import java.util.*;
public class Method{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        calculate(a,b,c);
        sc.close();
        
    }
    public static void calculate(int a,int b,int c) {
        int d=a+b+c;
        System.out.println(d);
    }
}