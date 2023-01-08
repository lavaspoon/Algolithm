package com.company.effective.ch01.course02;

public class Settings {
    private boolean useAutoSteering;
    private boolean useABS;
    private Difficulty difficulty;

    /*
   정적 팩터리 메서드
   ㅁ 장점: 1. 다른 클래스에서 여러개의 인스턴스를 만들지 못하도록 방지할 수 있다.
   ㅁ 활용: 클래스 내부에서만 생성자를 통제하고 싶을때, 다른 클래스에서 인스턴스 생성을 못하도록 할때
    */

    //다른 클래스에서 생성자 접근 차단
    private Settings() {}

    private static final Settings SETTINGS = new Settings();
    //정적 팩터리 메서드
    public static Settings newInstance() {
        return SETTINGS;
    }
}
