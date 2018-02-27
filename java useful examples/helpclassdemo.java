class help {
  void helpon (int what) {
	switch (what) {
      case '1':
	System.out.println("Oпepaтop if:\nif(ycлoвиe) оператор;\nelse оператор;");
	break;
      case '2':
	System.out.println("Oпepaтop switch:\nswitch (выражение) {\ncase константа:\nпоследовательность операторов\nbreak;");
	break;
      case '3':
	System.out.println("Oпepaтop for:\nfor(init; условие; итерация}\nоператор;");
	break;
      case '4':
	System.out.println("Oпepaтop while:\nwhile(ycлoвиe) оператор;");
	break;
      case '5':
	System.out.println("Oпepaтop do-while:\ndo {\nоператор;\n} while (условие);");
	break;
      case '6':
	System.out.println("Oпepaтop break:\nbreak; или break метка;");
	break;
      case '7' :
	System.out.println("Oпepaтop continue:\ncontinue; или continue метка;");
	break;
	}
	System.out.println();
}
void showmenu(){
	System.out.println("Info:\n1. if\n2. switch\n3. for\n4.while\n5. do-while\n6. break\n7. continue\nchoice q for exit.");
}
boolean isvalid(int ch){
	if(ch<'1' | ch>'7' & ch!='q') return false;
	else return true;
}}
class helpclassdemo {
  public static void main (String args [])
    throws java.io.IOException {
	char choice, ignore;
	help hlpobj = new help();

	for(;;) {

	do{
	hlpobj.showmenu();
	choice=(char) System.in.read();

	do{
	ignore = (char) System.in.read(); }
	while(ignore != '\n'); }
	while(!hlpobj.isvalid(choice));

	if(choice =='q') break;

	System.out.println("\n");

	hlpobj.helpon(choice);
}}}
		