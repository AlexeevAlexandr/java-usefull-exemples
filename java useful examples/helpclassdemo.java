class help {
  void helpon (int what) {
	switch (what) {
      case '1':
	System.out.println("O�epa�op if:\nif(yc�o��e) ��������;\nelse ��������;");
	break;
      case '2':
	System.out.println("O�epa�op switch:\nswitch (���������) {\ncase ���������:\n������������������ ����������\nbreak;");
	break;
      case '3':
	System.out.println("O�epa�op for:\nfor(init; �������; ��������}\n��������;");
	break;
      case '4':
	System.out.println("O�epa�op while:\nwhile(yc�o��e) ��������;");
	break;
      case '5':
	System.out.println("O�epa�op do-while:\ndo {\n��������;\n} while (�������);");
	break;
      case '6':
	System.out.println("O�epa�op break:\nbreak; ��� break �����;");
	break;
      case '7' :
	System.out.println("O�epa�op continue:\ncontinue; ��� continue �����;");
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
		