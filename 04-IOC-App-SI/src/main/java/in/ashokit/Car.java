package in.ashokit;

public class Car {
	
	private Engine engine;	//default value is null
	
	public Car() {
		System.out.println("Car - Constructor Executed...");
	}
	
	public void setEngine(Engine engine) {
		System.out.println("setEngine - Setter Method called...");
		this.engine = engine;
	}

	public void drive() {
		int status = engine.start();
		
		if(status == 1) {
			System.out.println("Journey started...");
		} else {
			System.out.println("Engine Problem...");
		}
	}
}
