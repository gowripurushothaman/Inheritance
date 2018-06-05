package com.prog;
class Computer{
	public void computerName() {
		System.out.println(".....");
	}
}
class Acer extends Computer{

	@Override
	public void computerName() {
		// TODO Auto-generated method stub
		//super.computerName();
		System.out.println("this is acer computer");
	}
	
}
class Lenovo extends Computer{

	@Override
	public void computerName() {
		// TODO Auto-generated method stub
		//super.computerName();
		System.out.println(" this is lenovo computer");
	}
	
}
public class Sys {
	public static void main(String[] args) {
		Acer acer=new Acer();
		acer.computerName();
	}

}
