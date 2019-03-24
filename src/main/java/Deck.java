import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();

        for( SuitType s : SuitType.values()){
            for (RankType r : RankType.values()){
                Card card = new Card(s,r);
                this.cards.add(card);
            }
        }

        Collections.shuffle(this.cards);
    }


    public int cardCount() {
        return this.cards.size();
    }

    public Card dealOne(){
        return  this.cards.remove(0);
    }

}
