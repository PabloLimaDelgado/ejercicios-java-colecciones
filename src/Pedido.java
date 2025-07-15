import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private int id;
    private String cliente;
    private List<String> platos;
    private EstadoPedido estado;

    public Pedido(int id, String cliente, List<String> platos) {
        this.id = id;
        this.cliente = cliente;
        this.platos = platos;
        this.estado = EstadoPedido.PENDIENTE;
    }

    public int getId() { return id; }
    public EstadoPedido getEstado() { return estado; }
    public void setEstado(EstadoPedido estado) { this.estado = estado; }

    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", platos=" + platos +
                ", estado=" + estado +
                '}';
    }
}
