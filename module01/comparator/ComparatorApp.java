package module01.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorApp {
    public static void main(String[] args) {
        Player Omar = new Player("Omar", 19, 50, true);
        Player Nicat = new Player("Nicat", 18, 80, true);
        Player Riyad = new Player("Riyad", 20, 90, true);
        List<Player> players = Arrays.asList(Omar, Nicat, Riyad);
//        Collections.sort(players, (o1, o2)-> {
//            if (o1.getScore() != o2.getScore()) return Integer.compare(o1.getScore(), o2.getScore());
//            else if(o1.isMale() != o2.isMale()){
//                return Boolean.compare(o1.isMale(), o2.isMale());
//            }
//        });

        Collections.sort(
                players,
                Comparator.comparing(Player::getScore)
                        .thenComparing(Player::isMale, Comparator.reverseOrder())
                        .thenComparing(Player::getName, Comparator.reverseOrder())
                        .thenComparing(Player::getAge, Comparator.reverseOrder())
        );

    }
}
 