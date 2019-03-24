import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

    Player player1;
    Player player2;
    Deck deck;
    Game game;
    Card highCard;
    Card lowCard;

    @Before
    public void setUp(){
        player1 = new Player("kakashi");
        player2= new Player("Loofy");
        deck = new Deck();
        game = new Game(deck);
        game.addPlayer(player1);
        game.addPlayer(player2);

        highCard = new Card(SuitType.HEARTS, RankType.QUEEN);
        lowCard =  new Card(SuitType.CLUBS, RankType.THREE);

    }

    @Test
    public void hasPlayers(){
        assertEquals(2, game.playerCount());
    }

    @Test
    public void canStart(){
        game.start(1);
        assertEquals(1, player1.cardCount());
        assertEquals(1, player2.cardCount());
    }

    @Test
    public void canDealMultipleCards(){
        game.start(20);
        assertEquals(20, player1.cardCount());
        assertEquals(20, player2.cardCount());
    }

    @Test
    public void gameCanCheckDraw(){
        player1.takeCard(highCard);
        player2.takeCard(highCard);
        assertTrue(game.checkDraw());
    }

    @Test
    public void canCheckWinner(){
        player1.takeCard(highCard);
        player2.takeCard(lowCard);
        assertEquals(player1, game.checkWinner());
    }
}
