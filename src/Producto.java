public class Producto {

    //atributos
    private String nombre;
    private double precioUnitario;
    private int cantidadEnInventario;

    //constructor
    public Producto(String nombre, double precioUnitario, int cantidadEnInventario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    //metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }


}
