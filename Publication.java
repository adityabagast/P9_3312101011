package P9_3312101011;

public class Publication{
	protected String title;
	protected double price;
	protected int copies;
	
	public Publication (String theTitle){
		this.title = theTitle;
	}
	public void setTitle(String Title){
		this.title = Title;
	}
	public void setPrice(double Price){
		this.price = Price;
	}
	public String getTitle(){
		return this.title;
	}
	public double getPrice(){
		return this.price;
	}
	public void sellCopy(int temp){
		this.copies -= temp;
		System.out.println("Anda order sebanyak : "+temp);
	}
	public int getCopies(){
		return this.copies;
	}
	public void setCopies(int pCopies){
		this.copies = pCopies;
	}
}