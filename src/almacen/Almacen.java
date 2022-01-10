package almacen;

import models.*;
import enums.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Almacen {
	public static Movimiento placaje=new Movimiento("placaje", new TipoPokemon("normal"), 35, 40, 1, 1, 1, 1, 1, new Estado("none"), Categoria.Fisico);
	public static Movimiento gru�ido=new Movimiento("gru�ido", new TipoPokemon("normal"), 0, 40, 0.75, 1, 1, 1, 1, new Estado("none"), Categoria.Estado);
	public static Movimiento latigoCepa=new Movimiento("latigo cepa", new TipoPokemon("planta"), 45, 25, 1, 1, 1, 1, 1, new Estado("none"), Categoria.Fisico);
	public static Movimiento ara�azo=new Movimiento("ara�azo", new TipoPokemon("normal"), 40, 35, 1, 1, 1, 1, 1, new Estado("none"), Categoria.Fisico);
	public static Movimiento ascua=new Movimiento("ascua", new TipoPokemon("fuego"), 40, 25, 1, 1, 1, 1, 1, new Estado("quemado"), Categoria.Especial);
	public static Pokemon charmander=new Pokemon(4, "Charmander", new TipoPokemon("fuego"), new TipoPokemon("none"), 21, 19, 23, 20, 24, new ArrayList<Movimiento>(Arrays.asList(ara�azo,ascua)), 35, 12);
	public static Pokemon bulbasur=new Pokemon(1, "Bulbasur", new TipoPokemon("planta"), new TipoPokemon("none"), 20, 20, 24, 24, 19, new ArrayList<Movimiento>(Arrays.asList(placaje,gru�ido,latigoCepa)), 36, 12);
	
}
