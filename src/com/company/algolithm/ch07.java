package com.company.algolithm;

import java.util.Scanner;

/**
 * 회문문자열
 * > 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력
 * input: gooG
 * output: YES
 */
public class ch07 {
    public String solution(String str){
        String answer = "";
        char[] s = str.toUpperCase().toCharArray(); //String > Char Array
        int lt = 0, rt = s.length-1;

        while(lt<rt){ //문자열의 중간까지만 for문을 돌리는 방법
            if(s[lt] != s[rt]){
                answer = "NO";
                break;
            } else {
                answer = "YES";
                lt++;
                rt--;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        ch07 T = new ch07();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
