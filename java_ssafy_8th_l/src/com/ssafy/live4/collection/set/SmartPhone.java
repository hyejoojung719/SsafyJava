package com.ssafy.live4.collection.set;

// TODO: SmartPhone이 다른 SmartPhone과 번호를 기준으로 비교가능하게 처리하시오.
 public class SmartPhone {
    // END:

    String number;

    public SmartPhone(String number) {
        this.number = number;
    }

    public String toString() {
        return "전화 번호: " + number;
    }

    // TODO: 동일한 번호의 SmartPhone이면 하나만 추가될 수 있도록 처리하시오. (equals, hashcode 재정의)
    @Override
    public boolean equals(Object obj) {

    	// 아래 두줄은 예외상황 위해 추가된 코드
    	boolean result = false;
//    	if(obj!=null && obj instanceof SmartPhone) {
    		SmartPhone s = (SmartPhone)obj;
    		// 전화번호 비교 결과를 반환
    		result = this.number.equals(s.number);
//    	}
    	return result;
    }
    
    @Override
    public int hashCode() {
    	return number.hashCode();
    }
    
    // END:

}
