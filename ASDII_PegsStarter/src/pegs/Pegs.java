package pegs;

import domein.PegAdapter;
import domein.RoundPeg;
import domein.SquarePeg;

public class Pegs {

    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg();
        SquarePeg squarePeg = new SquarePeg();

        squarePeg.insert("inserting a square peg");
        //do nu een insert met een round peg
        // ...
        new PegAdapter(squarePeg).insertIntoHole("inserting square peg in round hole");
        roundPeg.insertIntoHole("inserting a round peg");
        //do nu een insertIntoHole met een squarepeg 
        //
        new PegAdapter(roundPeg).insert("inserting round peg in square hole");
    }
}
