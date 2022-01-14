
package mx.com.tw.servicio;

import java.util.List;
import mx.com.tw.dao.UsuarioDAO;
import mx.com.tw.domain.Usuario;

public class ServicioUsuario {

    private UsuarioDAO usuarioDao=new UsuarioDAO(); 
    
    
    public List<Usuario> listarUsuario() {
        
        return usuarioDao.listar();
    }

    public void guardarUsuario(Usuario usuario) {
        if (usuario != null && usuario.getIdUsuario() == null) {
            usuarioDao.insertar(usuario);
        } else {
            usuarioDao.actualizar(usuario);
        }
    }

    public void eliminarLibro(Usuario usuario) {
        usuarioDao.eliminar(usuario);
    }

    public Usuario encontrarPorId(Usuario usuario) {
        return usuarioDao.buscarPorId(usuario);
    }
}


