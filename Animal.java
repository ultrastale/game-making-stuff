import acm.graphics.GImage;

/**
 * This class defines an animal.
 * @author Evan Torgrimson
 * @date 6/1/15
 * 
 */

public class Animal {

	// class (static) field
	private static int numAnimals = 0;
	
	
	// instance variables
	private String name;  // Default value is null
	private String habitat;
	private GImage image;
	private int value;
	
	// create parameterized constructor 
	public Animal(String name, String habitat, String fileName, int value) {
		// set the name
		setName(fileName);
		
		// set the habitat
		setHabitat(habitat);
		
		// set the value
		setValue(value);

		// call setter for image field
		setImage(fileName);
	}
	
	// second parameterized constructor
	// overloading the constructor -- giving more than one version
	public Animal(String name, String fileName, int value) {
		setName(name);
		setValue(value);
		setImage(fileName);
		setHabitat("Unspecified");
		
		
	}
	
	
	// setter for the class variable
	public static void foo() {
		
	}
	
	
	
	
	// define setters for fields
	public void setImage(String fileName) {
		image = new GImage(fileName);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
		
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
	// define getter -- always have return value -- always busy
	public String getName() {
		return name;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public GImage getImage() {
		return image;
	}
	
	public int getValue() {
		return value;
	}
	
	
	
	
	
}
