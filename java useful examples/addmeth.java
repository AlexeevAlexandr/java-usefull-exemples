class vehicle {
	int passengers;
	int fuelcap;
	int mpg;
void range() { //����� range() ���������� � ������ vehile, ��� �������� �� ������������� ���������, � �������� ���� ������� void - �� �� ���������� ���������� ����� ��������� ������� ������
  System.out.println("Range - " + fuelcap * mpg + " miles.");
  }
}

class addmeth {
  public static void main(String args[]) {
	vehicle minivan = new vehicle();
	vehicle sportscar = new vehicle();
	int range1, range2;
	//����������� �������� � ������� minivan
	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	//����������� �������� � ������� sportscar
	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;
	
	System.out.print("Minivan can transport " + minivan.passengers + " passengers. ");
	minivan.range(); // ���������� ��������� �������

	System.out.print("Sportscar can transport " + sportscar.passengers + " passengers. ");
	sportscar.range();//��� �� ������� ����� ��� ����������� �������, ����� ������� ��� ����� ����� ������� ����� ������ ������ ��������� �������� �������
  }
}
