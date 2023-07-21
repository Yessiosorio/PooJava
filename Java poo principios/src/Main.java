// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto(1,"aceite", 14.00, 2);
        Producto p2 = new Producto(1, "azucar",5.00,3);
        Electronico l1 = new Electronico(3, "Telefono", 1500.00,1,"Honor");
        Electronico l2 = new Electronico(4,"impresora", 1000.00,1,"Hp");

        Orden orden = new Orden();
        orden.agregarProductos(p1);
        orden.agregarProductos(p2);
        orden.agregarProductos(l1);
        orden.agregarProductos(l2);

        orden.mostrarDetalles();
    }
}