import java.util.ArrayList;
public class Gallery {

    // properties
    private String name;
    private int till;

    private ArrayList<Artwork> artworks;
//    private ArrayList<Customer> customers;


    // constructor
    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList<>();
    }

    // ensure it can count artworks to determine stock count
    // till count
    public int countArtworks(){
        return this.artworks.size();
    }
    public int countTill(Gallery gallery){
        return this.till;
    }

    // now we can add and remove
    public void addArtworks(Artwork artwork){
        this.artworks.add(artwork);
    }

    public void removeArtworks(){
        this.artworks.remove(0);
    }

    public ArrayList<Artwork> getArtworks(){
        return this.artworks;
    }

    public void addArtwork(Artwork jol) {
    }


    // allow customers to buy artwork from gallery, reducing money from wallet and removing artwork bought from stock
    public void buyArtwork(Customer customer, Artwork artwork){
        if (customer.getWallet() >= artwork.getPrice()){
            customer.setWallet(customer.getWallet() - artwork.getPrice());
            this.artworks.remove(artwork);
        }
    }
}
