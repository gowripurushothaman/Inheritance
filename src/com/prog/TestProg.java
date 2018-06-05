package com.prog;
class Colour{
	public void dis() {
		System.out.println("this is colour");
	}
}
class Red extends Colour{
}
	
	class Apple extends Red{

		@Override
		public void dis() {
			// TODO Auto-generated method stub
			//super.dis();
			System.out.println("Apple is red");
		}
	}
		
	class Dress extends Red{

		@Override
		public void dis() {
			// TODO Auto-generated method stub
			//super.dis();
			System.out.println("red colour dress");
		}
		
	}
public class TestProg {
	public static void main(String[] args) {
		Dress dress=new Dress();
		Apple apple=new Apple();
		dress.dis();
		apple.dis();
		
	}
}

