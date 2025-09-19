package Builder;
import Producto.Bebida;


public interface BebidaBuilder {
    BebidaBuilder conBase();
    BebidaBuilder conTipoLeche(String tipoLeche);
    BebidaBuilder conSabor();
    BebidaBuilder conHelado();
    Bebida build();
}