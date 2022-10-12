
public class Human {
	// assign values to the attributes of the class
	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight){//constructor
		// different human have different attributes so , constructor helps us solve that
		this.name=name; // so when we are accessing this ---> human1.name=______;
		this.age=age;
		this.weight=weight;
	}
	
	// how to access an objects attributes within its own class
	void eat() {
		System.out.println(this.name+" is eating");		
	}
	
	void drink() {
		System.out.println(this.name+ " is drinking"); //human1.drink(); or human2.drink(); in main method
	}
}
