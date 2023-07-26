class Main {
    public static void main(String[] args) {
/**
 * The value of the local variable player[1|2|3] is not usedJava(536870973)
 * so I just commented out
*/
//        Player player1 = new Player(Difficulty.EASY);
//        Player player2 = new Player(Difficulty.MEDIUM);
//        Player player3 = new Player(Difficulty.HARD);
    }
}

enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

class Player {
/**
 * The public type Player must be defined in its own file: Java(16777541)
 * so I just removed the `public` and now shows no errors
*/
    Player(Difficulty diff){
        // your code goes here
        switch(diff) {
            case EASY:
                System.out.println("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;
            case HARD:
                System.out.println("You have 1000 bullets");
                break;
        }
    }
}
