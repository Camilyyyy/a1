public class Deportista {
    //, NOMBRE, GENERO, DEPORTE,RENDIMIENTO Y EDAD
    private int Id;
    private String nombre;
    private  String genero;
    private String deporte;
    private int rendimiento;
    private int edad;

    public Deportista(int id, String nombre, String genero, String deporte, int rendimiento, int edad) {
        Id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.deporte = deporte;
        this.rendimiento = rendimiento;
        this.edad = edad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Deportista{" +
                "Id=" + Id +
                ", nombre=" + nombre +
                ", genero=" + genero +
                ", deporte=" + deporte +
                ", rendimiento=" + rendimiento +
                ", edad=" + edad +
                '}';
    }
}
