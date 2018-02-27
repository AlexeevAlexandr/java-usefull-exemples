class demo_count_time{
 public static void main (String args[]){

	int q = (int)(Math.random()*28800);
	int h = q / 3600;
	int hm = q % 3600;
	int m = hm / 60;
	int s = hm % 60;
	System.out.println("Til end work day is:\n" + h + " hours\n" + m + " minutes\n" + s + " seconds");

	
}}
 