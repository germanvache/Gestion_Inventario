import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> inventario = new ArrayList<>();

        Producto manzanas = new Producto("Manzanas", 2.5, 10);
        Producto bananas = new Producto("Bananas", 1.0, 5);
        Producto naranjas = new Producto("Naranjas", 1.5, 20);

        inventario.add(manzanas);
        inventario.add(bananas);
        inventario.add(naranjas);

        // manzanas.setNombre("MANZANAS"); -> si quiere cambiar el nombre a mayuscula
        // System.out.println(manzanas.getCantidadEnInventario());

        System.out.println("Inventario actual: ");
        for (Producto producto : inventario) {
            System.out.println("Nombre : " + producto.getNombre() +
                    " , Cantidad en Inventario: " + producto.getCantidadEnInventario());

        }
    }
}