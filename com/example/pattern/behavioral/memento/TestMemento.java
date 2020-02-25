package com.example.pattern.behavioral.memento;

public class TestMemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CareTaker careTaker = new CareTaker();
		Orginator orginator = new Orginator("guru",1,74);
		System.out.println(orginator);
		orginator.setDayNumberAndWeight(2, 73);
		System.out.println(orginator);
		System.out.println("Saving the state");
		
		careTaker.saveState(orginator);
		System.out.println(orginator);
		
		orginator.setDayNumberAndWeight(3, 72);
		System.out.println(orginator);
		
		orginator.setDayNumberAndWeight(4, 71);
		System.out.println(orginator);
		
		System.out.println("Restoring the state");
		careTaker.restoreState(orginator);
		System.out.println(orginator);
		
	}

}
