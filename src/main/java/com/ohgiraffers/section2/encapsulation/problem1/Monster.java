package com.ohgiraffers.section2.encapsulation.problem1;

public class Monster {

    String name;   // 몬스터 이름
    int hp;        // 몬스터 체력

    public  void setHp(int hp){                     //1 번)_내부

        if(hp > 0){            //int 체력으로 했으니깐 0이하일때만 처리되게 만들기

            /* 필기.
            *   this 는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다.
            *   지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선 접근하기 때문에
            *   전역변수에 접근하기 위해서 this. 을 명시해준다.
            * */
            System.out.println("양수의 값이 입력되어서 정상적으로 변경되었습니다. ");
            this.hp = hp;
            // this 로 인해서 위의 hp와 같다고(int.hp = 작성하는 매개변수) 만들어준것임
            // 그 전엔 다른 hp임 / 해당 변수 클릭시, 같은색깔과 동시 지정된 것으로도 확인 가능
            // 메소드를 통해서 필드에 간접적으로 접근한다.

        } else {

            System.out.println("0보다 작거나 같은 값이 몬스터의 체력을 0으로 변경합니다.");
            this.hp = 0;

        }

    }

}
