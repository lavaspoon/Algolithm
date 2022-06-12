package com.company.algolithm;

import java.util.Scanner;

/**
 * 문자열 압축
 * >  알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우
 *    문자 바로 오른쪽에 반복 횟수를 표기한다.(단, 반복횟수가 1인 경우는 생략한다)
 * input: KSTTTSEEKFKKKDJJGG
 * output: KST3SE2KFK3DJ2G2
 */
public class ch11 {
    public String solution(String str){
        String answer = "";

        return answer;
    }
    public static void main(String[] args) {
        ch11 T = new ch11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
