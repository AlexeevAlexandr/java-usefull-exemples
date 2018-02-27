class factor {
	boolean isfactor(int a, int b){
	if((b%a)==0) return true;
	else return false;
}}
class isfact{
  public static void main(String args[]){
	factor x = new factor();
	if (x.isfactor(2,20)) System.out.println("check 2/20 ok");
	if (x.isfactor(3, 20)) System.out.println("check 3/20 ok");
}}