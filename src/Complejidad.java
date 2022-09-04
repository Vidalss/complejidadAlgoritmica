public class Complejidad {

    public float Algoritmo1(float n) {

        long startTime = System.nanoTime();

        /* … El código que se está midiendo comienza … */

        float suma = 0;
        for(float x = 1; x <= n+1; x++) {
            suma += x;
        }

        /*… El código que se está midiendo termina… */

        long endTime = System.nanoTime();

        //Se saca la diferencia entre el final y el inicio
        long timeElapsed = endTime - startTime;
        System.out.println("Tiempo de ejecución en nanosegundos: " + timeElapsed);
        System.out.println("Tiempo de ejecución en milisegundos: " + timeElapsed / 1000000);
        return suma;
    }

    public float Algoritmo2(float n ) {
        long startTime = System.nanoTime();

        /* … El código que se está midiendo comienza … */
        float suma = (n * (n +1)) / 2;

        /*… El código que se está midiendo termina… */

        long endTime = System.nanoTime();

        //Se saca la diferencia entre el final y el inicio
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        return suma;

    }

    public static void main(String[] args)  {

        Complejidad complejidad = new Complejidad();

        complejidad.Algoritmo1(200000);
        complejidad.Algoritmo2(200000);

    }


}
