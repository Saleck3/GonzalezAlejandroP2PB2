package gonzalezAlejandroP1PB2;

public class Gol implements Comparable<Gol>{
    
    private Jugador autor;
    private Integer minuto;
    private String lado;
    
    
    
    public Gol(Jugador autor, Integer minuto, String lado) {
	super();
	this.autor = autor;
	this.minuto = minuto;
	this.lado = lado;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((autor == null) ? 0 : autor.hashCode());
	result = prime * result + ((minuto == null) ? 0 : minuto.hashCode());
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
	Gol other = (Gol) obj;
	if (autor == null) {
	    if (other.autor != null)
		return false;
	} else if (!autor.equals(other.autor))
	    return false;
	if (minuto == null) {
	    if (other.minuto != null)
		return false;
	} else if (!minuto.equals(other.minuto))
	    return false;
	return true;
    }

    @Override
    public int compareTo(Gol o) {
	return this.minuto.compareTo(o.minuto);
    }
    
    public String getlado() {
	return this.lado;
    }

}
