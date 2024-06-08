import java.util.*;

public class myFirstSortingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        int x[] = new int[t];
        int y[] = new int[t];

        for(int i=0;i<t;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }

        int a;
        for(int i=0;i<t;i++){
            if(x[i]>y[i]){
                a=x[i];
                x[i]=y[i];
                y[i]=a;
            }
        }

        for(int i=0;i<t;i++){
            System.out.println(x[i]+" "+y[i]);
        }
    }
}
