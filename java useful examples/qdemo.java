class queue{
	int q[];
	int putloc, getloc;
	queue (int size){
		q=new int[size +1];
		putloc=getloc=0;
		}
	void put(int ch){
		if(putloc==q.length-1){
		System.out.println(" - Ochered zapolnena");
		return;
		}
	putloc ++;
	q[putloc]=ch;
	}
int get(){
	if(getloc==putloc){
		System.out.println("Ochered pusta");
		return (int)0;}
	getloc++;
	return q [getloc];
	}
}
class qdemo{
	public static void main (String [] args){
		queue bigq = new queue (100);
		queue smallq = new queue (10);
		int ch;
		int i;
		System.out.println("Ispolzovanie ocheredi bigq dla sohranenia alfavita");
		for(i=0; i<10; i++)
		bigq.put((int)(1+i));
		System.out.print("Soderjimoe ocheredi bigq: ");
		for(i=0; i<10; i++){
			ch = bigq.get();
			if (ch !=(int)0) System.out.print(ch+" ");
			}
		System.out.println("\n");
		System.out.println("Ispolzovanie ocheredi smallq dla generacii oshibok");
		for(i=0; i<=10; i++){
			System.out.print("Popitka sohranenia "+(int)(10-i));
			smallq.put((char)(10-i));
			System.out.println();
			}
		
		System.out.print("Soderjimoe ocheredi smallq: ");
		for(i=0; i<=10; i++) {
		ch = smallq.get();	
		if (ch != (int) 0) System.out.print(ch+" ");
			
		}
	}
}
