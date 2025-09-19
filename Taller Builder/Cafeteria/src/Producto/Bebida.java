package Producto;

public class Bebida {
    private String base;
    private String tipoLeche;
    private String sabor;
    private boolean tieneHelado;
    private String nombre;

    public Bebida(String base, String tipoLeche, String sabor, boolean tieneHelado, String nombre) {
        this.base = base;
        this.tipoLeche = tipoLeche;
        this.sabor = sabor;
        this.tieneHelado = tieneHelado;
        this.nombre = nombre;
    }

    public void mostrarResumen() {
        System.out.println("\n=== RESUMEN DE LA BEBIDA ===");
        System.out.println("Bebida: " + nombre);
        System.out.println("Base: " + base);
        if ("leche".equals(base)) {
            System.out.println("Tipo de leche: " + tipoLeche);
        }
        System.out.println("Sabor: " + sabor);
        System.out.println("Helado: " + (tieneHelado ? "Sí" : "No"));
        System.out.println("============================\n");
    }


    public void setBase(String base) { this.base = base; }
    public void setTipoLeche(String tipoLeche) { this.tipoLeche = tipoLeche; }
    public void setSabor(String sabor) { this.sabor = sabor; }
    public void setTieneHelado(boolean tieneHelado) { this.tieneHelado = tieneHelado; }
    public void setNombre(String nombre) { this.nombre = nombre; }


    public String getBase() { return base; }
    public String getTipoLeche() { return tipoLeche; }
    public String getSabor() { return sabor; }
    public boolean isTieneHelado() { return tieneHelado; }
    public String getNombre() { return nombre; }
}
