/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaenlazada;

/**
 *
 * @author Administrador
 */
public class IteradorLista {
	private Nodo actual;
	
	public IteradorLista(ListaDoble ld){
		actual = ld.cabeza;
	}
	
	public Nodo siguiente(){
		Nodo a;
		a = actual;
		if (actual != null){
			actual = actual.adelante;
		}
		return a;
	}
	
	public Nodo anterior(){
		Nodo a;
		a = actual;
		if (actual != null){
			actual = actual.atras;
		}
		return a;
	}
}
