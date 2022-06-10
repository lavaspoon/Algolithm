package com.company.algolithm;

import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 * >  한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력
 *    문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어짐
 * input: teachermode e
 * output: 1 0 1 2 1 0 1 2 2 1 0
 */
public class ch10 {
    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;

        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == t){
                count++;
            }
        }
        System.out.println("count = " + count);

        return answer;
    }
    public static void main(String[] args) {
        ch10 T = new ch10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for(int x: T.solution(str, c)){
            System.out.print(x+ " ");
        }
    }
}
