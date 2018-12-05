package es.MZabala;

public class Casa {

    //Objeto con los parametros de Casa junto a sus getters, setters y su override por los jajas.

    protected String Direccion;
    protected int codigoPostal;
    protected int nHabitaciones;
    protected double metrosCuadrados;

    public Casa(String direccion, int codigoPostal, int nHabitaciones, double metrosCuadrados) {
        Direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.nHabitaciones = nHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "Direccion='" + Direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", nHabitaciones=" + nHabitaciones +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
