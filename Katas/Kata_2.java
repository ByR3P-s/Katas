public class Game {

  public String winner(String[] deckSteve, String[] deckJosh) {
    int steveScore = 0;
    int joshScore = 0;

    for (int i = 0; i < deckSteve.length; i++) {
      int steveCardValue = getCardValue(deckSteve[i]);
      int joshCardValue = getCardValue(deckJosh[i]);

      if (steveCardValue > joshCardValue) {
        steveScore++;
      } else if (joshCardValue > steveCardValue) {
        joshScore++;
      }
    }

    if (steveScore > joshScore) {
      return "Steve wins " + steveScore + " to " + joshScore;
    } else if (joshScore > steveScore) {
      return "Josh wins " + joshScore + " to " + steveScore;
    } else {
      return "Tie";
    }
  }

  private int getCardValue(String card) {
    String ranks = "23456789TJQKA";
    return ranks.indexOf(card.charAt(0));
  }
}
