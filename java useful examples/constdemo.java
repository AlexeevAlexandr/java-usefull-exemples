class myclass{
	int x, z;

//объ€вление конструктора	
      myclass(){   
	x = 10;
	z = 20;
}}
class constdemo{
  public static void main(String arg []){
	myclass t1 = new myclass();
	myclass t2 = new myclass();

	System.out.println(t1.x + " " + t2.z);
}}