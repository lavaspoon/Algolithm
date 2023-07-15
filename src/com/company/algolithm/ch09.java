package com.company.algolithm;

import java.util.Scanner;

/**
 * 숫자추출 23.02.22 복습완료
 * > 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * input: g0en2T0s8eSoft
 * output: 208
 */
public class ch09 {
    public int solution(String str){
        String answer = "";
        char[] s = str.toCharArray();
        for(int i=0; i<s.length; i++){
            if(Character.isDigit(s[i])){
                answer += s[i];
            }
        }

        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        ch09 T = new ch09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
