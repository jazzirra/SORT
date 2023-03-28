import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Move move1 = new Move("Damon Slayer","*****",2019);
        Move move2 = new Move("Attack of the Titans","****",2020);
        Move move3 = new Move("Black Clover","***",2017);
        Move move4 = new Move("My HERO Academy","*****",2016);
        Move move5 = new Move("NARUTO","*****",1999);
        Move[]moves = {move1,move2,move3,move4,move5};
        ArrayList<Move>moves1 = new ArrayList<>();
        for (Move move:moves) {
            moves1.add(move);

        }
        System.out.println("sortting by name");
        Collections.sort(moves1,Move.sortintByName);
        System.out.println(moves1);
        System.out.println("sortting by raiting");
        Collections.sort(moves1,Move.sortintByRaiting);
        System.out.println(moves1);
        System.out.println("sortting by date");
        Collections.sort(moves1,Move.sortintByDate);
        System.out.println(moves1);



    }
}