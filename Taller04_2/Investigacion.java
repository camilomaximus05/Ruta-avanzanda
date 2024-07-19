package Taller04_2;

public class Investigacion {
    public static void main(String[] args) {

        //ArrayLists

        /*Un ArrayList en Java es una implementación de la *interfaz List que utiliza un arreglo dinámico para *almacenar elementos. A diferencia de los arreglos *tradicionales en Java, los ArrayLists pueden cambiar *de tamaño dinámicamente según sea necesario.
        *Ejemplos con tipos de datos:
        */



       /* ArrayList<Integer> numeros = new ArrayList<>();
        * numeros.add(5);
        * numeros.add(10);
        * numeros.add(15);
        *
        * ArrayList<String> palabras = new ArrayList<>();
        * palabras.add("Hola");
        * palabras.add("Mundo");
       */

        //Métodos principales:

            //add(E elemento): Añade un elemento al final de la lista.

            //get(int índice): Devuelve el elemento en la posición especificada.
            
            //size(): Devuelve el número de elementos en la lista.

            //remove(int índice):Elimina el elemento en la posición especificada.

            //isEmpty():Devuelve true si la lista está vacía, false si no.


        //Ejemplo de uso de métodos:

        /* ArrayList<Double> precios = new ArrayList<>();
         * precios.add(19.99);
         * precios.add(25.50);
         * double primerPrecio = precios.get(0);
         * precios.remove(1);
         * int cantidadElementos = precios.size();
         */

        //Map

        /*Un Map en Java es una colección que asocia claves *únicas a valores correspondientes. Cada clave puede *mapearse a un solo valor. Los Map son útiles para *implementar diccionarios y bases de datos de *clave-valor.
        */

        //Ejemplos con tipos de datos:

        /* Map<String, Integer> edades = new HashMap<>();
         * edades.put("Juan", 25);
         *  edades.put("María", 30);
         *
         *
         * Map<Integer, String> nombres = new HashMap<>();
         * nombres.put(1, "Pedro");
         * nombres.put(2, "Ana");
         */

        //Métodos principales:

        //put(K clave, V valor): Asocia el valor especificado con la clave especificada en el mapa.

        //get(Object clave): Devuelve el valor al que está asignada la clave especificada, o null si el mapa no contiene la clave.
        
        //containsKey(Object clave): Devuelve true si el mapa contiene la clave especificada.
        
        //remove(Object clave): Elimina la entrada correspondiente a la clave especificada.
        
        //keySet(): Devuelve un conjunto de todas las claves en el mapa.

        /* Map<String, Double> notas = new HashMap<>();
        *  notas.put("Juan", 8.5);
        *  notas.put("María", 9.0);
        *  double notaJuan = notas.get("Juan");
        *  notas.remove("María");
        *  boolean contieneMaria = notas.containsKey("María");
        *  Set<String> estudiantes = notas.keySet();
        */

        /*
         * Investigación 3: OOP - Pilares del Paradigma Orientado a Objetos
         *
         * Los pilares del paradigma orientado a objetos son conceptos fundamentales que guían el diseño de sistemas de software:
         *
         * Abstracción: Permite modelar características esenciales de un objeto relevante para el sistema,
         * ignorando detalles irrelevantes. Ejemplo: una clase Animal puede tener métodos como moverse() y comer(),
         * abstrayendo los detalles específicos de cada tipo de animal.
         *
         * Encapsulamiento: Consiste en ocultar el estado interno de los objetos y restringir el acceso directo a ellos
         * desde el exterior. Esto se logra mediante el uso de modificadores de acceso (public, private, protected)
         * y métodos getter y setter. Ejemplo: atributos de una clase (private int edad;) con métodos (public int getEdad()
         * y public void setEdad(int edad)).
         *
         * Herencia: Permite definir una nueva clase basada en una clase existente. La nueva clase hereda atributos
         * y métodos de la clase base y puede agregar sus propios atributos y métodos adicionales. Ejemplo: una clase Gato
         * puede heredar de la clase Animal, obteniendo automáticamente los métodos moverse() y comer().
         *
         * Polimorfismo: Permite que objetos de diferentes clases respondan al mismo mensaje de manera diferente. Puede
         * lograrse mediante la herencia y la implementación de métodos abstractos o mediante la sobrecarga y la
         * sobrescritura de métodos. Ejemplo: una interfaz Hablar que implementan las clases Perro y Gato, cada una con
         * su propia implementación del método hablar().
         */




    }
}