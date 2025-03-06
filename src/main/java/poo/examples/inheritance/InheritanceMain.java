package poo.examples.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Player player = new Player("Roboute Guilliman");
        Enemy enemy = new Enemy("Horus Lupercal");


        System.out.println("*****************************");
        System.out.println("Jugador: " + player.getName());
        System.out.println("Salud: " + player.getHealth());
        System.out.println("Nivel: " + player.getLevel());
        System.out.println("*****************************");

        System.out.println("*****************************");
        System.out.println("Enemigo: " + enemy.getName());
        System.out.println("Salud: " + enemy.getHealth());
        System.out.println("Nivel: " + enemy.getLevel());
        System.out.println("*****************************");
    }
}
