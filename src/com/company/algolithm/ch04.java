package com.company.algolithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 문자열 뒤집기
 * : N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력
 * input : 2, {lava, spoon}
 * output : {aval, noops}
 * ArrayList
 * StringBuilder().reverse().toString()
 */
public class ch04 {
    public ArrayList<String> solution(String[] arr){
        ArrayList<String> answer = new ArrayList<>();
        for(String x: arr){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args) {
        ch04 T = new ch04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }

        for(String x : T.solution(arr)){
            System.out.println(x);
        }
    }
}
