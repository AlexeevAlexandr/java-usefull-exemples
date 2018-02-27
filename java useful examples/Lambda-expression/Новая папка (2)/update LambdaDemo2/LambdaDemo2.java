import java.util.Scanner;
class LambdaDemo2{
public static void main (String args []){

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first number: ");
	if(sc.hasNextInt()){
	int q=sc.nextInt();
	System.out.print("Enter second number: ");
	int w=sc.nextInt();

	System.out.println();
	System.out.println("You enter numbers: "+q+" and "+w);
	System.out.println();
	
	NumericTest isFactor=(n, d) -> (n % d) == 0;
	if(isFactor.test(q, w)) System.out.println("First number is divisor of second number");
	if(!isFactor.test(q, w)) System.out.println("First number is not divisor of second number");

	System.out.println();

	NumericTest lessThan = (n, m) -> (n < m);
	if(q < w) System.out.println("First number is less then of second number");
	if(q > w) System.out.println("First number more then second number");
	if(q == w) System.out.println("First and second numbers are equal");

	System.out.println();

	NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
	if((Math.abs(q)) == (Math.abs(w))) System.out.println("Absolut value first and second numbers are equal");
	if((Math.abs(q)) != (Math.abs(w))) System.out.println("Absolut value first and second numbers are not equal");

	System.out.println();
}}}