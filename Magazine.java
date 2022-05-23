package P9_3312101011;

class Magazine extends Publication {
    private int orderQty;
    private String currIssue;
    private String myTitle;

    public Magazine(String Issue, String theTitle) {
        super(theTitle);
        this.currIssue = Issue;
        myTitle = theTitle;
    }

    public void sellCopy(int temp) {
        this.copies -= temp;
        System.out.println("Anda order sebanyak : "+temp);
    }

    public int getCopies(){
		return this.copies;
	}
	public void setCopies(int pCopies){
		this.copies = pCopies;
		System.out.println("Salinan majalah berjumlah : "+pCopies);
	}
	public int adjustQty(){
		return this.copies += this.orderQty;
	}
	public void acceptNewIssue (String pNewIssue){
		this.currIssue = pNewIssue;
	}
	public String getIssue(){
		return currIssue;
	}
}