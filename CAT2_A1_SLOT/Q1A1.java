import java.util.*;


class Q1A1  {
	double fuelCapacity;
	double fuel;
	double fuelEfficiency;
	Q1A1 (double fuelCapacity, double fuel, double fuelEfficiency ) {
		this.fuelCapacity = fuelCapacity;
		this.fuel = fuel;
		this.fuelEfficiency = fuelEfficiency;
	}
	synchronized void addFuelLevel(double amount) {
		while(getFuelLevel() >= fuelCapacity)
		try {
			wait();
		}catch(InterruptedException e) {}
		 fuel += amount;
		 notifyAll(); 
	}

	synchronized void drive (double distance) {
		while(getFuelLevel() < distance*fuelEfficiency) 
		try { wait(); 
		}catch(InterruptedException e){}
	
		if(fuel - distance*fuelEfficiency >= 0) { //fuel level should never go below zero
			fuel -= distance*fuelEfficiency;	
			System.out.println("Driven distance "+ distance + " and current fuel level is "+getFuelLevel());
		}
		notifyAll();
	}
	
	synchronized double getFuelLevel ( ) {
		return fuel;	
	}

	public static void main(String... args) {
		Q1A1 car = new Q1A1(500, 500, 0.75);
		new Thread(new Driver(car)).start(); 
		new Thread(new AnotherPerson(car)).start();
		new Thread(new VIP(car)).start();
	}
}

class Driver implements Runnable {
	Q1A1 car;
	Driver (Q1A1 car) {
		this.car = car;
	}	
	public void run () {
		while(true) {
		System.out.println("Driver : Enter the distance to be driven");
		Scanner sc = new Scanner(System.in);
		double distance = sc.nextDouble();
		car.drive(distance); 
		}
	}
}

class AnotherPerson implements Runnable {
	Q1A1 car;
	AnotherPerson (Q1A1 car) {
		this.car = car;
	}	
	public void run () {
		while(true) {
		System.out.println("Another person: Enter the amount of fuel to be added");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		car.addFuelLevel(amount); 
		 }
	}
}

class VIP implements Runnable {
	Q1A1 car;
	VIP (Q1A1 car) {
		this.car = car;
	}	
	public void run () {
		while(true) {
		Thread.currentThread().interrupt();
		System.out.println("VIP thread: Enter the distance to be driven");
		Scanner sc = new Scanner(System.in);
		double distance = sc.nextDouble();
		car.drive(distance); 
		}
	}
}


 	