package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class No_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> hashSet = new HashSet<>();

        String s = br.readLine();
        st = new StringTokenizer(s);
        for(int i = 0; i < N; i++){
            hashSet.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        s = br.readLine();
        st = new StringTokenizer(s);
        for(int i = 0; i < M; i++){
            if(hashSet.contains(Integer.parseInt(st.nextToken())))
                System.out.println("1");
            else
                System.out.println("0");
        }

    }

}
