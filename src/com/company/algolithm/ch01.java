package com.company.algolithm;

import java.util.*;

//문자찾기
public class ch01 {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        /*
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == t){
                answer++;
            }
        }
        */
        for(char x : str.toCharArray()){
            if(x == t){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ch01 T = new ch01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
