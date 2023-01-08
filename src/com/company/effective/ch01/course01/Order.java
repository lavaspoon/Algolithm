package com.company.effective.ch01.course01;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;

    /*
    정적 팩터리 메서드
    ㅁ 장점: 1. 원하는 객체의 특징을 팩터리 메서드의 이름으로 표현할 수 있다.
    ㅁ 활용: 생성자의 네임이 중복되는 경우, 생성자의 이름을 다르게 구분하고 싶은 경우에 고려해봐라
     */
    public static Order primeOrder(Product product) {
        Order order = new Order(); //기본 생성자
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
}
