package comparable;

import java.util.Comparator;

public class MyComparable implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
		
		if(person1.age<person2.age)
			return -1;
		else if(person1.age == person2.age)
			return 0;
		else return 1;
	}

}
