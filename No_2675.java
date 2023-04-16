import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        System.out.println(t);

        String[] str = null;
        for(int i = 0; i < t; i++){
            str = br.readLine().split(" ");
            int r = Integer.parseInt(str[0]);

            for(byte b : str[1].getBytes()){
                for(int k = 0; k < r; k++){
                    System.out.print((char) b);
                }
            }
            System.out.println();
        }
        br.close();

    }
}
