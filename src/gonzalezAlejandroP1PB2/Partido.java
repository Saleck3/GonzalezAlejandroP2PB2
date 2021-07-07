package gonzalezAlejandroP1PB2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import exepciones.JugadorNoEncontradoException;

public class Partido {

    private HashSet<Jugador> local = new HashSet<Jugador>();
    private HashSet<Jugador> visitante = new HashSet<Jugador>();
    private TreeSet<Gol> goles = new TreeSet<Gol>();
    private String localNombre;
    private String visitanteNombre;

    public Partido(String local, String visitante) {
	super();
	this.localNombre = local;
	this.visitanteNombre = visitante;
    }

    public String getLocal() {
	return localNombre;
    }

    public String getVisitante() {
	return visitanteNombre;
    }

    public void anotarGol(Jugador jugador, Integer minuto, String equipo) throws JugadorNoEncontradoException {

	//Si ninguno contiene al Jugador, tiro la excepcion
	if (!local.contains(jugador) && !visitante.contains(jugador)) {
	    throw new JugadorNoEncontradoException();
	}

	Gol gol;
	if (equipo.equals(localNombre)) {
	    gol = new Gol(jugador, minuto, "local");
	} else {
	    gol = new Gol(jugador, minuto, "visitante");
	}

	goles.add(gol);

    }

    public void agregarJugador(Jugador jugador, String equipo) {
	if (equipo.equals(localNombre)) {
	    local.add(jugador);
	} else {

	    visitante.add(jugador);
	}

    }

    public String getGanador() {
	int golesLocal = 0;
	int golesVisita = 0;
	Iterator<Gol> it = goles.iterator();

	while (it.hasNext()) {
	    Gol golAct = it.next();
	    if (golAct.getlado() == "local") {
		golesLocal++;
	    } else {
		golesVisita++;
	    }
	}

	if (golesLocal > golesVisita) {
	    return localNombre;
	}

	return visitanteNombre;

    }

    public Integer getCantidadGoles() {
	return goles.size();
    }

    public Object getListaGoles() {
	ArrayList<Gol> golesPartido = new ArrayList<Gol>();
	return golesPartido.addAll(goles);
    }

    public Integer GetCantidadJugadores() {
	return local.size() + visitante.size();
    }
}
