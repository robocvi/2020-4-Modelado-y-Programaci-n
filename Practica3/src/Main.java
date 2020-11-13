import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        System.out.println("Bienvenido al creador de coches ¿Que desea hacer? Presione un numero para seleccionar.");
        System.out.println("1 - Crear coche desde cero.");
        System.out.println("2 - Utilizar uno de los tres coches ya creados.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Por favor inserte el nombre de su nuevo auto.");
                System.out.println("Nota: Se le dara un presupuesto de 1000 puntos para crear su auto.");
                Scanner xc = new Scanner(System.in);
                String s = xc.nextLine();
                System.out.println("Su coche se llama: " + s);
                nuevasLlantas(s, 1000);
                break;
            case 2:
                System.out.print("Escoge uno de los tres autos");
                autosPredeterminados();
                break;
        }
        return;
    }

    public static void autosPredeterminados(){
        System.out.println("Selecciona uno de nuestros coches, las stats del vehiculo se daran hasta que lo selecciones.");
        System.out.println("1 - Dios del fuego");
        System.out.println("2 - Pistolero");
        System.out.println("3 - Sonic");
        Builder b;
        Llantas l;
        Motor m;
        Carroceria c;
        Blindaje bl;
        Armas a;
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        switch(o){
            case 1:
                b = new AutoBuilder("Dios del fuego");
                l = new LlantaDeportiva();
                b = b.llantas(l);
                m = new MotorDeportivo();
                b = b.motor(m);
                c = new CarroceriaCasual();
                b = b.carroceria(c);
                bl = new BlindajeReforzado();
                b = b.blindaje(bl);
                a = new ArmaLanzallamas();
                b = b.armas(a);
                estadisticas(b,120);
                break;
            case 2:
                b = new AutoBuilder("Pistolero");
                l = new LlantaOrugaTanque();
                b = b.llantas(l);
                m = new MotorDiesel();
                b = b.motor(m);
                c = new CarroceriaCamion();
                b = b.carroceria(c);
                bl = new BlindajeTanque();
                b = b.blindaje(bl);
                a = new ArmaMetralleta();
                b = b.armas(a);
                estadisticas(b,230);
                break;
            case 3:
                b = new AutoBuilder("Sonic");
                l = new LlantaDeportiva();
                b = b.llantas(l);
                m = new MotorDeportivo();
                b = b.motor(m);
                c = new CarroceriaDeportiva();
                b = b.carroceria(c);
                bl = new BlindajeSimple();
                b = b.blindaje(bl);
                a = new ArmaSierra();
                b = b.armas(a);
                estadisticas(b,350);
                break;
        }

    }

    public static void nuevasLlantas(String s, int n){
        Builder b = new AutoBuilder(s);
        System.out.println("¿Que llantas quiere para su auto?");
        System.out.println("1 - Llantas Simples, costo: 50, velocidad: +5");
        System.out.println("2 - Llantas Deportivas, costo: 90, velocidad: +8");
        System.out.println("3 - Llantas Off-Road, costo: 70, velocidad: +4");
        System.out.println("4 - Llantas Oruga Tanque, costo: 100, velocidad: +4, defensa: +4");
        Llantas a;
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        switch(o){
            case 1:
                a = new LlantaSimple();
                n = n - a.costo();
                b = b.llantas(a);
                nuevoMotor(b, n);
                break;
            case 2:
                a = new LlantaDeportiva();
                n = n - a.costo();
                b = b.llantas(a);
                nuevoMotor(b, n);
                break;
            case 3:
                a = new LlantaOffRoad();
                n = n - a.costo();
                b = b.llantas(a);
                nuevoMotor(b, n);
                break;
            case 4:
                a = new LlantaOrugaTanque();
                n = n - a.costo();
                b = b.llantas(a);
                nuevoMotor(b, n);
                break;
        }


    }

    public static void nuevoMotor(Builder b, int n){
        System.out.println("¿Que motor quiere para su auto?");
        System.out.println("1 - Motor Deportivo, costo: 200, velocidad: +10");
        System.out.println("2 - Motor Diesel, costo: 150, velocidad: +7");
        System.out.println("3 - Motor Turbo, costo: 250, velocidad: +15");
        Motor m;
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        switch(o){
            case 1:
                m = new MotorDeportivo();
                n = n - m.costo();
                b = b.motor(m);
                nuevoCarroceria(b, n);
                break;
            case 2:
                m = new MotorDiesel();
                n = n - m.costo();
                b = b.motor(m);
                nuevoCarroceria(b, n);
                break;
            case 3:
                m = new MotorTurbo();
                n = n - m.costo();
                b = b.motor(m);
                nuevoCarroceria(b, n);
                break;
        }
    
    }

    public static void nuevoCarroceria(Builder b, int n){
        System.out.println("¿Que  carroceria quiere para su auto?");
        System.out.println("1 - Carroceria Casual, costo: 125, defensa: +6, velocidad: +1");
        System.out.println("2 - Carroceria Camion, costo: 150, defensa: +9");
        System.out.println("3 - Carroceria Deportiva, costo: 200, defensa: +3 velocidad: +5");
        Carroceria m;
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        switch(o){
            case 1:
                m = new CarroceriaCasual();
                n = n - m.costo();
                b = b.carroceria(m);
                nuevoBlindaje(b, n);
                break;
            case 2:
                m = new CarroceriaCamion();
                n = n - m.costo();
                b = b.carroceria(m);
                nuevoBlindaje(b, n);
                break;
            case 3:
                m = new CarroceriaDeportiva();
                n = n - m.costo();
                b = b.carroceria(m);
                nuevoBlindaje(b, n);
                break;
        }
    }

    public static void nuevoBlindaje(Builder b, int n){
        System.out.println("¿Que blindaje quiere para su auto?");
        System.out.println("1 - Blindaje Simple, costo: 120, defensa: +3, velocidad: +2");
        System.out.println("2 - Blindaje Reforzado, costo: 160, defensa: +8, velocidad: +1");
        System.out.println("3 - Blindaje Tanque, costo: 250, defensa: +15");
        Blindaje a;
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        switch(o){
            case 1:
                a = new BlindajeSimple();
                n = n - a.costo();
                b = b.blindaje(a);
                nuevoArmas(b, n);
                break;
            case 2:
                a = new BlindajeReforzado();
                n = n - a.costo();
                b = b.blindaje(a);
                nuevoArmas(b, n);
                break;
            case 3:
                a = new BlindajeTanque();
                n = n - a.costo();
                b = b.blindaje(a);
                nuevoArmas(b, n);
                break;
        }

    }

    public static void nuevoArmas(Builder b, int n){
        System.out.println("¿Que arma quiere para su auto?");
        System.out.println("1 - Arpon, costo: 75, ataque: +6 ,defensa: +1");
        System.out.println("2 - Lanza Llamas , costo: 150, ataque: 12");
        System.out.println("3 - Blindaje Cañones, costo: 130, ataque: +10");
        System.out.println("4 - Sierra, costo: 130, ataque: +9, defensa : +2");
        System.out.println("5 - Metralleta, costo: 250, ataque: 15");
        Armas a;
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        switch(o){
            case 1:
                a = new ArmaArpon();
                n = n - a.costo();
                b = b.armas(a);
                estadisticas(b, n);
                break;
            case 2:
                a = new ArmaLanzallamas();
                n = n - a.costo();
                b = b.armas(a);
                estadisticas(b, n);
                break;
            case 3:
                a = new ArmaCaniones();
                n = n - a.costo();
                b = b.armas(a);
                estadisticas(b, n);
                break;
            case 4:
                a = new ArmaSierra();
                n = n - a.costo();
                b = b.armas(a);
                estadisticas(b, n);
                break;
            case 5:
                a = new ArmaMetralleta();
                n = n - a.costo();
                b = b.armas(a);
                estadisticas(b, n);
                break;
        }

    }

    public static void estadisticas(Builder b, int n){
        Auto u = b.build();
        System.out.println("Asi quedo tu coche: ");
        System.out.println("Nombre: " + u.getNombreCarro());
        System.out.println("Partes:");
        System.out.println(u.getNombreLlantas());
        System.out.println(u.getNombreMotor());
        System.out.println(u.getNombreCarroceria());
        System.out.println(u.getNombreBlindaje());
        System.out.println(u.getNombreArmas());
        System.out.println("Stats: ");
        System.out.println("Costo: " + u.getCosto());
        System.out.println("Velocidad: " + u.getVelocidad());
        System.out.println("Ataque: " + u.getAtaque());
        System.out.println("Defensa: " + u.getDefensa());
        System.out.println("Dinero sobrante: " + n);
    }
}
