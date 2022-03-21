package bai1;

import java.util.Scanner;

public class PersonServiceImpl implements PersonService {

	@Override
	public void input(Person person) {
		System.out.println("person info");
		System.out.println("nhap id");
		person.setId(new Scanner(System.in).nextInt());
		
		System.out.println("nhap name");
		person.setName(new Scanner(System.in).nextLine());
		
		System.out.println("nhap tuoi");
		person.setAge(new Scanner(System.in).nextInt());
		
	}

	@Override
	public void info(Person person) {
		System.out.println("person info");
		System.out.println("id :" + person.getId() + "name :" + person.getName() + "age" + person.getAge());
	}

	
}


