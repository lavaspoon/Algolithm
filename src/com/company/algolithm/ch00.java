package com.company.algolithm;

import java.util.Scanner;

public class ch00 {
    public String solution(String str){
        String answer = "";
        int max = 0;

        String[] data = str.split(" ");

        for(String x: data){
            if(max < x.length()){
                max = x.length();
                answer = x;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        ch00 T = new ch00();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
