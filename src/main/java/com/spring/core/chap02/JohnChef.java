package com.spring.core.chap02;


import org.springframework.stereotype.Component;

@Component("jc")
public class JohnChef implements Chef {
    public void cook(){
        System.out.println("존 쉐프가 서양 요리를 한다");
    }


}
