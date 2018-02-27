package bookpack;
class Book{
	private String title;
	private String autor;
	private int pubDate;

	Book(String t, String a, int d){
		title = t;
		autor = a;
		pubDate = d;
		}
	void show(){
		System.out.println(title);
		System.out.println(autor);
		System.out.println(pubDate);
		System.out.println();
		}
	}
class BookDemo{
 public static void main (String args []){
	Book books[] = new Book[5];
	
	books[0] = new Book ("Java for beginer`s","Shildt", 2014);
	books[1] = new Book ("Java The Complete reference","Shildt", 2014);
	books[2] = new Book ("The art of Java","Shildt", 2003);
	books[3] = new Book ("Red storm rising","Shildt", 1986);
	books[4] = new Book ("On the road","Shildt", 1955);

	for(int i=0; i< books.length; i++) books[i].show();
	}
}