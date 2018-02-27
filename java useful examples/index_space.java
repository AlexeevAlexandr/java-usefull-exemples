import java.util.Scanner;
class index_space{
  public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i=0; i<s.length(); i++){

	if(s.charAt(i) == ' ') {

	System.out.println(i);
}}}}