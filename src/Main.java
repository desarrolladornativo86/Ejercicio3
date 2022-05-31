public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(10, 30, 50);
        System.out.println("Resultado: " + resultado);
        //Resolvemos coche
        Coche miCoche = new Coche();
        //Llamamos a la clase
        miCoche.AgregarPuerta();
        System.out.println("El total de puertas ahora son: " +miCoche.puertas);
            }
            public static int suma(int a, int b, int c){
                return a + b + c;
            }
        }