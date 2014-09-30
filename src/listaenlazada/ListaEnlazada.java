/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaenlazada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author Administrador
 */
public class ListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
    Random r;
		int d, x1, x2;
		final int M = 29; // número de elementos de la lista
		final int MX = 999;
		BufferedReader entrada = new BufferedReader(
		new InputStreamReader(System.in));
		ListaDoble lis = new ListaDoble();
                
                
		r = new Random();
		 
		for (int j = 1; j <= M ; j++){
			d = r.nextInt(MX) + 1;
			lis.insertarCabezaLista(d);
		}
		System.out.println("Elementos de la lista original");
                System.out.println("cantidad de datos: "+lis.getcont());
		lis.visualizar();
		// rango de valores
		System.out.println("\nRango que va a contener la lista");
		x1 = Integer.parseInt(entrada.readLine());
		x2 = Integer.parseInt(entrada.readLine());
		// crea iterador asociado a la lista
		IteradorLista iterador = new IteradorLista(lis);
		Nodo a;
		// recorre la lista con el iterador
		a = iterador.siguiente();
		while (a != null){
			int w;
			w = a.getDato();
			if (!(w >= x1 && w <= x2)) // fuera de rango
				lis.eliminar(w);
			a = iterador.siguiente();
		}
		System.out.println("Elementos actuales de la lista");
                System.out.println("cantidad de datos: "+lis.getcont());
		lis.visualizar();
	}
    
}
