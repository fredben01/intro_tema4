public class Main {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIf = -1;
        if(numeroIf > 0) {
            System.out.println("Es positivo");
        } else if(numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //Mostrarlo por pantalla cada vez que se ejecute.
        int numeroWhile = 1;
        while (numeroWhile < 3) {
            System.out.println("Numero while: "+ numeroWhile);
            numeroWhile++;
        }

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        int numeroDoWhile = 1;

        do {
            System.out.println("numeroDoWhile: "+numeroDoWhile);
            numeroDoWhile = 3;
        } while (numeroDoWhile < 3);

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        for (int numeroFor = 0;numeroFor<3;numeroFor++) {
            System.out.println("numeroFor:" + numeroFor);
        }

        // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
        String estacion = "Invierno";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación valida");

        }

    }
}