package gonzalezAlejandroP1PB2;

import static org.junit.Assert.*;

import org.junit.Test;

import exepciones.JugadorNoEncontradoException;

public class Tests {

    @Test
    public void queSePuedaCrearUnTorneoYAgregarJugadoresYDts() {

	Torneo copaAmerica = new Torneo();

	assertNotNull(copaAmerica);

	Jugador messi = new Jugador(5, "Lionel Messi", "Argentina", 10, "DEL");
	Dt scaloni = new Dt(1, "Lionel Scaloni", "Argentina", 45);

	copaAmerica.agregarMiembro(messi);
	copaAmerica.agregarMiembro(scaloni);

	assertEquals(2, copaAmerica.getCantidadMiembros(), 0.1);

    }

    @Test
    public void queSePuedaAgregarUnJugadorAUnPartido() throws JugadorNoEncontradoException {
	Torneo copaAmerica = new Torneo();

	Integer numeroPartido = copaAmerica.crearPartido("Arentina", "Uruguay");
	Jugador messi = new Jugador(5, "Lionel Messi", "Argentina", 10, "DEL");
	

	copaAmerica.agregarMiembro(messi);
	copaAmerica.agregarAPartido(numeroPartido, messi, "Arentina");
	
	assertEquals(1, copaAmerica.getCantidadJugadoresEnPartido(numeroPartido),0.1);
    }
    
    @Test
    public void queSePuedaJugarUnPartidoYAgregarAUnTorneo() {

	Torneo copaAmerica = new Torneo();

	Integer numeroPartido = copaAmerica.crearPartido("Arentina", "Uruguay");

	assertNotNull(numeroPartido);
	assertNotNull(copaAmerica);
	assertEquals(1, copaAmerica.getCantidadPartidos(), 0.1);
    }

    @Test
    public void queSePuedaMarcarUnGol() throws JugadorNoEncontradoException {

	Torneo copaAmerica = new Torneo();

	Integer numeroPartido = copaAmerica.crearPartido("Arentina", "Uruguay");
	Jugador messi = new Jugador(5, "Lionel Messi", "Argentina", 10, "DEL");
	

	copaAmerica.agregarMiembro(messi);
	copaAmerica.agregarAPartido(numeroPartido, messi, "Arentina");
	copaAmerica.anotarGol(numeroPartido, messi, "local", 45);
	
	assertEquals(1, copaAmerica.getCantidadGoles(numeroPartido));
    }
    
    @Test
    (expected = JugadorNoEncontradoException.class)
    public void queNoPuedaMarcarUnGolUnJugadorQueNoEstaEnElPartido() throws JugadorNoEncontradoException {

	Torneo copaAmerica = new Torneo();

	Integer numeroPartido = copaAmerica.crearPartido("Argentina", "Uruguay");
	Jugador messi = new Jugador(5, "Lionel Messi", "Argentina", 10, "DEL");
	

	copaAmerica.agregarMiembro(messi);
	copaAmerica.anotarGol(numeroPartido, messi, "Argentina", 45);

    }

    @Test
    public void queSePuedaSaberQuienGano() throws JugadorNoEncontradoException {
	
	Torneo copaAmerica = new Torneo();

	Integer numeroPartido = copaAmerica.crearPartido("Argentina", "Uruguay");
	Jugador messi = new Jugador(5, "Lionel Messi", "Argentina", 10, "DEL");
	

	copaAmerica.agregarMiembro(messi);
	copaAmerica.agregarAPartido(numeroPartido, messi, "Arentina");
	copaAmerica.anotarGol(numeroPartido, messi, "Argentina", 45);
	assertEquals("Argentina", copaAmerica.ganadorPartido(numeroPartido));

    }

    @Test
    public void queSePuedaObtenerUnaListaDeGoles() throws JugadorNoEncontradoException {
	Torneo copaAmerica = new Torneo();

	Integer numeroPartido = copaAmerica.crearPartido("Argentina", "Uruguay");
	Jugador messi = new Jugador(5, "Lionel Messi", "Argentina", 10, "DEL");
	

	copaAmerica.agregarMiembro(messi);
	copaAmerica.agregarAPartido(numeroPartido, messi, "Arentina");
	copaAmerica.anotarGol(numeroPartido, messi, "Argentina", 45);
	assertNotNull(copaAmerica.getListaGoles(numeroPartido));
    }


}
