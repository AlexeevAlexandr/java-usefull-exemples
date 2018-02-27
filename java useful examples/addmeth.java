class vehicle {
	int passengers;
	int fuelcap;
	int mpg;
void range() { //метод range() содержитс€ в классе vehile, дл€ которого не предусмотрены параметры, в качестве типа указана void - он не возвращает вызывающей части программы никаких данных
  System.out.println("Range - " + fuelcap * mpg + " miles.");
  }
}

class addmeth {
  public static void main(String args[]) {
	vehicle minivan = new vehicle();
	vehicle sportscar = new vehicle();
	int range1, range2;
	//присваиваем значение в объекте minivan
	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	//присваиваем значение в объекте sportscar
	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;
	
	System.out.print("Minivan can transport " + minivan.passengers + " passengers. ");
	minivan.range(); // отобразить дальность поездки

	System.out.print("Sportscar can transport " + sportscar.passengers + " passengers. ");
	sportscar.range();//что бы вызвать метод дл€ конкретного объекта, нужно указать им€ этого этого объекта перед именем метода использу€ точечную нотацию
  }
}
