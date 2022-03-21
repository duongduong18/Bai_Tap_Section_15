package Bai2;

import java.util.List;

import bai1.Person;

public interface ListExam {
List<Person> input();
void info(List<Person> list);
void filter(List<Person> list);
void sortPerson(List<Person> list);
void delete(List<Person> list);
}
