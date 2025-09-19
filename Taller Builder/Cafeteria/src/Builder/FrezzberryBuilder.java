package Builder;

import Producto.Bebida;

public class FrezzberryBuilder implements BebidaBuilder {
    private Bebida bebida;

    public FrezzberryBuilder() {
        this.bebida = new Bebida("", "", "", false, "Frezzberry");
    }

    @Override
    public BebidaBuilder conBase() {
        bebida.setBase("agua");
        return this;
    }

    @Override
    public BebidaBuilder conTipoLeche(String tipoLeche) {
        return this;
    }

    @Override
    public BebidaBuilder conSabor() {
        bebida.setSabor("arándano");
        return this;
    }

    @Override
    public BebidaBuilder conHelado() {
        bebida.setTieneHelado(false);
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
