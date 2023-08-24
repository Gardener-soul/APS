package pq03;

public class Person implements Comparable<Person> {
	
	public String name;
	public int age;
	
	public Person(){
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		// 음수일 때 : ?
		// 아닐 때 : ?
//		return o.age - this.age;
		return Integer.compare(this.age, o.age);
//		return this.name.compareTo(o.name);
		
	}
	
	
	
}
