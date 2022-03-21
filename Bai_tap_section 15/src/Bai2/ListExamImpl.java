package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import bai1.Person;
import bai1.PersonService;
import bai1.PersonServiceImpl;

public class ListExamImpl implements ListExam {
	PersonService personservice = new PersonServiceImpl();

	@Override
	public List<Person> input() {
		List<Person> list = new ArrayList<Person>();
		while (true) {
			System.out.println("enter person info");
			Person p = new Person();
			personservice.input(p);
			list.add(p);
			System.out.println("Continue? (N:out)");

			Scanner sc = new Scanner(System.in);
			String option = sc.nextLine();
			if (option.equalsIgnoreCase("n")) {
				break;
			}

		}
		return list;
	}

	@Override
	public void info(List<Person> list) {
		System.out.println("List info : ");
		for (Person person : list) {
			personservice.info(person);
		}

	}

	@Override
	public void filter(List<Person> list) {
		System.out.println("nhung nguoi nho hon 20 tuoi");
		for (Person person : list) {
			if (person.getAge() < 20) {
				personservice.info(person);
			}
		}
	}

	@Override
	public void sortPerson(List<Person> list) {
		System.out.println("List tuoi tang dan");

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return (p1.getAge() - p2.getAge());
				// am xep trc, duong xep sau
			}
		});

		info(list);

		System.out.println("List tuoi giam dan");

		Collections.reverse(list);

		info(list);
	}

	@Override
	public void delete(List<Person> list) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next + " ");
			
			info(list);
		}

	}

}
