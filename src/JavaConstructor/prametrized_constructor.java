package JavaConstructor;
class cons{
	String name;
	int age;
	long contact;

public cons(String name, int age, long contact) {
	
		this.name=name;
		this.age =age;
		this.contact=contact;
		
	}
	public void display() {
		System.out.println("Name:-"+name+" "+"Age:-"+age+" "+"Contact:-"+contact);
	}
}
public class prametrized_constructor {

	public static void main(String[] arg) {
		cons c1 =new cons("mukesh",20,9345536911l);
c1.display();
	}

}
