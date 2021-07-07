package gonzalezAlejandroP1PB2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

import exepciones.JugadorNoEncontradoException;

public class Torneo{
    
    private HashSet<Miembro> miembros = new HashSet<Miembro>();
    private Map<Integer, Partido> partidos = new HashMap<Integer, Partido>();
    
    

    public void agregarMiembro(Miembro miembro) {
	miembros.add(miembro);
    }
    
    public Integer getCantidadMiembros(){
	return miembros.size();
    }

    public double getCantidadPartidos() {

	return partidos.size();
    }

    public Integer crearPartido(String local, String visitante) {
	
	Partido part = new Partido(local,visitante);
	Integer numeroPartido = partidos.size() + 1;
	partidos.put(numeroPartido, part);
	
	return numeroPartido;
    }

    public void anotarGol(Integer numeroPartido, Jugador jugador, String equipo, Integer minuto) throws JugadorNoEncontradoException {
	
	Partido part = partidos.get(numeroPartido);
	
	part.anotarGol(jugador, minuto, equipo);
	
    }

    public void agregarAPartido(Integer numeroPartido, Jugador jugador, String equipo) throws JugadorNoEncontradoException {
	Partido part = partidos.get(numeroPartido);
	
	if(miembros.contains(jugador) == false) {
	    throw new JugadorNoEncontradoException();
	}
	
	part.agregarJugador(jugador,equipo);
	
    }

    public String ganadorPartido(Integer numeroPartido) {
	Partido part = partidos.get(numeroPartido);
	return part.getGanador();
    }

    public Object getCantidadGoles(Integer numeroPartido) {
	Partido part = partidos.get(numeroPartido);
	return part.getCantidadGoles();
    }

    public Object getListaGoles(Integer numeroPartido) {
	Partido part = partidos.get(numeroPartido);
	return part.getListaGoles();
    }

    public Integer getCantidadJugadoresEnPartido(Integer numeroPartido) {
	Partido part = partidos.get(numeroPartido);
	return part.GetCantidadJugadores();
    }    
    

}
