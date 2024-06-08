import java.util.*;

public class differentString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){

            String str = sc.next();
            int n = str.length();
            char[] s = str.toCharArray();

            int c=0;
            for(int i=0;i<n-1;i++){
                if(s[i]==s[i+1]) c++;
            }

            if(c==(n-1)) 
                System.out.println("NO");
            else{
                System.out.println("YES");
                char x;
                for(int i=0;i<n;i++){
                    if(s[0]!=s[i]){
                        x=s[0];
                        s[0]=s[i];
                        s[i]=x;
                    }
                }
                String r = new String(s);
                System.out.println(r);
            }
        }
    }
}