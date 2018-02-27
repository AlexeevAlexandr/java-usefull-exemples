class vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	int range(){
	return mpg * fuelcap;//возврвт дальности поездки для заданного транспортного средства.
    }
}
class retmeth{
  public static void main(String args []){
	vehicle minivan = new vehicle();
	vehicle sportscar = new vehicle();
	int range1, range2;

	//присваиваем значение полям в объектах minivan и sportscar.
	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;

	//получаем дальность поездки.
	range1 = minivan.range();
	range2 = sportscar.range();

	System.out.println("Minivan can transport " + minivan.passengers + " on distance " + range1 + " miles");
	System.out.println("Sportscar can transport " + sportscar.passengers + " on distance " + range2 + " miles");
     }
}
	
	
	