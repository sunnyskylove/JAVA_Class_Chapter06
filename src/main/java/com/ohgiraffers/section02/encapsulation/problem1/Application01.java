package com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점(1) */
        /* 필기. 필드에 올바르지 않는 값이 들어가도 통제가 불가능하다. */

        // 1번 몬스터 생성
        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        System.out.println("monster1의 name : " + monster1.name);
        System.out.println("monster1의 hp : " + monster1.hp);

        // 2번 몬스터 생성
        Monster monster2 = new Monster();
        monster2.name = "헐크";
        monster2.hp = -200;
        // -도 입력 가능!(검증되지 않는 이상한 값을 넣어도 필드에 넣을 수 있다.)
        // 따라서 이걸 0으로 처리되게 할 수 있음(원본인 Monster 클래스에서)

        System.out.println("monster2의 name : " + monster2.name);
        System.out.println("monster2의 hp :" + monster2.hp);

        // 3번 몬스터 생성
        Monster monster3 = new Monster();
        monster3.name = "프랑켄슈타인";
        monster3.setHp(200);
        // 메소드에 직접적으로 접근하지 않고도~~?? (hp가 저장되어있는 것임)
        // Monster 클래스에 조건(0이하이면 안됨)을 만들어줘서,
        // 만약에 200이 아닌 -로 하면, 초기화값 0으로 변경 출력됨을 알 수 있다.

        System.out.println("monster3의 name : " + monster3.name);
        System.out.println("monster3의 hp : " + monster3.hp);


    }

}
