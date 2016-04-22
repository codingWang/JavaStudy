package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
		
		person.add(new Person(15,"xiaoming"));
		person.add(new Person(20,"xiaoli"));
		person.add(new Person(18,"xiaowang"));
		Collections.sort(person);
		for (Person person2 : person) {
			System.out.println(person2.getAge());
		}
	}

}
