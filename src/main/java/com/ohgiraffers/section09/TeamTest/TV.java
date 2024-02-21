package com.ohgiraffers.section09.TeamTest;


// 매개변수 생성자 만들기
public class TV {
    private String brand;           //(직접접근을 제한하기 위해서 만듦)
    private int year;
    private int inch;

    //기본생성자 만들기
    public TV(){}


    public TV(String brand, int year, int inch) {     // 간접적으로 클래스 내부에서 초기화 값을 넣어주기 위해 작성

            this.brand = brand;
            this.year = year;
            this.inch = inch;
     }
        public void show(){
            System.out.println(brand + "에서 만든"+ year + "년"+ inch + "인치");

        }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

}


