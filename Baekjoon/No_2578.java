package Baekjoon;

import java.util.Scanner;

public class No_2578 {
    static int N = 5;
    static int[][] bingo = new int[N][N];
    static int[][] location = new int[26][2];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bingo[i][j] = sc.nextInt();

                location[bingo[i][j]][0] = i;
                location[bingo[i][j]][1] = j;

            }
        }

        int count = 0;

        for (int i = 0; i < 25; i++) {
            int a = sc.nextInt();
            int r = location[a][0];
            int c = location[a][1];

            bingo[r][c] = 0;
            count++;

            if (check()) {
                break;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int rowCnt = 0;
            int colCnt = 0;
            for (int j = 0; j < N; j++) {
                if (bingo[i][j] == 0) {
                    rowCnt++;
                }
                if (bingo[j][i] == 0) {
                    colCnt++;
                }
            }
            if (rowCnt == N) {
                cnt++;
            }
            if (colCnt == N) {
                cnt++;
            }
        }

        int leftCnt = 0;
        int rightCnt = 0;

        for (int i = 0; i < N; i++) {
            if (bingo[i][i] == 0) {
                leftCnt++;
            }
            if(bingo[i][N-1-i] == 0){
                rightCnt++;
            }
        }

        if(leftCnt == N){
            cnt++;
        }
        if(rightCnt == N){
            cnt++;
        }

        if(cnt >= 3){
            return true;
        }
        return false;
    }

}