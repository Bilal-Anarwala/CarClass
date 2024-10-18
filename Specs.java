package Cars;

public class Specs extends Cars{
	private String engineType;
	private int horsepower;

	public Specs(String make, String model, int year, String engineType, int horsepower) {
	
		super(make, model, year); //inherit the parent classes constructors
		this.engineType = engineType;
		this.horsepower = horsepower;
	}

	//getters
	public String getEngineType() {
		
        return engineType;
    }

    public int getHorsepower() {
    	
        return horsepower;
    }
    
    public void displaySpecs() {
    	
        System.out.println("Engine Type: " + engineType);
        System.out.println("Horsepower: " + horsepower);
    }
    
    public void displayCarInfo() {
    	
        super.displayCarInfo(); 
        displaySpecs(); 
    }
    
    //setters 
    public void setEngineType(String engineType) {
    	
        this.engineType = engineType;
    }
    
    public void setHorsepower(int horsepower) {
    	
        this.horsepower = horsepower;
    }
}
