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
        //s 뒤의 문자가 s와 떨어진 거리를 구하기위해 왼쪽에서 탐색 1001 1002 1003 1004 0 1 2 3 4
        for(int i=0;i<s.length();i++) {
            //배열의 index가 입력된 문자인지 체크
            if (s.charAt(i) == t) { //한번에 발견된 경우 0 저장
                p = 0;
            } else { //입력된 문자가 아닌 경우 p 증가
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        //s 의 문자가 s와 떨어진 거리를 구하기위해 오른쪽에서 탐색
        for(int i=s.length()-1;i>=0;i--) {
            //배열의 index가 입력된 문자인지 체크
            if (s.charAt(i) == t) { //한번에 발견된 경우 0 저장
                p = 0;
            } else { //입력된 문자가 아닌 경우 p 증가, 단 이미 앞에서 세팅한 값이 있기 때문에 비교해서 작은 값만 넣어준다.
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

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
