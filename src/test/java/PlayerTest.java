import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void setUp(){
        player = new Player("Kakashi");
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }


    @Test
    public void hasName(){
        assertEquals("Kakashi", player.getName());
    }

    @Test
    public void startsWithEmptyHand(){
        assertEquals(0, player.getHand().size());
    }

    @Test
    public void canTakeCard(){
        player.takeCard(card);
        assertEquals(1, player.getHand().size());
    }

    @Test
    public void hasHandTotal(){
        player.takeCard(card);
        player.takeCard(card);
        assertEquals(2, player.handTotal());
    }

    @Test
    public void canShowHand(){
        player.takeCard(card);
        assertEquals("ACE of HEARTS", player.showCard(0));
    }
}
