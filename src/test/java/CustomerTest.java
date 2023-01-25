import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Aya", 200);
    }

    @Test
    void hasBoughtArtwork(){
        assertThat(customer.getWallet()).isEqualTo(200);
    }

    @Test
    void canBuyArtworks(){
        //arrange
        Gallery gallery = new Gallery("Aya & Diana's Gallery");
        Artwork Sky = new Artwork("Sky", 300, "Nft5");
        Artwork Beach = new Artwork("Beach", 700, "Nft22");
        Artwork Fire = new Artwork("Fire", 400, "Nft17");

        // act
        gallery.addArtworks(Sky);
        gallery.addArtworks(Beach);
        gallery.addArtworks(Fire);

        // assert
        customer.wallet(gallery);
        assertThat(customer.getWallet()).isEqualTo(1400);
    }


}
