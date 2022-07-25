package com.ssafy.live3.inter;

// cf. 강제성
public class IronMan implements Heroable{

	int weaponDamage = 100;
	
	@Override
	public int fire() {
		// TODO Auto-generated method stub
		System.out.println("적의 에너지 감소 : "+weaponDamage);
		return weaponDamage;
	}

	@Override
	public void changeShape(boolean isHeroMode) {
		// TODO Auto-generated method stub
		if(isHeroMode) {
			System.out.println("장갑 장착");
		}else {
			System.out.println("일반 토니스타크");
		}
		
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("성능 개선");
	}

}
