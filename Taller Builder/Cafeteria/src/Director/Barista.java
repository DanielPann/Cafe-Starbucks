package Director;


import Builder.BananiniBuilder;
import Builder.BebidaBuilder;
import Builder.ChocoTinBuilder;
import Builder.FrezzberryBuilder;
import Producto.Bebida;


public class Barista {
    
    public Bebida prepararChocoTin(String tipoLeche) {
        System.out.println("Preparando ChocoTin...");
        BebidaBuilder builder = new ChocoTinBuilder();
        return builder.conBase()
                     .conTipoLeche(tipoLeche)
                     .conSabor()
                     .conHelado()
                     .build();
    }

    public Bebida prepararFrezzberry() {
        System.out.println("Preparando Frezzberry...");
        BebidaBuilder builder = new FrezzberryBuilder();
        return builder.conBase()
                     .conTipoLeche("") 
                     .conSabor()
                     .conHelado()
                     .build();
    }

    public Bebida prepararBananini(String tipoLeche) {
        System.out.println("Preparando Bananini...");
        BebidaBuilder builder = new BananiniBuilder();
        return builder.conBase()
                     .conTipoLeche(tipoLeche)
                     .conSabor()
                     .conHelado()
                     .build();
    }
}
