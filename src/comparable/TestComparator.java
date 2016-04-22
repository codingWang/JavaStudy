package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
		MyComparable c= new MyComparable();
		person.add(new Person(15,"xiaoming"));
		person.add(new Person(20,"xiaoli"));
		person.add(new Person(18,"xiaowang"));
		person.add(new Person(27,"xiaoma"));
		Collections.sort(person,c);
		for (Person person2 : person) {
			System.out.println(person2.getAge());
		}
	}

}
