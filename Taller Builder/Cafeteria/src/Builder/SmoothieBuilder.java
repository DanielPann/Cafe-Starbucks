package Builder;
public interface SmoothieBuilder {
    void buildName();
    void buildType();
    void buildFlavour();
    void buildIceCream();
    Producto.Smoothie getSmoothie(); 
}
