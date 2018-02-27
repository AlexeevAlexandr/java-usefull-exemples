class vehicle {
	int passengers;
	int fuelcap;
	int mpg; }

class twovehicles {
  public static void main(String args[]) {
	vehicle minivan = new vehicle();
	vehicle sportscar = new vehicle();
	int range1, range2;

	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;

	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;

	range1 = minivan.fuelcap * minivan.mpg;
	range2 = sportscar.fuelcap * sportscar.mpg;
	System.out.println("Minivan can transport " + minivan.passengers + " passengers at a distance " + range1 + " miles");
	System.out.println("Sportscar can transport " + sportscar.passengers + " passengers at a distance " + range2 + " miles");
  }
}
