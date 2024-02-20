package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testParameterPrimaryType(int num) {

        System.out.println("매개변수로 전달 받은 값 : " + num);

    }

    public void testParameterPrimaryTypeArray(int[] iarr){

        /* 필기.
        *   배열의 주소가 전달 될 것이다.
        *   즉 인자로 전달하는 배열과 매개변수로 전달 받은 배열은 서로 동일한 배열을 가리킨다.(얕은 복사)
        * */

        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        System.out.println("배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }

        System.out.println();


        iarr[0] = 99;
        System.out.print("변경 후 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i] + " " );

        }

        System.out.println();
    }

    public void testParameterClassType(RectAngle rectangle){     // 자료형 자리에 클래스가 들어와 있는것이다.(앞 RectAngle)

        /* 필기.
        *   인스턴스 주소가 전달된다.
        *   즉, 인자로 전달하는 인스턴스와 매개변수로 전달 받은 인스턴스는 동일한
        *   인스턴스를 가리킨다. (얕은 복사)
        * */

        System.out.println("매개변수로 전달 받은 값 : " + rectangle);

        System.out.println("변경 전 사각형의 넓이와 둘레===================================");
        rectangle.calcArea();
        rectangle.calcRound();

        rectangle.setWidth(100);            // 자동형변환(double로 가니깐~~)
        rectangle.setHeight(100);

        System.out.println("변경 후 사각형의 넓이와 둘레=======================================");
        rectangle.calcArea();
        rectangle.calcRound();

    }

    public void testVariableLengthArrayParameter(String name, String...hobby) {     // 몇개를 보낼지 몰라서 ...(가변인자)으로 표현

        /* 필기.
        *   가변길이(...)의 배열은 몇 개가 매개변수로 전달 될 지 모르는 상황이기 때문에 이름과
        *   구분하기 위해 뒤쪽에 작성해야 한다. (가변_중복 안됨, 마지막 딱 1개만~!!)
        *   앞쪽에 작성하는 경우, 에러가 발생한다.
        * */

        System.out.println("이름 : " + name);
        System.out.println("취미의 개수 : " + hobby.length);     // 취미의 개수 모르기 때문에

        System.out.println("취미 : ");                          // 취미 조건문 달기~!!
        for(int i = 0; i < hobby.length; i++){
            System.out.println(hobby[i] + " ");
        }

        System.out.println();

    }


}
