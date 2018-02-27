class vehicle{
	int passengers;
	int fuelcap;
	int mpg;

	int range(){ 
	return mpg*fuelcap;
}
	double fuelneeded(int miles){
	return (double) miles/mpg;
}}
class compfuel{
  public static void main(String args []){
	vehicle minivan = new vehicle();
	vehicle sportscar = new vehicle();
	double gallons;
	int dist = 252;

	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;
	
	gallons = minivan.fuelneeded(dist);
	System.out.println("for travel " + dist + " miles minivan nid " + gallons + " gallons fuel.");

	gallons = sportscar.fuelneeded(dist);
	System.out.println("for travel " + dist + " miles sportscar nid " + gallons + " gallons fuel.");
}}