package com.spring.core.chap01;

public class WesternRestaurant implements Restaurant{
    //의존 객체
    private Chef chef;
    private WesternCourse course = new WesternCourse();

    public WesternRestaurant(Chef chef) {
        this.chef = chef;
    }

    public void order(){
        System.out.println("서양 요리 주문");
        //요리 코스메뉴를 구성
        course.combineMenu();
        // 요리사에게 요리 명령을 내려야한다
        chef.cook();

    }

}
