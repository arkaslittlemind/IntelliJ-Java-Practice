class Bakery {
	int counter=0; 
	
	synchronized void newCustomer( ) {
		if(counter == 20) return;
		//counter++;
		System.out.println("The new customer gets token : "+ ++counter);
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		
	}
	synchronized void customerServiced( ) {
		if(counter <= 0) return;
			
		System.out.println("One customer is serviced & #customer in the queue is: "+ --counter);
		try {
			Thread.sleep(500);
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		
	}
}

class Clerk implements Runnable {	
	Bakery bakery;
	Thread t;
	public Clerk(Bakery targ) {
		bakery = targ;		
		t = new Thread(this);
		t.start();
	}
	public void run() {		
		while(true) {
			bakery.customerServiced();   
		}
	}
}

class Customer implements Runnable {	
	Bakery bakery;
	Thread t;
	public Customer(Bakery targ) {
		bakery = targ;		
		t = new Thread(this);
		t.start();
	}
	public void run() {		
		while(true) { 
			bakery.newCustomer(); 
		}		
	}
}


class Q1A2 {
	public static void main(String[] args) {
		Bakery target = new Bakery();
		Customer cst = new Customer(target);
		Clerk ob = new Clerk(target); 
				  
		try {
			ob.t.join(); cst.t.join();
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

