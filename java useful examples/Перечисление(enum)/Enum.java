enum TransportSpeed {
	car(65), truck(55), airplane(600), trane(70), boat(22);
	private int speed;
	TransportSpeed (int s) {speed = s;}
	int getSpeed(){return speed;}
	}

enum TransportsPassengers {
	car(7), truck(2), airplane(20), trane(100), boat(4);
	private int passengers;
	TransportsPassengers (int p) {passengers = p;}
	int getPassengers(){return passengers;}
	}

class Enum{
  public static void main (String args[]){
	TransportSpeed tp;
	
	System.out.println("Speed oll transports:");
	for(TransportSpeed t : TransportSpeed.values())
	System.out.println(t + ":\t "+t.getSpeed()+" miles in hours");

	System.out.println();

	System.out.println("Passengers oll transports:");
	for(TransportsPassengers t : TransportsPassengers.values())
	System.out.println(t + ":\t "+t.getPassengers()+" passengers");
	}
}