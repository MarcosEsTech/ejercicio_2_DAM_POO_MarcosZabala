package es.MZabala;

public class Main {

    public static void main(String[] args) {
        //Declaración de las casas y llamada a la funcion Listado_Casas
        Listado_Casas listacasas = new Listado_Casas(10);
        listacasas.introducir(new Casa("Julio Burell",23700,5,120));
        listacasas.introducir(new Casa("Paco Estrellas",23565,4,75));
        listacasas.introducir(new Casa("Rosalia Matriarca",26500,4,80));
        listacasas.introducir(new Casa("Quevedo es calvo",24100,6,155));
        listacasas.introducir(new Casa("Muy calvo",24700,9,250));
        listacasas.introducir(new Casa("Angel que te calles",23500,5,100));

        System.out.println(listacasas.toString());
    }
}
