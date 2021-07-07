package gonzalezAlejandroP1PB2;

public class Jugador extends Miembro {
    
    private Integer nroCamiseta;
    private String posicion;

    public Jugador(Integer dni, String nombreYApellido, String equipo, Integer nroCamiseta, String posicion) {
	super(dni, nombreYApellido, equipo);
	this.nroCamiseta = nroCamiseta;
	this.posicion = posicion;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

}
