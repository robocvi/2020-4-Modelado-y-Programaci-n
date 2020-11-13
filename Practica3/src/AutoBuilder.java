public class AutoBuilder extends Builder{
	

	public AutoBuilder(String nombreCarro) {
      this.nombreCarro = nombreCarro;
      this.costo = 0;
      this.ataque = 0;
      this.defensa = 0;
      this.velocidad = 0;
    }

    public AutoBuilder llantas(Llantas llantas) {
      this.llantas = llantas;
      costo = costo + llantas.costo();
      ataque = ataque + llantas.statAtaque();
      defensa = defensa + llantas.statDefensa();
      velocidad = velocidad + llantas.statVelocidad();

      return this;
    }

    public AutoBuilder motor(Motor motor) {
      this.motor = motor;
      costo = costo + motor.costo();
      ataque = ataque + motor.statAtaque();
      defensa = defensa + motor.statDefensa();
      velocidad = velocidad + motor.statVelocidad();
      return this;
    }

    public AutoBuilder carroceria(Carroceria carroceria) {
      this.carroceria = carroceria;
      costo = costo + carroceria.costo();
      ataque = ataque + carroceria.statAtaque();
      defensa = defensa + carroceria.statDefensa();
      velocidad = velocidad + carroceria.statVelocidad();
      return this;
    }

    public AutoBuilder blindaje(Blindaje blindaje) {
      this.blindaje = blindaje;
      costo = costo + blindaje.costo();
      ataque = ataque + blindaje.statAtaque();
      defensa = defensa + blindaje.statDefensa();
      velocidad = velocidad + blindaje.statVelocidad();
      return this;
    }

    public AutoBuilder armas(Armas armas) {
      this.armas = armas;
      costo = costo + armas.costo();
      ataque = ataque + armas.statAtaque();
      defensa = defensa + armas.statDefensa();
      velocidad = velocidad + armas.statVelocidad();
      return this;
    }

    public Auto build() {
      return new Auto(this);
    }
}