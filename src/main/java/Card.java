public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }


    public SuitType getSuit() {
        return suit;
    }

    public RankType getRank() {
        return rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }

    public String cardName(){
        return String.format("%s of %s", this.rank, this.suit);
    }
}
