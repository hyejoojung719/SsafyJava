package com.ssafy.live4.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ForEachTest {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<10; i++) {
            nums.add(i);
        }
        
        System.out.println("시작\t: "+nums);
        
        // 다음 iteration에서 nums의 개수가 변경되면 오류
        for(Integer num: nums) {
            if(num%2==0) {
//                nums.add(num*num);
                nums.remove(num);
                break;
            }
        }       
        System.out.println("삭제 \t: "+nums);        
        
        Iterator<Integer> itr = nums.iterator();
        
        while(itr.hasNext()) {
        	// 다음 값이 들어 있으면
        	Integer num = itr.next();
        	System.out.println(num);
        }
    }
}
