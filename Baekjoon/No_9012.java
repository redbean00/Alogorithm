package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class No_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            foo(sc.next());
        }
    }

    public static void foo(String s){
        Stack<Character> stack = new Stack<>();

        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }

            i++;
        }

        if(stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
