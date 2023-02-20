package com.company.algolithm;

import java.util.Scanner;

/**
 * 입력한 문자열 대소문자 변환 23.02.20 복습완료
 */
public class ch02 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) {
                answer+=Character.toUpperCase(x);;
            } else {
                answer+=Character.toLowerCase(x);;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ch02 T = new ch02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
