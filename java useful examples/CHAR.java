class CHAR{
  public static void main(String args[]) {

	String s1 = "firefox";
	
	System.out.println(s1.toUpperCase());   //������� ��� ��������� FIREFOX
	System.out.println(s1.replace('o','a'));  //������� ����� � �� � firefax
	System.out.println(s1.charAt(1));   //������� ������ ������ i
	System.out.println(s1.length());  //������� ���-�� �������� � ������ 7
	System.out.println(s1.indexOf('f'));   //������� 0 - ��� ���������� ����� �������
	System.out.println(s1.indexOf('r'));   //������� 2 - ��� ���������� ����� �������
	System.out.println(s1.lastIndexOf('f')); //������� 4 - ��� ���������� ����� ������� � �����
	System.out.println(s1.indexOf('t'));  //������� -1, ��� ��� t ��� ������� � ������

}}