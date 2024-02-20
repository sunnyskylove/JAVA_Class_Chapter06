package com.ohgiraffers.section04.dto;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 생성자를 이용한 초기화와 설정자를 이용한 초기화의 장단점을 이해할 수 있다 */
        /* 필기.
        *   1. 생성자를 이용한 초기화
        *   - 장점 : setter 메소드를 여러번 호출해서 사용하지 않고, 단 한 번의 호출로 인스턴스 생성 및 초기화 할 수 있다.
        *   - 단점 : i. 필드를 초기화 할 매개변수의 개수를 경우의 수 별로 모두 만들어야 한다.
        *           ii. 호출 시 인자가 많아지는 경우 어떠한 값이 어떤 필드를 의미하는 지 한 눈에 보기 어렵다.
        *   2. 설정자를 이용한 초기화
        *   - 장점 : 필드를 초기화 하는 각각의 값들이 어떤 필드를 초기화 하는지 명확하게 볼 수 있다.
        *   - 단점 : i. 하나의 인스턴스를 생성할 때 한 번의 호출로 끝나지 않는다.
        * */

        /* 목차. 1. 생성자를 이용한 초기화 */
        UserDTO user1 = new UserDTO("ohgiraffers", "ohgiraffers", "ohgiraffers",  new java.util.Date());
        //setter를 만들어놔서 ""안만 입력해도 나옴(Intellij)     // 1) 생성자를 이용한 초기화
        System.out.println(user1.getInfo());

        /* 목차. 2. 기본 생성자와 설정자를 이용한 초기화 */
        UserDTO user2 = new UserDTO();                      // 2) 설정자를 이용한 초기화
        user2.setId("ohgiraffers");
        user2.setPwd("ohgiraffers");
        user2.setName("ohgiraffers");
        user2.setEnrollDate(new java.util.Date());

        System.out.println(user2.getInfo());
    }

}
