import java.util.Objects;
import java.util.Random;

public class Players {
    private String typePlayer;
    private double attackPoints;
    private double healthPoints;
    private double armorPoints;

    public void setTypePlayer(String player) {
        Random random = new Random();
        if (player.equals("Warrior")) {
            this.typePlayer = player;
            this.healthPoints = 100;
            this.armorPoints = 100;
            this.attackPoints = 100;
            double x = random.nextDouble() * (1.2 - 0.8) + 0.8;
            double temp = Math.floor(x * 100) / 100;
            this.attackPoints *= temp;
        }
        if (player.equals("Knight")) {
            this.typePlayer = player;
            this.healthPoints = 100;
            this.armorPoints = 100;
            this.attackPoints = 100;
            double x = random.nextDouble() * (1.2 - 0.8) + 0.8;
            int percentageHigherAttack = (int) (Math.random() * (9));
            if (percentageHigherAttack == 0) {
                this.attackPoints *= 3;
            } else {
                double temp = Math.floor(x * 100) / 100;
                this.attackPoints *= temp;
            }
        }

        if (player.equals("Assassin")) {
            this.typePlayer = player;
            this.healthPoints = 100;
            this.armorPoints = 100;
            this.attackPoints = 100;
            double x = random.nextDouble() * (1.2 - 0.8) + 0.8;
            int percentageHigherAttack = (int) (Math.random() * (2));
            if (percentageHigherAttack == 0) {
                this.attackPoints *= this.attackPoints;
            } else {
                double temp = Math.floor(x * 100) / 100;
                this.attackPoints *= temp;
            }
        }

        if (player.equals("Monk")) {
            this.typePlayer = player;
            this.healthPoints = 100;
            this.armorPoints = 100;
            this.attackPoints = 100;
            double x = random.nextDouble() * (1.2 - 0.8) + 0.8;
            double temp = Math.floor(x * 100) / 100;
            this.attackPoints *= temp;
        }

    }

    public void playerAttack(Players player) {
//        if (player.getTypePlayer() == "Knight"){
//            int percentageToBlockAttack = (int) (Math.random() * (4));
//            if (percentageToBlockAttack == 0){
//                player.setHealth((double) (player.getHealthPoints() ));
//            }else{
//                player.setHealth((double) (player.getHealthPoints() - (getAttackPoints() * getHealthPoints())));
//            }
//        }
//        player.setHealth((double) (player.getHealthPoints() -( getAttackPoints() * getHealthPoints())));
        Random random = new Random();
        double x = random.nextDouble() * (1.2 - 0.8) + 0.8;
        double armorDurability = Math.floor(x * 100) / 100;

        if (player.getTypePlayer().equals("Warrior")) {
            if (player.getArmorPoints() > 0) {
                player.setArmorPoints(player.getArmorPoints() - player.getArmorPoints() * armorDurability);
                player.setHealth((double) (player.getHealthPoints()));
            } else if (player.getArmorPoints() < 0) {
                double tempDamage = player.getArmorPoints() * (-1);
                player.setHealth(player.getHealthPoints() - tempDamage);
            }
        }

        if (player.getTypePlayer().equals("Knight")) {
            int percentageToBlockAttack = (int) (Math.random() * (4));
            if (percentageToBlockAttack == 0) {
                player.setHealth((double) (player.getHealthPoints()));
            } else if (player.getArmorPoints() > 0) {
                player.setArmorPoints(player.getArmorPoints() - player.getArmorPoints() * armorDurability);
                player.setHealth((double) (player.getHealthPoints()));
            } else if (player.getArmorPoints() < 0) {
                double tempDamage = player.getArmorPoints() * (-1);
                player.setHealth(player.getHealthPoints() - tempDamage);
            }
        }


        if (player.getTypePlayer().equals("Assassin")) {

            if (player.getArmorPoints() > 0) {
                player.setArmorPoints(player.getArmorPoints() - player.getArmorPoints() * armorDurability);
                player.setHealth((double) (player.getHealthPoints()));
            } else if (player.getArmorPoints() < 0) {
                double tempDamage = player.getArmorPoints() * (-1);
                player.setHealth(player.getHealthPoints() - tempDamage);
            }
        }

        if (player.getTypePlayer().equals("Monk")) {
            int percentageToBlockAttack = (int) (Math.random() * (2));
            if (percentageToBlockAttack == 0) {
                player.setHealth((double) (player.getHealthPoints()));
            } else if (player.getArmorPoints() > 0) {
                player.setArmorPoints(player.getArmorPoints() - player.getArmorPoints() * armorDurability);
                player.setHealth((double) (player.getHealthPoints()));
            } else if (player.getArmorPoints() < 0) {
                double tempDamage = player.getArmorPoints() * (-1);
                player.setHealth(player.getHealthPoints() - tempDamage);
            }
        }


        if (player.getHealthPoints() < 0) {
            player.setHealth(0);
        }


    }

    private void setArmorPoints(double armorPoints) {
        this.armorPoints = armorPoints;
    }

    private void setHealth(double health) {
        this.healthPoints = health;
    }


    public double getAttackPoints() {
        return attackPoints;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public double getArmorPoints() {
        return armorPoints;
    }

    public String getTypePlayer() {
        return typePlayer;
    }
}
