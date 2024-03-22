package com.spring.core.chap01;

public class AsianRestaurant implements Restaurant{
    private KimuraChef chef = new KimuraChef();
    private SushiCourse course = new SushiCourse();


    public void order(){

        System.out.println("시스 오마카새주문");
        course.combineMenu();
        chef.cook();


    }



}
