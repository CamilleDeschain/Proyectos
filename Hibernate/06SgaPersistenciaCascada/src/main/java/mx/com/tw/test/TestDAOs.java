package mx.com.tw.test;

import java.util.List;
import mx.com.tw.dao.ContactoDAO;
import mx.com.tw.dao.DomicilioDAO;
import mx.com.tw.dao.LibroDAO;
import mx.com.tw.dao.MembresiaDAO;
import mx.com.tw.dao.UsuarioDAO;

public class TestDAOs {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        System.out.println("Usuarios:");
        imprimir(usuarioDao.listar());

        DomicilioDAO domDao = new DomicilioDAO();
        System.out.println("Domicilio:");
        imprimir(domDao.listar());

        ContactoDAO conDAO = new ContactoDAO();
        System.out.println("Contacto:");
        imprimir(conDAO.listar());

        LibroDAO libDAO = new LibroDAO();
        System.out.println("Libro:");
        imprimir(libDAO.listar());

        MembresiaDAO membDao = new MembresiaDAO();
        System.out.println("Membresia:");
        imprimir(membDao.listar());

    }

    private static void imprimir(List coleccion) {
        for (Object o : coleccion) {
            System.out.println("valor=" + o);

        }
    }
}
