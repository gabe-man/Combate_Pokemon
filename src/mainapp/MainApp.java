package mainapp;
import models.*;
import almacen.*;
import enums.*;

public class MainApp {

	public static void main(String[] args) {
		Combate combate=new Combate(Almacen.bulbasur,Almacen.charmander);
		
		while(!combate.isFinished())
		{
			System.out.println(combate.getPokemon1().getNombre()+": "+combate.getPokemon1().getActualHP()+"HP");
			System.out.println(combate.getPokemon2().getNombre()+": "+combate.getPokemon2().getActualHP()+"HP");
			System.out.println(combate.primeroEnTurno().getNombre()+":");
			Movimiento movimiento1=combate.primeroEnTurno().elegirMovimiento();
			combate.aplicarMovimiento(movimiento1, combate.primeroEnTurno(), combate.segundoEnTurno());
			System.out.println(combate.segundoEnTurno().getNombre()+":");
			Movimiento movimiento2=combate.segundoEnTurno().elegirMovimiento();
			combate.aplicarMovimiento(movimiento2, combate.segundoEnTurno(), combate.primeroEnTurno());	
		}

	}

}
