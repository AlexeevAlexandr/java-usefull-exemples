class vehicle{
	int passengers;
	int fuelcap;
	int mpg;
	
	//��� ����������� ������ vehicle
	vehicle (int p, int f, int m){
	passengers = p;
	fuelcap = f;
	mpg = m;
	}

	//���������� ��������� �������
	int range (){
	return mpg * fuelcap;
	}

	//������ ������ �������
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