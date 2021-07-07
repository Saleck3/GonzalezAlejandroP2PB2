package gonzalezAlejandroP1PB2;

public abstract class Miembro {
    
    private Integer dni;
    private String nombreYApellido;
    private String equipo;
    
    public Miembro(Integer dni, String nombreYApellido, String equipo) {
	super();
	this.dni = dni;
	this.nombreYApellido = nombreYApellido;
	this.equipo = equipo;
    }
    
    public String getNombreYApellido() {
        return nombreYApellido;
    }
    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }
    public Integer getDni() {
        return dni;
    }
    
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((dni == null) ? 0 : dni.hashCode());
	result = prime * result + ((nombreYApellido == null) ? 0 : nombreYApellido.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Miembro other = (Miembro) obj;
	if (dni == null) {
	    if (other.dni != null)
		return false;
	} else if (!dni.equals(other.dni))
	    return false;
	if (nombreYApellido == null) {
	    if (other.nombreYApellido != null)
		return false;
	} else if (!nombreYApellido.equals(other.nombreYApellido))
	    return false;
	return true;
    }

    public String getEquipo() {
        return equipo;
    }

    
}
