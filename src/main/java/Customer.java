import java.util.ArrayList;

public class Customer {

    // declare properties
    private String name;
    private int wallet;


    // constructor and variables
    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public int getGetWallet(){
        return this.wallet;
    }

    public void wallet(Gallery gallery){
        // get artworks from the gallery
//        ArrayList<Customer> customers = gallery;
        String name = getName();

        //start a running total of artworks
        int totalArtworks = 0;

        // loop through customers
        for (Artwork artwork : gallery.getArtworks()){
            // add each artwork to running total
            totalArtworks += artwork.getPrice();
            artwork.setPrice(0);
        }
        // update
        this.wallet = totalArtworks;
    }


    // getters and setters
    public String getName() {
        return this.name;
     }
    public void setName(String name) {this.name = name;}

    public int getWallet() {
        return this.wallet;}
    public void setWallet(int wallet) {this.wallet = wallet;}

}
