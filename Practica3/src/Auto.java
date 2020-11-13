public class Auto{
	private final String nombreCarro;
	private final Llantas llantas;
    private final Motor motor;
    private final Carroceria carroceria;
    private final Blindaje blindaje;
    private final Armas armas;
    private int costo;
    private int ataque;
    private int defensa;
    private int velocidad;

    public Auto(Builder builder) {
    	this.nombreCarro = builder.nombreCarro;
   	 	this.llantas = builder.llantas;
    	this.motor = builder.motor;
    	this.carroceria = builder.carroceria;
    	this.blindaje = builder.blindaje;
    	this.armas = builder.armas;
    	this.costo = builder.costo;
    	this.ataque = builder.ataque;
    	this.defensa = builder.defensa;
    	this.velocidad = builder.velocidad;
  	}

  	public String getNombreCarro(){
  		return nombreCarro;
  	}

  	public String getNombreLlantas(){
    	return llantas.nombreLlantas();
    }

    public String getNombreMotor(){
    	return motor.nombreMotor();
    }

    public String getNombreCarroceria(){
    	return carroceria.nombreCarroceria();
    }

    public String getNombreBlindaje(){
    	return blindaje.nombreBlindaje();
    }

    public String getNombreArmas(){
    	return armas.nombreArmas();
    }

    public int getCosto(){
    	return costo;
    }

    public int getAtaque(){
    	return ataque;
    }

    public int getDefensa(){
    	return defensa;
    }

        public int getVelocidad(){
    	return velocidad;
    }
}