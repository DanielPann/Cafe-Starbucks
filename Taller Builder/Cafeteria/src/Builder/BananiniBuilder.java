package Builder;
import Producto.Bebida;

public class BananiniBuilder implements BebidaBuilder {
    private Bebida bebida;
    private String tipoLeche;

    public BananiniBuilder() {
        this.bebida = new Bebida("", "", "", false, "Bananini");
    }

    @Override
    public BebidaBuilder conBase() {
        bebida.setBase("leche");
        return this;
    }

    @Override
    public BebidaBuilder conTipoLeche(String tipoLeche) {
        this.tipoLeche = tipoLeche;
        bebida.setTipoLeche(tipoLeche);
        return this;
    }

    @Override
    public BebidaBuilder conSabor() {
        bebida.setSabor("banano");
        return this;
    }

    @Override
    public BebidaBuilder conHelado() {
        bebida.setTieneHelado(true);
        return this;
    }

    @Override
    public Bebida build() {
        this.conBase();
        this.conSabor();
        this.conHelado();
        return bebida;
    }
}