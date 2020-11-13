/**
 * Interfaz para definir el metodo de reportarse en sus diferentes comportamientos para los soldados
 * Patron Strategy.
 */
public interface ReportBehaviour {

    /**
     * Hace que un soldado se reporte, cada tipo de soldado lo hace de manera diferente
     * @param s el soldado
     * @return el string que se mostrara en consola con la informacion de la accion
     */
    public String reportar(Soldado s);
    
}