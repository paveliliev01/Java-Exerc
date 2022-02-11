import java.util.Scanner;

public class GoFighters {
    public static void main(String[] args) {

        Players player1 = new Players();
        Players player2 = new Players();

        System.out.println("Choose between Warrior, Knight, Assassin, Monk");
        player1.setTypePlayer("Assassin");
        player2.setTypePlayer("Knight");

        do{
            System.out.println(" FIRST Player one attacks");
            player1.playerAttack(player2);
            System.out.println("SECOND Player two attacks");
            player2.playerAttack(player1);



            if (player1.getHealthPoints() <= 0) {
                System.out.println("HERO " + player2.getTypePlayer() + " WON THE MATCH!! \n" + "Player 1 lost the battle ");
                System.out.println(player1.getHealthPoints());
            }
            if (player2.getHealthPoints() <= 0) {
                System.out.println("HERO " + player1.getTypePlayer() + " WON THE MATCH!! \n" + "Player 2 lost the battle ");
                System.out.println( player1.getHealthPoints() + " " + player2.getHealthPoints());
            }
        }while(player1.getHealthPoints() > 0 && player2.getHealthPoints() > 0);
    }
}
