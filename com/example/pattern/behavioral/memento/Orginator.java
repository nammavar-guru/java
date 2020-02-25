package com.example.pattern.behavioral.memento;


//originator - object whose state we want to save
public class Orginator {
	String personName;
	int dayNumber;
	int weight;
	
	public Orginator(String personName, int dayNumber, int weight) {
		this.personName = personName;
		this.dayNumber = dayNumber;
		this.weight = weight;
	}
	
	
	@Override
	public String toString() {
		return "Orginator [personName=" + personName + ", dayNumber=" + dayNumber + ", weight=" + weight + "]";
	}


	public void setDayNumberAndWeight(int dayNumber, int weight) {
		this.dayNumber = dayNumber;
		this.weight = weight;
	}
	
	// memento - object that stores the saved state of the originator
	private class Memento {
		String mementoPersonName;
		int mementoDayNumber;
		int mementoWeight;
		
		public Memento(String mementoPersonName, int mementoDayNumber, int mementoWeight) {
			this.mementoPersonName = mementoPersonName;
			this.mementoDayNumber = mementoDayNumber;
			this.mementoWeight = mementoWeight;
		}
	}
	
	public Memento save() {
		return new Memento(personName,dayNumber,weight);
	}
	
	public void restore(Object objMemento) {
		Memento memento =(Memento) objMemento;
		personName = memento.mementoPersonName;
		dayNumber = memento.mementoDayNumber;
		weight = memento.mementoWeight;
	}
}
