package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
//    String kind;
//    int hp;
//
//    public void setName(String name) {
//
//        this.kind = name;
//
//
//    }
//
//    public void setHp(int hp) {
//
//        this.hp = hp;
//
//        if (hp > 0) {
//            this.hp = hp;           // 그냥 0으로 처리하면 초기화 처리되어 0으로 변하게 된다.
//
//        } else {
//            this.hp = 0;
//        }
//    }

    //

    String kinds;                                   // 1) 사용할 " 자료, 변수" 만들어준다.
    int hp;

    public void setName(String kinds) {              // 2) 불러올 this. 만들기위해 메소드(들) 생성i

        this.kinds = kinds;              // * this.'변수' 를 함께 변경해줘야만 오류안남  //??? kinds로 바뀌어지는 곳 재확인!!!!

    }

    public void setHp(int hp) {

        if (hp > 0) {
            this.hp = hp;

        } else {
            this.hp = 0;

        }

    }

    public String getInfo() {

        return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";

    }

}