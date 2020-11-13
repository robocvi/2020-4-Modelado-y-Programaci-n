/**
 * Representa el ejercito explorador
 */
public class EjercitoExplorador extends Ejercito {

    public EjercitoExplorador() {
        Comandante comandante1 = new Comandante("101", "Marcos", 100);
        comandante1.setAtaque(new AtacarConPistola());
        comandante1.setMovimiento(new MoverAPie());
        comandante1.setReporte(new ReportarInfanteria());
        comandante1.add(new Infanteria("102", "Sofia", 100));
        comandante1.add(new Infanteria("103", "Antonio", 100));
        comandante1.add(new Infanteria("104", "Marcelo", 100));
        comandante1.add(new Infanteria("105", "Vania", 100));
        comandante1.add(new Infanteria("106", "Miriam", 100));
        Comandante comandante2 = new Comandante("201", "Zack", 100);
        comandante2.setAtaque(new AtacarConCanon());
        comandante2.setMovimiento(new MoverConCanon());
        comandante2.setReporte(new ReportarArtilleria());
        comandante2.add(new Caballeria("202", "Lizbeth", 100));
        comandante2.add(new Caballeria("203", "Lucas", 100));
        Comandante comandante3 = new Comandante("301", "Ivan", 100);
        comandante3.setAtaque(new AtacarConMosquete());
        comandante3.setMovimiento(new MoverACaballo());
        comandante3.setReporte(new ReportarCaballeria());
        comandante3.add(new Caballeria("302", "Pepe", 100));
        comandante3.add(new Caballeria("303", "Carlos", 100));
        comandante3.add(new Caballeria("304", "Nayeli", 100));
        comandante3.add(new Caballeria("305", "Ricardo", 100));
        comandante3.add(new Caballeria("306", "Maria", 100));
        add(comandante1);
        add(comandante2);
        add(comandante3);
        setVida(1500);
    }
}