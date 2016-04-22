package comparable;

public class Person implements Comparable<Person>{
	
	int age;
	String name;
	
	public Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	//getter&setters
	
	@Override
	public int compareTo(Person person) {
		if(this.age<person.age)
			return -1;
		else if(this.age==person.age)
			return 0;
		else return 1;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

}
