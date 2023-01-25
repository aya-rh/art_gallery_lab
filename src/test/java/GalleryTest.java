import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Customer customer;

    @BeforeEach
    void setUp(){
        gallery = new Gallery("Aya and Diana's Farm");
        customer = new Customer("Aya", 20000);
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(20000);
    }

    @Test
    public void setWallet(){
        customer.setWallet(50000);
        assertThat(customer.getWallet()).isEqualTo(50000);
    }

    @Test
    void canCountStock(){
        assertThat(gallery.countArtworks()).isEqualTo(0);
    }

    @Test
    void canAddStock(){
        Artwork jol = new Artwork("Jol", 300, "nft3");
        gallery.addArtwork(jol);

    }
}
