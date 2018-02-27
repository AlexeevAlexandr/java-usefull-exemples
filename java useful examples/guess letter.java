class guess letter{
  public static void main(String args[])
  throws java.io.IOException{
	
	char ch,ignore, answer='s';
		do{
		System.out.println("Push button");
		ch=(char)System.in.read();
			do{
			ignore=(char)System.in.read();
			}while(ignore != '\n');
		if(ch==answer)System.out.println("right");
		else 
		System.out.println("sorry, but you need anather letter");
		
		}while(answer != ch);
		
}}