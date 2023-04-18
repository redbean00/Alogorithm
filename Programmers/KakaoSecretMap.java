package Programmers;

import java.util.Arrays;

public class KakaoSecretMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));

    }


    public static String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer = {};

        int[][] map = new int[n][n];


        for(int i = 0; i < n; i++) {
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);

            if (s1.length() < n) {
                while (true) {
                    if (s1.length() == n)
                        break;
                    s1 = "0" + s1;
                }
            }
            if (s2.length() < n){
                while (true) {
                    if (s2.length() == n)
                        break;
                    s2 = "0" + s2;
                }
            }

            System.out.println(s1 + " " + s2);


            for(int j = 0; j < n; j++){
                if(s1.charAt(j) == '0' && s2.charAt(j) == '0'){
                    map[i][j] = 0;
                }
                if(s1.charAt(j) == '1' || s2.charAt(j) == '1'){
                    map[i][j] = 1;
                }
            }
        }

        answer = new String[n];
        for(int i = 0; i < n; i++){
            answer[i] = "";
            for(int j = 0; j < n; j++){
                if(map[i][j] == 1){
                    answer[i] += "#";
                }else if(map[i][j] == 0){
                    answer[i] += " ";
                }
            }
        }

        return answer;

    }
}

