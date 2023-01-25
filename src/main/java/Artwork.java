public class Artwork {

    //declare properties
    private String title;
    private int price;
    private String nft;

    // constructor
    public Artwork(String title, int price, String nft){
        this.title = title;
        this.price = price;
        this.nft = nft;
    }

    // getters and setters
    public String getTitle() {return this.title;}
    public void setTitle() {this.title = title;}

    public int getPrice() {return this.price;}
    public void setPrice(int price) {this.price = price;}

    public String getNft() {return nft;}
    public void setNft(String nft) {this.nft = nft;}
}
