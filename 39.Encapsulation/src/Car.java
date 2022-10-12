
public class Car {
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
//		this.make=make;
//		this.model=model;
//		this.year=year;
	}
	
	// Setters -- no return type,argument passed
	public void setYear(int year) {this.year= year;}  
	public void setModel(String model) {this.model=model;}
	public void setMake(String make) {this.make=make;}
	
	
	public int getYear() {return year;}
	public String getModel() {return model;}
	public String getMake() {return make;}
}
