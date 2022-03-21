package Bai2;

import java.util.List;

import bai1.Person;

public class MainlistExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListExam le = new ListExamImpl();
		List<Person> list = le.input();

		le.info(list);
		System.out.println("-----------");

		le.filter(list);
		System.out.println("-----------");

		le.sortPerson(list);

		le.delete(list);
	}

}
