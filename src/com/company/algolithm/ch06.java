package com.company.algolithm;

import java.util.Scanner;

/**
 * 중복문자제거
 * > 소문자로 된 한개의 문자열이 입력되며 중복된 문자를 제거하고 출력,
 * input: ksekkset
 * output: ksek
 */
public class ch06 {
    public String solution(String str){
        String answer = "";
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(!result.contains(String.valueOf(str.charAt(i)))){
                result += String.valueOf(str.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ch06 T = new ch06();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
