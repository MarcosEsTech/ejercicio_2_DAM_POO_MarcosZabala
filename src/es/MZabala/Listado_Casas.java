package es.MZabala;

public class Listado_Casas {

    //Objeto donde almacenamos las casas en un array mediante una llamada a funcion que se hace desde el main

    private Casa[] lista;
    private int contador;

    //Funcion para obtener el tamaño maximo del array

    public Listado_Casas(int TamanoLista) {
        this.lista = new Casa[TamanoLista];
        this.contador = 0;
    }

    //funcion para comprobar si se a alcanzado el tamaño limite de la lista

    private boolean full() {
        return contador == lista.length;
    }

    //funcion para meter el valor de casa en el array

    public boolean introducir(Casa c) {
        if (full()) {
            return false;
        } else {
            this.lista[contador] = c;
            this.contador++;
            return true;
        }
    }

    // Un conjunto de bucles que guardan todos los valores del array de casas en otro para mostrarlo ordenado por pantalla

    public String toString() {
        String infoLista = "Direcciones:";
        for (int i = 0; i < contador; i++) {
            infoLista += "\n" +lista[i].getDireccion();
        }
        infoLista += "\n\nCodigos Postales:";
        for (int j = 0; j < contador; j++){
            infoLista += "\nCódigo Postal: "+lista[j].getCodigoPostal();
        }
        infoLista += "\n\nHabitaciones:";
        for (int k = 0; k < contador; k++){
            infoLista += "\nNúmero de Habitaciones: "+lista[k].getnHabitaciones();
        }
        infoLista += "\n\nSuperficie habitable:";
        for (int l = 0; l < contador; l++){
            infoLista += "\nMetros Cuadrados: "+lista[l].getMetrosCuadrados()+" m2";
        }
        return infoLista;
    }
}