package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {

      this.count++;
        System.out.println("nonStaticMethod 호출됨...");

    }

    public static void staticMethod(){

  //        this.count++;
  // static 같은 경우, 새로운 객체 생성 필요가 없어서 this(주소)가 없다. 따라서 오류남 (▽ 같은말)
  // this.count++;   인스턴스를 생성하지 않고 사용하는 메소드 이기 때문에 this 에는 주소가 들어갈 수 없다.

        System.out.println("staticMethod 호출됨...");

    }

}
