package gonzalezAlejandroP1PB2;

public class Dt extends Miembro {

    private Integer edad;
    
    public Dt(Integer dni, String nombreYApellido, String equipo, Integer edad) {
	super(dni, nombreYApellido, equipo);
	this.edad = edad;

    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
