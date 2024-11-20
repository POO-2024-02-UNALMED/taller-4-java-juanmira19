package classroom;

public enum Tipo {
    DISCIPLINAR(10, "Disciplinar"),
    FUNDAMENTACION(20, "Fundamentación"),
    ELECTIVA(30, "Electiva");

    private final int codigo; // Atributo para el código
    private final String nombre; // Atributo para el nombre

    // Constructor privado (requerido para enums)
    private Tipo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Métodos getters para acceder a los atributos
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}