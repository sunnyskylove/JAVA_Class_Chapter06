package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    /* 필기.
    *   최초 할당 이후 변경 불가능한 불변의 상태를 나타낸다.
    *   이를 통해 객체의 안정성과 안전을 보장할 수 있다.
    *   예기치 않은 상태 변경을 방지하는데 도움이 된다.
    * */

    // 연습. 1. 자동차 (Car 클래스)
    private final Car car = new Car();
    // Alt + Enter 로 Car 클래스 하나 생성 클릭해서 클래스 하나 더 생성됨
    // (혹시 패키지 생성 안되면 직접 생성해서 만들어도 됨)


    // 연습. 2. 카레이서
    public void startUp(){

        car.startUp();
    }


    // 사용자가 악셀밟는 메소드 호출_가속하기
    public void stepAccelator(){

        car.go();
    }

    // 브레이크 밟는 메소드 호출
    public void stepBreak(){

        car.stop();
    }

    //시동을 꺼라 메소드 호출
    public void turnOff(){

        car.turnOff();
    }

    }