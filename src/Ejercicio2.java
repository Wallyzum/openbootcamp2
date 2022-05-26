import java.util.Enumeration;

public  class Ejercicio2 {

    public static void main(String[] args) {
        //Ejercicio usando if
        int numeroIf = 0;
        if (numeroIf<0) System.out.println("sentencia if: " + numeroIf + " es Negativo");
            else if (numeroIf>0) System.out.println("sentencia if: " + numeroIf + " es Positivo");
            else System.out.println("sentencia if: es Cero");
        //Ejercicio usando While
        int numeroWhile=0;
        while(numeroWhile<3) System.out.println("bucle While: "+numeroWhile++);
        //Ejercicio usando do while
        int numeroDoWhile=2;
        do
        {
            System.out.println("bucle do While: " + numeroDoWhile++);
        } while(numeroDoWhile<3);
        //Ejercicio usando for
        int numeroFor = 0;
        for(int a = 0 ; numeroFor <= 3 ; a++) System.out.println("bucle for: " +numeroFor++);
        //Ejercicio  usando switch y search
        String estacion = "INVIERNO";
        System.out.print("switch : ");
        switch (estacion){

            case "INVIERNO" :
                System.out.print("Estamos en "+estacion+", abrigate antes de salir.");
                break;
            case "OTOÑO" :
                System.out.print("Estamos en "+estacion+", lleva la camara, los arboles estan hermosos.");
                break;
            case "VERANO" :
                System.out.print("Estamos en "+estacion+", no te olvides del protector solar.");
                break;
            default:
                System.out.print("estamos en "+estacion+", tomate el antialergico antes de salir.");

        }

    }
}
