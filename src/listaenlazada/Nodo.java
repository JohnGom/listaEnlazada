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
public class Nodo {
	protected int dato;
	protected Nodo adelante;
	protected Nodo atras;
	
	public Nodo(int entrada){
		dato = entrada;
		adelante = atras = null;
	}
	
	public int getDato(){
		return dato;
	}
}


	