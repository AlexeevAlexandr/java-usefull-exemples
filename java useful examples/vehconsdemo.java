class vehicle{
	int passengers;
	int fuelcap;
	int mpg;
	
	//это конструктор класса vehicle
	vehicle (int p, int f, int m){
	passengers = p;
	fuelcap = f;
	mpg = m;
	}

	//определить дальность поездки
	int range (){
	return mpg * fuelcap;
	}

	//расчет объема топлива
	double fuelneeded (int miles){
	return (double) miles / mpg;
	}
}
class vehconsdemo{
  public static void main (String args []) {
	vehicle minivan = new vehicle(7, 16, 21);
	vehicle sportscar = new vehicle(2, 14, 16);
	double gallons;
	int dist = 252;

	gallons = minivan.fuelneeded(dist);
	System.out.println("For overcome " + dist + " miles minivan needed " + gallons + " gallons fuels.");

	gallons = sportscar.fuelneeded(dist);
	System.out.println("For overcome " + dist + " miles sportscar needed " + gallons + " gallons fuels.");
	}
}