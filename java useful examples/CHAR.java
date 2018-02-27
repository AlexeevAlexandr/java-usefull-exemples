class CHAR{
  public static void main(String args[]) {

	String s1 = "firefox";
	
	System.out.println(s1.toUpperCase());   //выведет все заглавные FIREFOX
	System.out.println(s1.replace('o','a'));  //выведет мен€€ о на а firefax
	System.out.println(s1.charAt(1));   //выведет второй символ i
	System.out.println(s1.length());  //выведет кол-во символов в строке 7
	System.out.println(s1.indexOf('f'));   //выведет 0 - это пор€дковый номер символа
	System.out.println(s1.indexOf('r'));   //выведет 2 - это пор€дковый номер символа
	System.out.println(s1.lastIndexOf('f')); //выведет 4 - это пор€дковый номер символа с конца
	System.out.println(s1.indexOf('t'));  //выведет -1, так как t нет символа в строке

}}