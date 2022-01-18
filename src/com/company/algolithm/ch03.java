package com.company.algolithm;

import java.util.Scanner;

public class ch03 {
    public String solution(String str){
        String answer = "";
        int max = 0;

        String[] result = str.split(" ");
        System.out.println("result = " + result);
        for(String x : result){
            if(x.length()>max) {
                max = x.length();
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ch03 T = new ch03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}

