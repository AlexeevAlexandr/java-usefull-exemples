class vehicle {
	int passengers;
	int fuelcap;
	int mpg; }
class vehicle_demo {
  public static void main(String args[]) {
	vehicle minivan = new vehicle();
	int range;

	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;

	range = minivan.fuelcap * minivan.mpg;
	System.out.println("Minivan can transport " + minivan.passengers + " passengers at a distance " + range + " miles");
  }
}
