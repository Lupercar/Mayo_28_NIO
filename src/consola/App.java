package consola;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) {
//		La librer�a NIO (New Input Output) se a�adi� en Java7.
//		Utiliza un patr�n Builder.
//		La clase principal es Path, para hacer operaciones 
//		tendremos la clase Files con m�todos est�ticos que 
//		operar�n sobre los Path.
//		Crea objetos inmutables.
		Path carpetaTemp = Paths.get("c:/Temp"); 
		Path fichero1 = Paths.get("c:/Temp/fichero1.txt"); 
		Path fichero2 = Paths.get("fichero2.txt"); 
		
//		Me devuelve un Path quitando la parte com�n
		System.out.println( carpetaTemp.relativize(fichero1) ); 
		
//		Devuelve un nuevo Path con la concatenaci�n de las dos rutas
		System.out.println( carpetaTemp.resolve(fichero2) ); 
		
//		Operaciones con Path
//		====================
		Path fichero2Absoluta = carpetaTemp.resolve(fichero2); 
		if(!Files.exists(fichero2Absoluta))
			try {
				Files.createFile( fichero2Absoluta );
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		
//		M�todos recursivos 
		System.out.println(factorial(15));
		
//		Recorrer directorios
//		====================
	}
	
	public static long factorial(long numero){
//		4! = 4*3*2*1
		if(numero == 1)
			return 1; 
		else 
			return factorial(numero-1) * numero; 
	}
}//fin class consola.App
