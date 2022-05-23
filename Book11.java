package P9_3312101011;

class Book11 extends Publication11 {
    private String author;

    public Book11 (String theTitle, String myAuthor) {
        super(theTitle);
        this.author = author;
        author = myAuthor;
    }

    public void sellCopy(int temp) {
        this.copies -= temp;
        System.out.println("Anda order sebanyak : "+temp);
    }
    public int getCopies() {
        return this.copies;
    }
    public void setCopies(int pCopies) {
        this.copies = pCopies;
    }
    public void orderCopies(int pCopies) {
        System.out.println("Judul : "+this.title+"\nJumlah salinan : "+pCopies);
        System.out.println("Harga : "+(this.price*pCopies)+"\nAuthor : "+this.author);
    }
    public void setAuthor(String Author) {
        this.author = Author;
    }
    public String getAuthor() {
        return this.author;
    }
}
