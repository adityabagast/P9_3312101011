package P9_3312101011;

public class demoPublication {
    public static void main (String[] args){
		
		Book pOne = new Book("Geez & Ann","Rintik Sedu");
		Magazine pTwo = new Magazine("Desa Terpencil","KKN di Desa Penari");

		pOne.setPrice(100000);
		pOne.setCopies(10);
		
		System.out.println("Salinan buku berjumlah : "+pOne.getCopies());
		System.out.println("Buku yang dipesan :");
		pOne.orderCopies(2);
		pOne.sellCopy(2);
		System.out.println("Jumlah salinan buku sekarang : "+pOne.getCopies());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		pTwo.setPrice(50000);
		pTwo.setCopies(15);
		System.out.println("Majalah yang anda pesan:");
		System.out.println("Judul : "+pTwo.getTitle()+"\nHarga : "+pTwo.getPrice());
		System.out.println("New Issue : "+pTwo.getIssue());
		pTwo.sellCopy(2);
		System.out.println("Jumlah salinan majalah sekarang : "+pTwo.getCopies());
	}
}
