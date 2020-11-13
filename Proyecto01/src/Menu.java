import java.util.Scanner;

/**
 * Clase para unificar el proyecto, patron facade
 */
public class Menu {

    private FabricaEjercitos fabricaEjercitos = new FabricaEjercitos();
    private Ejercito ejercito;
    private Enemigo enemigoxd = new Enemigo();

    /**
     * Nos da el menu para que el jugador escoja un ejercito
     */
    public void menuEjercito() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escoge un ejercito, se muestra la informacion de cada uno...");
        System.out.println(
                "1 - EJERCITO EXPLORADOR: Se conforma con 3 pelotones.\nPelotón 1 tienen 6 soldados de infantería.\nPelotón 2 se compone con 1 artillero y 2 miembros de la caballería.\nPelotón 3 se compone con 6 soldados, todos miembros de la caballería.");
        System.out.println(
                "2 - EJERCITO DEFAULT: Se conforma con 3 pelotones.\nPelotón 1 tienen 6 soldados, todos miembros de la infantería.\nPelotón 2 tiene 3 artilleros.\nPelotón 3 tiene 6 miembros de la caballería.");
        System.out.println(
                "3 - EJERCITO KAMIKAZE: Se conforma de 3 pelotones.\nPelotón 1 y 2 tienen 5 soldados cada uno, todos miembros de la infantería.\nPelotón 3 tiene 5 soldados, todos miembros de la caballería.");

        int i = in.nextInt();
        switch (i) {
            case 1:
                ejercito = fabricaEjercitos.getEjercito("explorador");
                ejercito.setEnemigo(enemigoxd);
                System.out.println("Escogiste el ejercito explorador:\n");
                ejercito.notificaInfoEjercito();
                System.out.println("Vida inicial del enemigo = " + enemigoxd.getVida());
                System.out.println("Distancia inicial del enemigo = " + ejercito.getComandante(0).getDistancia() + "\n");
                break;
            case 2:
                ejercito = fabricaEjercitos.getEjercito("default");
                ejercito.setEnemigo(enemigoxd);
                System.out.println("Escogiste el ejercito default:\n");
                ejercito.notificaInfoEjercito();
                System.out.println("Vida inicial del enemigo = " + enemigoxd.getVida());
                System.out.println("Distancia inicial del enemigo = " + ejercito.getComandante(0).getDistancia() + "\n");
                break;
            case 3:
                ejercito = fabricaEjercitos.getEjercito("kamikaze");
                ejercito.setEnemigo(enemigoxd);
                System.out.println("Escogiste el ejercito kamikaze:\n");
                ejercito.notificaInfoEjercito();
                System.out.println("Vida inicial del enemigo = " + enemigoxd.getVida());
                System.out.println("Distancia inicial del enemigo = " + ejercito.getComandante(0).getDistancia() + "\n");
                break;
            default:
                System.out.println("No es una opcion valida, vuelve a escoger...");
                menuEjercito();
                break;
        }
    }

    /**
     * Hace la simulacion, recibe las ordenes del jugador para los comandantes
     * mientras el enemigo siga vivo
     */
    public void play() {
        Scanner in = new Scanner(System.in);
        while (enemigoxd.getVida() > 0) {
            System.out.println("Vida del enemigo = " + enemigoxd.getVida());
            System.out.println("¿Que accion quieres que tus comandantes ordenen a sus subordinados?");
            System.out.println("1 - ATACAR");
            System.out.println("2 - MOVERSE");
            System.out.println("3 - REPORTARSE");
            ejercito.notificaOrden(in.nextInt());
        }
        System.out.println("Vida del enemigo = 0");
        System.out.println("---------------------------------------------------");
        System.out.println("FELICIDADES");
        System.out.println("LO LOGRASTE, TU EJERCITO DERROTO AL ENEMIGO");
        System.out.println("---------------------------------------------------");
        in.close();
    }

}