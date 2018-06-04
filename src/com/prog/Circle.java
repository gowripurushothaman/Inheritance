package com.prog;

public class Circle  extends TwoDimensional {
	public final static float PI=3.14f;
	float perimeter;
	int r=2;

	@Override
	public void formula() {
		// TODO Auto-generated method stub
		//super.formula();
		perimeter=2*PI*r;
		System.out.println("perimeter of circle is="+perimeter);
		
	}

}
