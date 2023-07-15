package com.company.algolithm;

import java.util.Scanner;

/**
 * 팰린드롬 구분하기 23.02.22 복습완료
 * > 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력
 * (단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.)
 * input : found7, time: study;  Yduts; emit, 7Dnuof
 * output: YES
 */
public class ch08 {
    public String solution(String str) {
        String answer = "";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        char[] tmp = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt<rt) {
            if(tmp[lt] != tmp[rt]){
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
        ch08 T = new ch08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
