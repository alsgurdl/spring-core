package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component를 지정한 클래스
//스프링 컨테이너(빈을 저장하는 공간)에 객체가 생성되고 관리되게 된다
@Component
public class Hotel {

    //의존 관계 어떤 객체가 정상 동작하기 어떤 객체를 필요로 하는 것
    private Restaurant restaurant;
    private Chef chef;

    @Autowired// 스프일에 빈으로 등록된 의존 객체를 알아서 넣어주는 기능
    public Hotel(@Qualifier("wr") Restaurant restaurant,@Qualifier("jc") Chef chef) {
        this.restaurant = restaurant;
        this.chef = chef;
    }

    //레스토랑 예약 기능
    public void reserve(){
        System.out.printf("우리 호텔의 레스토랑은 %s 쉐프는 %s"
                ,restaurant.getClass().getSimpleName(),chef.getClass().getSimpleName());

        //예약을 수행하려면 레스토랑에 연락해서 예약 헤야함

        restaurant.order();


    }









}
