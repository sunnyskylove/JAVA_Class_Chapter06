package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    /* 필기.
    *   접근제한자
    *   클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    *   1. public : 모든 패키지에 접근 허용
    *   2. protected : 동일 패키지에 접근 허용. 단, 상속관계에 있는 경우 다른 패키지도 가능
    *   3. default : 동일 패키지에서만 접근 허용 (작성하지 않는 것이 default)      //메인 메소드시, void test() {} ←이걸 안쓴다.
    *   4. private : 해당 클래스 내부에서만 접근 허용
    *
    * 필기.
    *    위의 네 가지 접근제한자는 클래스의 멤버(필드, 메소드)에 모두 사용 가능하다.
    *    단, 클래스 선언 시 사용하는 접근제한자는 public 과 default 만 가능하다.
    */

    //클라이언트(사용자가 보고 있는 곳)
// 따라서, 만약 내부설정인 Monster에서 오류가 날 경우,
// 사용자 입장에서는 오류가 보이진 않지만,
// 내부에서는 오류가 나서 사용불가상태됨-> private 경우 수정!!!!!
    private String kinds;        // 1) 클래스 내부에서만 사용 가능.
                                // 따라서, Monster (4) 클래스에서 .불러오기할때 나오지 않음!!!
    private int hp;

    protected int age;

    public void setName(String name) {      //  3) 3번째로 만들기 > App01 클래스에서 2번째 만들어놓고,

        this.kinds = name;
    }

    public void setHp(int hp){

        if(hp > 0){
            this.hp = hp;

        } else {
            this.hp = 0;
        }

    }
    // 해보기

    protected void setAge(int age){

        if(age > 0){
            this.age = age;

        } else {
            this.age = 0;
        }

    }

    public String getInfo() {

        return "몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + " 나이는 " + age + "입니다.";
        //전체출력위한 문구 완료후, app01에서 출력완료

    }

}
