import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un ejercito, los pelotones son representados como
 * comandantes ya que estos ya cuentan con una lista de soldados.
 */
public abstract class Ejercito implements Sujeto{

    private List<Comandante> comandantes = new ArrayList<>();
    private double vida;
    private Enemigo enemigo;

    /**
     * Recibe la orden para ser transmitida a todos los comandantes
     * @param i la orden: 1 es atacar, 2 es mover y 3 reportar
     */
    public void notificaOrden(int i) {
        for (Comandante comandante : comandantes) {
            comandante.updateOrden(i, enemigo);
        }
    }

    /**
     * Añade un comandante al ejercito
     * @param comandante 
     */
    public void add(Comandante comandante) {
        comandantes.add(comandante);
    }

    /**
     * Elimina un comandante del ejercito
     * @param comandante
     */
    public void remove(Comandante comandante) {
        if (comandantes.indexOf(comandante) != -1) {
            comandantes.remove(comandante);
        } else {
            System.out.println("El comandante que intentas eliminar del ejercito, no existe");
        }
    }
    /**
     * Nos regresa el i-esimo comandante de la lista.
     * @param i
     */
    public Comandante getComandante(int i) {
        return (Comandante) comandantes.get(i);
    }

    /**
     * Regresa la vida del ejercito
     * @return vida del ejercito
     */
    public double getVida() {
        return vida;
    }

    /**
     * Modifica la vida del ejercito
     * @param vida la vida actualizada
     */
    public void setVida(double vida) {
        this.vida = vida;
    }

    /**
     * Nos devuelve el enemigo asignado a este ejercito
     * @return el enemigo
     */
    public Enemigo getEnemigo(){
        return enemigo;
    }

    /**
     * Asigna un enemigo al ejercito
     * @param e el enemigo
     */
    public void setEnemigo(Enemigo e){
        this.enemigo = e;
    }

    public void notificaInfoEjercito() {
        int i = 1;
        System.out.print("\nLa informacion de este ejercito es: \n");
        for (Comandante comandante : comandantes) {
            System.out.print("Peloton " + i + ".\n"); 
            comandante.updateInfo();
            i++;
        }
    }
}