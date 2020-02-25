package com.example.pattern.behavioral.memento;

public class CareTaker {
	Object objMemento;
	
	public void saveState(Orginator orginator) {
		objMemento = orginator.save();
	}
	
	public void restoreState(Orginator orginator) {
		orginator.restore(objMemento);
	}
}
