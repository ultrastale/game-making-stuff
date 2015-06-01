import acm.program.GraphicsProgram;


public class AnimalTest extends GraphicsProgram{
	
	public void run() {
		
		Animal buffalo = new Animal("Buffalo", "plains", "tyson.gif", 100);
		
		System.out.println("Name: " + buffalo.getName());
		System.out.println("Habitat: " + buffalo.getHabitat());
		System.out.println("Name: " + buffalo.getValue());
		
		add(buffalo.getImage());
		System.out.println(Animal.getNumAnimals()); // static method call
		
		
		
	}

}

