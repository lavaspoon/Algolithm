package com.company.effective.ch01.course01;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;

    /*
    정적 팩터리 메서드
    장점: 1. 원하는 객체의 특징을 팩터리 메서드의 이름으로 표현할 수 있다.
    사용하는 경우: 생성자의 시그니처 네임이 중복되는 경우에, 즉 생성자를 2개이상 생성할때 활용
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
