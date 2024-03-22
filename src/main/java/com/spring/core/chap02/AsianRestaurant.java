package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("ar")
public class AsianRestaurant implements Restaurant {


    private Chef chef ;
    private SushiCourse course = new SushiCourse();

    @Autowired
    public AsianRestaurant(@Qualifier("kc") Chef chef) {
        this.chef = chef;
    }

    public void order(){

        System.out.println("시스 오마카새주문");
        course.combineMenu();
        chef.cook();


    }



}
