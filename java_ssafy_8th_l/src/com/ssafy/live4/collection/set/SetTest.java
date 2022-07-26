package com.ssafy.live4.collection.set;

import java.util.HashSet;
import java.util.Set;


public class SetTest {
    Set<Object> hset = new HashSet<Object>();

    private void addMethod() {
    	// 아래 얘네들은 알아서 중복제거가 되는데,,,
        hset.add(Integer.valueOf(1));
        hset.add("Hello");     
        hset.add("Hello");      // 동일한 데이터 추가 확인
        hset.add(1);            // 기본형은 wrapper를 통해 추가
        // TODO: SmartPhone 타입의 객체를 추가해보자.
        
        // END:
        System.out.println("데이터 추가 결과: " + hset);
    }

    private void retrieveMethod() {
        System.out.println("데이터 개수: " + hset.size());

        // 순서가 없기 때문에 index 말고 foreach 혹은 Iterator를 사용할 수 있다
        for (Object sobj : hset) {
            System.out.println("데이터 조회: " + sobj);
            // 조회 했을 때 얘네는 순서가 있을까?
        }
    }

    private void removeMethod() {
        hset.remove("Hello");
        System.out.println("데이터 삭제 결과: " + hset);
    }
    
    public static void main(String[] args) {
        SetTest test = new SetTest();
        test.addMethod();
        test.retrieveMethod();
        test.removeMethod();
        
        Set<SmartPhone> set  = new HashSet<>(); 
        set.add(new SmartPhone("010-1234-5678"));
        set.add(new SmartPhone("010-1234-5678"));
        System.out.println("스마트폰 해쉬 셋"+set);
        // 중복제거를 하고 싶다면 
        
    }
}
