package com.prog;

public class Cube extends ThreeDimensional{
	int a=4;
	float area;
	@Override
	public void formula() {
		// TODO Auto-generated method stub
		//super.formula();
		area=6*a*a;
		System.out.println("area of cube is="+area);
	}
	

}
