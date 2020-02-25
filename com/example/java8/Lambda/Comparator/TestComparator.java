package com.example.java8.Lambda.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("Guru", "Murugesan", 40));
		personList.add(new Person("Guru", "Murugesan", 35));

		personList.add(new Person("Mangai", "Ramanathan", 35));
		personList.add(new Person("Mangai", "Guru", 35));
		personList.add(new Person("Kumareswaran", "Guru", 9));
		personList.add(new Person("Nikhilan", "Guru", 3));

		Comparator<Person> personComparator = (p1, p2) -> {
			return p1.getAge() - p2.getAge();
		};
		Collections.sort(personList, personComparator);

		Comparator<Person> personComparator2 = (p1, p2) -> {
			return (p1.getFirstName().compareTo(p2.getFirstName()) == 0)
					? (p1.getLastName().compareTo(p2.getLastName()))
					: (p1.getFirstName().compareTo(p2.getFirstName()));
		};
		Collections.sort(personList, personComparator2);

		Comparator<Person> personComparator3 = Comparator.comparing((Person p) -> p.getFirstName())
				.thenComparing(p -> p.getLastName()).thenComparing(p -> p.getAge());
		Collections.sort(personList, personComparator3);

		Comparator<Person> personComparator4 = Comparator.comparing(Person::getFirstName)
				.thenComparing(Person::getLastName).thenComparing(Person::getAge);
		Collections.sort(personList, personComparator4);

		Comparator<Person> personComparator5 = Comparator.comparing(Person::getFirstName,Comparator.reverseOrder())
				.thenComparing(Person::getLastName,Comparator.reverseOrder()).thenComparing(Person::getAge,Comparator.reverseOrder());
		Collections.sort(personList, personComparator5);

		personList.forEach((person) -> {
			System.out.println("FirstName:" + person.getFirstName() + " Last Name:" + person.getLastName() + " Age :"
					+ person.getAge());
		});
		
		
	}
}
