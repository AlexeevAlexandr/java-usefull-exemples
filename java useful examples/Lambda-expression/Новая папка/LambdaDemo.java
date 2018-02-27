class LambdaDemo{
public static void main (String args []){

	MyValue myVal;
	myVal=()->98.6;
	System.out.println("Constant value "+myVal.getValue());

	MyParamValue myPval=(n)->1.0/n;
	System.out.println("Inverse value 4 is: "+myPval.getValue(4.0));
	System.out.println("Inverse value 8 is: "+myPval.getValue(8.0));

}}