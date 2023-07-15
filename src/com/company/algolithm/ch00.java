package com.company.algolithm;

import java.util.Scanner;

public class ch00 {
    public int solution(String str){
        String answer = "";
        char[] chars = str.toUpperCase().toCharArray(); //String > Char Array

        for(char x: chars){
            if(Character.isDigit(x)){
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        ch00 T = new ch00();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
