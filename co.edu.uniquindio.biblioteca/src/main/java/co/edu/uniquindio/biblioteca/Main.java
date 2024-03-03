package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Biblioteca;
import co.edu.uniquindio.biblioteca.model.Bibliotecario;
import co.edu.uniquindio.biblioteca.model.Libro;

public class Main {
    public static void main(String[] args) {
        inicializarDatos();
    }

    private static void inicializarDatos() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre("paulo coelho");

        Bibliotecario bibliotecario1 = new Bibliotecario();
        bibliotecario1.setNombre("Sebastian Torres");
        bibliotecario1.setiD("1234");
        biblioteca.getListaEmpleados().add(bibliotecario1);

        Libro libro1 = new Libro();
        libro1.setTitulo("100 años de amargura");
        libro1.setAutor("Sebas Torres");
        libro1.setEstado("Disponible");
        libro1.setISBM("12345");
        biblioteca.getListaLibros().add(libro1);

        Libro libro2 = new Libro();
        libro2.setTitulo("el viejo y el mar");
        libro2.setAutor("hugo");
        libro2.setEstado("Disponible");
        libro2.setISBM("123");
        biblioteca.getListaLibros().add(libro2);


    }
}