package Cars;

public class Cars {

	private String make;
	private String model;
	private int year;
	
	public static void main(String[] args) {
		
		//create basic car objects
		Cars bilalsCar = new Cars("Toyota", "Supra", 1998);
	    Cars drewsCar = new Cars("Mitsubishi", "Eclipse", 1995);
	    Cars andraysCar = new Cars("BMW", "M335i", 2016);
	    Cars mohammadsCar = new Cars("Tesla", "Model 3", 2021);
	    Cars robertosCar = new Cars ("Nissan", "GTR", 2001);
	    Cars nabeelsCar = new Cars("Dodge", "Viper ACR", 2016);
	    Cars tylersCar = new Cars("Corvette", "Z06", 2010);
	    Cars syedsCar = new Cars("Mazda", "Miata", 2016);
	    }


	public Cars(String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	//The setters
	public String getMake() {
		
		return make;
	}
	
	public String getModel() {
		
		return model;
	}
	
	public int getYear() {
		
		return year;
	}
	
	//The getters
	public void setMake(String make) {
		
		this.make = make;
	}
	
	public void setModel(String model) {
		
		this.model = model;
	}
	
	public void setYear(int year) {
		
		this.year = year;
	}
	
	//Displaying it all
	
	public void displayCarInfo() {
		
	    System.out.println("Car Make: " + make);
	    System.out.println("Car Model: " + model);
	    System.out.println("Car Year: " + year);
	}

}
