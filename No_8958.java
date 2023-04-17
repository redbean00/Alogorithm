import java.util.Scanner;
import java.util.StringTokenizer;

public class No_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            String s = sc.next();
            StringTokenizer st = new StringTokenizer(s, "X");

            int count = 0;
            int result = 0;
            while(st.hasMoreTokens()){
                count = st.nextToken().length();
                for(int j = 1; j <= count; j++){
                    result += j;
                }
            }
            System.out.println(result);
        }
    }
}
