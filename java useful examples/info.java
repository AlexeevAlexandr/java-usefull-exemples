class info{
  public static void main(String args[])
	throws java.io.IOException {
	char ch;
	
	System.out.println("Info about description syntax operators: \n1. Operator if\n2. Operator switch\n3. Operator for\n4. Operator while\n5. Operator do-while\n6. Escape\nMake your choice");
	for( ; ; ) {
	ch=(char) System.in.read();
if(ch=='1') {System.out.println("Operator if:\n(condition) operator;\nelse operator;");
	System.out.println(); 
	char cn;
	System.out.println();
	System.out.println("Continue? \n1. Yes\n2. No");
	for( ; ; ) {
	cn=(char) System.in.read();
	if(cn=='1') System.out.println();
	if(cn=='1') System.out.println("Info about description syntax operators: \n1. Operator if\n2. Operator switch\n3. Operator for\n4. Operator while\n5. Operator do-while\n6. Escape\nMake your choice");
	if(cn=='1') break;
	if(cn=='2') System.out.println();
	if(cn=='2') System.out.println("Confirm the exit, click 6");
	if(cn=='2') break;}
}
if(ch=='2') {System.out.println("Operator switch:\nswitch (expression)\ncase constant:\nsequence operators\nbreak;");
	System.out.println();
	char ct;
	System.out.println();
	System.out.println("Continue? \n1. Yes\n2. No");
	for( ; ; ) {
	ct=(char) System.in.read();
	if(ct=='1') System.out.println();
	if(ct=='1') System.out.println("Info about description syntax operators: \n1. Operator if\n2. Operator switch\n3. Operator for\n4. Operator while\n5. Operator do-while\n6. Escape\nMake your choice");
	if(ct=='1') break;
	if(ct=='2') System.out.println();
	if(ct=='2') System.out.println("Confirm the exit, click 6");
	if(ct=='2') break;}
}
if(ch=='3'){ System.out.println("Operator for:\nfor(initialization; condition; interatsiya)\noperator");
	System.out.println();
	char cq;
	System.out.println();
	System.out.println("Continue? \n1. Yes\n2. No");
	for( ; ; ) {
	cq=(char) System.in.read();
	if(cq=='1') System.out.println();
	if(cq=='1') System.out.println("Info about description syntax operators: \n1. Operator if\n2. Operator switch\n3. Operator for\n4. Operator while\n5. Operator do-while\n6. Escape\nMake your choice");
	if(cq=='1') break;
	if(cq=='2') System.out.println();
	if(cq=='2') System.out.println("Confirm the exit, click 6");
	if(cq=='2') break;}
}
if(ch=='4') {System.out.println("Operator while (condition) operator");
	System.out.println();
	char cw;
	System.out.println();
	System.out.println("Continue? \n1. Yes\n2. No");
	for( ; ; ) {
	cw=(char) System.in.read();
	if(cw=='1') System.out.println();
	if(cw=='1') System.out.println("Info about description syntax operators: \n1. Operator if\n2. Operator switch\n3. Operator for\n4. Operator while\n5. Operator do-while\n6. Escape\nMake your choice");
	if(cw=='1') break;
	if(cw=='2') System.out.println();
	if(cw=='2') System.out.println("Confirm the exit, click 6");
	if(cw=='2') break;}
}
if(ch=='5') {System.out.println("Operator do-while:\ndo {\noperator\nwhile (condition);");
	System.out.println();
	char ce;
	System.out.println();
	System.out.println("Continue? \n1. Yes\n2. No");
	for( ; ; ) {
	ce=(char) System.in.read();
	if(ce=='1') System.out.println();
	if(ce=='1') System.out.println("Info about description syntax operators: \n1. Operator if\n2. Operator switch\n3. Operator for\n4. Operator while\n5. Operator do-while\n6. Escape\nMake your choice");
	if(ce=='1') break;
	if(ce=='2') System.out.println();
	if(ce=='2') System.out.println("Confirm the exit, click 6");
	if(ce=='2') break;}
}
if(ch=='6') break;	
	
}}}