package Listofobjects;


import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class TestPerson {
public static void main(String[] args) {
ArrayList<Person> list = new ArrayList<>();
list.add (new Person("Upasana", 32, "Trainer"));
list.add (new Person("Hilda", 23, "Manager"));
list.add (new Person("Kev", 36, "Team Leader"));
list.add (new Person("Arifi", 26, "Designer"));
list.add (new Person("Mike", 25, "Developer"));


Person p=new Person();
p.getPerson(list);
	
}
}