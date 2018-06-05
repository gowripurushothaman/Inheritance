package com.prog;
class Doctor {
	
	public void details() {
		System.out.println("He is Doctor");
	}
}
	class Surgeon extends Doctor {

		@Override
		public void details() {
			// TODO Auto-generated method stub
			// super.details();
			System.out.println("He is Surgeon");
		}

	}
	class Cardiologist extends Doctor {

		@Override
		public void details() {
			// TODO Auto-generated method stub
			// super.details();
			System.out.println("He is cardiologist");
		}

	}


public class Hospital {
	public static void main(String[] args) {
		Surgeon s=new Surgeon();
		Cardiologist c=new Cardiologist();
		s.details();
		c.details();

	}

}
