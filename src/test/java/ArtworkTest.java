import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;

    //testing

    @BeforeEach
    public void setUp(){
        artwork = new Artwork ("Smiling Dog",1600, "Nft1");
    }

    @Test
    public void hasPrice(){
        assertThat(artwork.getPrice()).isEqualTo(1600);
    }

    @Test
    public void setPrice(){
        artwork.setPrice(2000);
        assertThat(artwork.getPrice()).isEqualTo(2000);
    }

}

