package P9_3312101011;

public class demoLibrary11 implements LibraryCollection11 {
    public String idCollection;

    public void setCategory(String myCategory) {
        this.idCollection = myCategory;
    }

    public String getCategory() {
        return this.idCollection;
    }

    public static void main(String[] args) {
        Book11 pOne = new Book11("Garis Waktu", "Fiersa Besari");
        LibraryCollection11 ctg = new demoLibrary11();

        pOne.setPrice(99000);
        pOne.setCopies(9);
        ctg.setCategory("Novel Fiksi");

        System.out.println("Salinan buku berjumlah : "+pOne.getCopies());
        System.out.println("Buku yang dipesan : ");
        pOne.orderCopies(1);
        pOne.sellCopy(1);
        System.out.println("Jumlah salinan buku sekarang : "+pOne.getCopies());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
