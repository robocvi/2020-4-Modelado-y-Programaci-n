public abstract class Builder{
	protected String nombreCarro;
	protected Llantas llantas;
    protected Motor motor;
    protected Carroceria carroceria;
    protected Blindaje blindaje;
    protected Armas armas;
    protected int costo;
    protected int ataque;
    protected int defensa;
    protected int velocidad;

    public abstract Auto build();
    
    public abstract Builder llantas(Llantas llantas);

    public abstract Builder motor(Motor motor);

    public abstract Builder carroceria(Carroceria carroceria);

    public abstract Builder blindaje(Blindaje blindaje);

    public abstract Builder armas(Armas armas);
}