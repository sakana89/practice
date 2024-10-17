public class Book extends TangileAsset{
	private String isbn;
	public Book (Sring name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public String getlsbn(){return this.isbn;}
}
