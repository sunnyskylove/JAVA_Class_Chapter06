package com.ohgiraffers.section09.TeamTest;

public class Teamtest{
        public static void main(String[] args) {

            TV myTV = new TV(); //LG에서 만든 2017년 32인치


            // 기본 생성자
            myTV.setBrand("LG");
            myTV.setYear(2017);
            myTV.setInch(32);
            myTV.show();                //매개생성자일 경우 1개 필요
            System.out.println(myTV.getBrand());





        }

    }
