public class This03{
	public static void main(String[] args){
		Person p = new Person("andy",28);
		Person p1 = new Person("andy",28);
		System.out.println(p.toCompare(p1));
	}
}

class Person {
	String name;
	int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	public boolean toCompare(Person p){
		// if(this.age == p.age && this.name.equals(p.name) ){
		// 	return true;
		// }else {
		// 	return false;
		// }
		return this.age == p.age && this.name.equals(p.name);
	}
}