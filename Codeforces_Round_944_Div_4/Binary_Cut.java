
import java.util.Scanner;

public class Binary_Cut {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){

            String s = sc.next();
            int n = 1; // no. of blocks
            int p = 0; //pointer
            int e = 0; // 1 if '0' -> '1'

            for(int i=1;i<s.length();i++){ 

                if(s.charAt(p)!=s.charAt(i)) {
                    if(s.charAt(p)=='0' && s.charAt(i)=='1') e = 1;
                    n++;
                    p = i;
                }
            }
            System.out.println((n-e));
        }
    }
}
