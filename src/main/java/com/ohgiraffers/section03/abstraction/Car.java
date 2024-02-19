package com.ohgiraffers.section03.abstraction;

// 연습. 1. 자동차 (자동차>카레이서가 동작하므로 자동차 먼저!)
public class Car {

    // 연습. [속성1] 시동상태
    private boolean isOn;
    // 차 시동은 2가지(껐다 켜기)밖에 없어서 논리형으로 선정.
    // 초기 기본값은 시동이 꺼진 "false 상태"이다.(따라서 isOn 상태는 거짓이므로 꺼져있는 상태다.)

    // 연습. [속성2] 현재 시속
    private int speed;


    /* 연습. [행위1]시동이 걸려 있는 상태인 경우 할일이 없고, 시동이 걸려있지 않으면 시동을 건다.*/
    public void startUp() {

        if (isOn) {
            System.out.println("이미 시동이 걸려있습니다.");
            //(true가 false 초기값이므로, else로 먼저 넘어감) > 갔다 다시 돌아오면 > 한번 꺼져있는 상태에서 다시 on으로 됨

        } else {
            this.isOn = true;
            // 앞 초기값은 flase이므로,else로 먼저 가고> 기본값 다시 true로 변경 됨
            System.out.println("시동을 걸었습니다. 이제 출발 할 준비가 되었습니다.");
        }

    }

    /* 연습. [행위2] 앞으로 가는 행위를 만들기 */
    public void go() {

        if (isOn) {
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;    //시속 10키로 증가하며 앞으로 나가는 조건~ (시동>10km증가)
            System.out.println("현재 차의 시속은" + this.speed + "km/h 입니다.");

        } else {
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
        }

    }

    /* 연습. [행위3] 멈춰라 하는 행위 만들기 */
    public void stop() {     // 시동이 걸려있고, 달리는 상태인 경우에만 멈출 수 있다.

        if (isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");

            } else {
                System.out.println("차는 이미 멈춰있습니다.");
            }

        } else {
            System.out.println("차의 시동이 걸려 있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    /* 연습. 시동을 꺼라라는 동작 만들기 */
    public void turnOff(){   // 시동이 걸려 있는 상태인 경우 시동을 끄고, 이미 꺼진 상태라면 끌 수 없다.

        if(isOn){
            if(speed > 0){
                System.out.println("달리는 상태에서는 시동을 끌 수 없습니다. 차를 우선 멈춰주세요.");

            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜주세요.");
            }

        } else {
            System.out.println("이미 시동이 꺼져 있는 상태입니다. 시동 상태를 확인해 주세요.");

        }
    }
}