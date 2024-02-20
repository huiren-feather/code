public class Methods03 {
	public static void main(String[] args){
		Person p1 = new Person();
		p1.name="Andy";
		p1.age = 28;

		Person p2;

		Copy copy = new Copy();
		p2 = copy.copyPerson(p1);
		System.out.println(p1==p2);

		p2.name="Sun";
		p2.age = 16;
		System.out.println("p1的姓名是"+p1.name +",年龄是"+p1.age);
		System.out.println("p2的姓名是"+p2.name +",年龄是"+p2.age);
		System.out.println("p1的HashCode是"+p1);
		System.out.println("p2的HashCode是"+p2);


	}
}

class Person {
	String name;
	int age;
}

class Copy {
	public Person copyPerson(Person p){
		Person p1 = new Person();
		p1.name = p.name;
		p1.age = p.age;
		return p1;
	}
}