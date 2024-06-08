
import java.util.Scanner;

public class Clock_and_Strings{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int x;
            if(a>b){
                x=a;
                a=b;
                b=x;
            }

            x=a+1;
            boolean b1 = false;
            while(x<b-1){
                if(c==x) b1=!b1;
                if(d==x) b1=!b1;
                x++;
            }

            if(b1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}