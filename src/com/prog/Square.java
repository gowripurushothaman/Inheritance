package com.prog;

public class Square extends TwoDimensional{
int side=20;
int perimeter;
	@Override
	public void formula() {
		// TODO Auto-generated method stub
		//super.formula();
	     perimeter=4*side;
	     System.out.println("perimeter of square="+perimeter);
	}
	

}
