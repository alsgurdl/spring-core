package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wr")
public class WesternRestaurant implements Restaurant {
    //의존 객체
    private Chef chef;
    private WesternCourse course = new WesternCourse();

    @Autowired
    public WesternRestaurant(@Qualifier("jc") Chef chef) {

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
