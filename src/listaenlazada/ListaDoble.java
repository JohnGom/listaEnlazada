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
public class ListaDoble { 
	protected Nodo cabeza;
        int cont =0;
	
	public ListaDoble(){
		
	}
	
	public void visualizar() {
		IteradorLista iterador = new IteradorLista(this);
		Nodo a;
		a = iterador.siguiente();
		while (a != null){
			int w = a.getDato();
			System.out.println(w);
			a = iterador.siguiente();
		}
	}
	
	public ListaDoble insertarCabezaLista(int entrada){
		Nodo nuevo;
		nuevo = new Nodo(entrada);
		nuevo.adelante = cabeza;
		if (cabeza != null )
			cabeza.atras = nuevo;
		cabeza = nuevo;
		cont ++;
                return this;
               
	}
	
	public ListaDoble insertaDespues(Nodo anterior, int entrada){
		Nodo nuevo;
		nuevo = new Nodo(entrada);
		nuevo.adelante = anterior.adelante;
		if (anterior.adelante != null)
			anterior.adelante.atras = nuevo;
		anterior.adelante = nuevo;
		nuevo.atras = anterior;
		 cont ++;
                return this;
               
	}
	
	public void eliminar (int entrada){
		Nodo actual;
		boolean encontrado = false;
		actual = cabeza;
		// Bucle de búsqueda
		while ((actual != null) && (!encontrado)){
			/* la comparación se realiza con el método equals()...,
			depende del tipo Elemento */
			encontrado = (actual.dato == entrada);
			if (!encontrado)
				actual = actual.adelante;
		}
		// Enlace de nodo anterior con el siguiente
		if (actual != null){
		//distingue entre nodo cabecera o resto de la lista
			if (actual == cabeza){
				cabeza = actual.adelante;
				if (actual.adelante != null)
					actual.adelante.atras = null;
			}else if (actual.adelante != null){
				// No es el último nodo
				actual.atras.adelante = actual.adelante;
				actual.adelante.atras = actual.atras;
			}else // último nodo
				actual.atras.adelante = null;
			actual = null;
                        cont --;
		}
	}
        
        public int getcont (){
            return cont;
        }
}
