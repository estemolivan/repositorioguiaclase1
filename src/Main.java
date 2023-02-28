public class Main {
    public static void main(String[] args)
    {
        int numeroInicio = 5;
        int numeroFin = 14;
       // Ejercicio A
       /* while (numeroInicio <= numeroFin ) {
            System.out.println(numeroInicio);
            numeroInicio++;
        }*/
        // Ejercicio B
        /* while (numeroInicio <= numeroFin ) {
            if (numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);

            }
            numeroInicio++;
        }*/

    //Ejercicio C

    /* char tipoNumero = 'p';

        while (numeroInicio <= numeroFin ) {
            if (tipoNumero == 'p'){
                if (numeroInicio % 2 == 0) {

                    System.out.println(numeroInicio);
                }
            }
            else {
                if (numeroInicio % 2 != 0) {

                    System.out.println(numeroInicio);
                }
            }
            numeroInicio++;
        } */
    // Ejercicio D
       /* for(int i = numeroFin; i >= numeroInicio; i --){
            if (i % 2 == 0) {
                System.out.println(i);

            }

        } */
        // Ejercicio 2.(d)
        float ingresos = 456852;
        int vehiculosMenor5 = 2;
        int inmuebles = 3;
        boolean lujos = true;

        if ( (ingresos >= 489083) || ( vehiculosMenor5 >= 3) || (inmuebles >= 3)  || (lujos ==true))
        {
            System.out.println("pertenece al segmento de ingresos altos");
        } else  {
            System.out.println("NO pertece al segmento de ingresos altos");
        }
    }

}