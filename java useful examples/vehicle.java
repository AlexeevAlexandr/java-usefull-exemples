class vehicle {
public static void main(String args[]) {
	int pm=7, fm=16, mpgm=21, ps=2, fs=14, mpgs=12, range1, range2;
	
	range1 = fm * mpgm;
	range2 = fs * mpgs;
	System.out.println("Minivan can transport " + pm + " passengers at a distance " + range1 + " miles");
	System.out.println("Sportscar can transport " + ps + " passengers at a distance " + range2 + " miles");
  }
}
