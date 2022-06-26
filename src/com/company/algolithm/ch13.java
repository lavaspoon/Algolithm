package com.company.algolithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  큰 수 출력하기
 *  > N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력 (첫 번째 수는 무조건 출력)
 *  input : 6
 *          7 3 9 5 6 12
 *  output : 7 9 6 12
 */
public class ch13 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        return answer;
    }
    public static void main(String[] args) {
        ch13 T = new ch13();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x: T.solution(n, arr)){
            System.out.println(x+"");
        }
    }
}
