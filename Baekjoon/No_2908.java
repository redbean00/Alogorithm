package Baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class No_2908 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String a = new StringBuilder(sc.next()).reverse().toString();
        String b = new StringBuilder(sc.next()).reverse().toString();

        System.out.println(Integer.parseInt(a) > Integer.parseInt(b) ? a : b);

        sc.close();
    }
}
