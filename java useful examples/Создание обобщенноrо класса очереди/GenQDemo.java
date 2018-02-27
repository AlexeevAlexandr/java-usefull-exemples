class GenQDemo{
public static void main (String args []){
	Integer iStore[] = new Integer[10];
	GenQueue<Integer> q = new GenQueue<Integer>(iStore);
	Integer iVal;
	System.out.println("Demonstration queue numbers a type of Integer");
	try{
		for(int i=0; i<5; i++){
			System.out.println("Addition " + i + " in queue q");
			q.put(i);
			}
		}
	catch (QueueFullException exc){
		System.out.println(exc);
		}
	System.out.println();
	try{
		for(int i=0; i<5; i++){
			System.out.print("Obtaining next number type of Integer from queue q: ");
			iVal = q.get();
			System.out.println(iVal);
			}
		}
	catch (QueueEmptyException exc){
		System.out.println(exc);
		}
	System.out.println();
	Double dStore[] = new Double [10];
	GenQueue<Double> q2 = new GenQueue<Double>(dStore);
	Double dVal;
	System.out.println("Demonstration queue numbers type of Double");
	try{
		for(int i=0; i<5; i++){
			System.out.println("Addition "+(double)i/2 + " in queue q2");
			q2.put((double)i/2);
			}
		}
	catch (QueueFullException exc){
		System.out.println(exc);
		}
	System.out.println();
	try{
		for(int i=0; i<5; i++){
			System.out.println("Addition next number type of Double from queue q2: ");
			dVal=q2.get();
			System.out.println(dVal);
			}
		}
	catch (QueueEmptyException exc){
		System.out.println(exc);
		}
	}
}