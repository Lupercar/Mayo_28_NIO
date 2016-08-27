package consola;

import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) {
//		La librería NIO (New Input Output) se añadió en Java7.
//		Utiliza un patrón Builder.
//		La clase principal es Path, para hacer operaciones 
//		tendremos la clase Files con métodos estáticos que 
//		operarán sobre los Path.
//		Crea objetos inmutables.
		Path carpetaTemp = Paths.get("c:/Temp"); 
		Path fichero1 = Paths.get("c:/Temp/fichero1.txt"); 
		Path fichero2 = Paths.get("fichero2.txt"); 
		
//		Me devuelve un Path quitando la parte común
		System.out.println( carpetaTemp.relativize(fichero1) ); 
		
//		Devuelve un nuevo Path con la concatenación de las dos rutas
		System.out.println( carpetaTemp.resolve(fichero2) ); 
		
	}
}//fin class consola.App
