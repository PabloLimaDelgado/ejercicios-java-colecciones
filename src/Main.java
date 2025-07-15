import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SistemaPedidos sistema = new SistemaPedidos();

        sistema.agregarPedido(new Pedido(1, "Juan", Arrays.asList("Pizza", "Coca-Cola")));
        sistema.agregarPedido(new Pedido(2, "Lucía", Arrays.asList("Hamburguesa", "Agua")));
        sistema.agregarPedido(new Pedido(3, "Carlos", Arrays.asList("Ensalada", "Jugo")));

        sistema.cambiarEstadoPedido(2, EstadoPedido.EN_PREPARACION);
        sistema.cambiarEstadoPedido(3, EstadoPedido.ENTREGADO);

        System.out.println("Pedidos en preparación:");
        sistema.mostrarPedidos(sistema.buscarPorEstado(EstadoPedido.EN_PREPARACION));

        System.out.println("\nPedidos entregados:");
        sistema.mostrarPedidos(sistema.buscarPorEstado(EstadoPedido.ENTREGADO));
    }
}