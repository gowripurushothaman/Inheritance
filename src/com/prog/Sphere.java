package com.prog;

public class Sphere extends ThreeDimensional{
	int r=2;
	float area;
	@Override
	public void formula() {
		// TODO Auto-generated method stub
		//super.formula();
		area=4*Circle.PI*r*r;
		System.out.println("area of sphere="+area);
	}
	
	

}
