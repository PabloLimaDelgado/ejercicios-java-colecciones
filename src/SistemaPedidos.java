import java.util.List;
import java.util.ArrayList;

public class SistemaPedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void cambiarEstadoPedido(int id, EstadoPedido nuevoEstado) {
        for (Pedido p : pedidos) {
            if (p.getId() == id) {
                p.setEstado(nuevoEstado);
                break;
            }
        }
    }

    public List<Pedido> buscarPorEstado(EstadoPedido estado) {
        List<Pedido> resultado = new ArrayList<>();
        for (Pedido p : pedidos) {
            if (p.getEstado() == estado) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public void mostrarPedidos(List<Pedido> lista) {
        for (Pedido p : lista) {
            System.out.println(p);
        }
    }
}
