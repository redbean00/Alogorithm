package Baekjoon;

import java.util.Scanner;

public class No_20546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //현금을 입력받아서 준현과 성민의 보유 현금 변수를 각각 선언
        int money = sc.nextInt();
        int jMoney = money;
        int sMoney = money;

        //준현, 성민의 주식 수
        int jStock = 0;
        int sStock = 0;

        //준현, 성민의 최종 보유 자산
        int jTotal = 0;
        int sTotal = 0;

        //주가를 입력 받을 배열과 주가 상승 하락을 기록할 배열
        int[] stock = new int[14];
        int[] upDown = new int[14];

        for(int i = 0; i < stock.length; i++)
            stock[i] = sc.nextInt();

        for(int i = 0; i < upDown.length - 1; i++){
            if(stock[i] < stock[i+1])
                upDown[i+1] = 1;
            else if(stock[i] > stock[i+1])
                upDown[i+1] = -1;
            else upDown[i+1] = 0;
        }

        //준현 주식 매도
        for(int i = 0; i < stock.length; i++){
            if(jMoney >= stock[i]){
                jStock = jMoney / stock[i];
                jMoney = jMoney % stock[i];
            }
        }
        jTotal = jMoney + stock[13] * jStock;

        //성민 주식 매도&매수
        for(int i = 0; i < upDown.length - 3; i++){
            if((upDown[i] + upDown[i+1] + upDown[i+2] == -3) && sMoney >= stock[i+2]){
                sStock += sMoney / stock[i+2];
                sMoney = sMoney % stock[i+2];
            }
            if((upDown[i] + upDown[i+1] + upDown[i+2] == 3) && sStock > 0){
                sMoney += sStock * stock[i+2];
                sStock = 0;
            }
        }
        sTotal = sMoney + stock[13] * sStock;

        //내기 결과
        if(sTotal > jTotal)
            System.out.println("TIMING");
        else if(jTotal > sTotal)
            System.out.println("BNP");
        else System.out.println("SAMESAME");

    }
}
