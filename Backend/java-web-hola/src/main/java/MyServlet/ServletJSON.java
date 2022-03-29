package MyServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Entity.Persona;


@WebServlet("/ServletJSON")
public class ServletJSON extends HttpServlet {
  private static final long serialVersionUID = 1L;
 protected void doPost(HttpServletRequest rq,HttpServletResponse rs) throws ServletException, IOException {
	 rq.setAttribute("nombre", rq.getParameter("nombre"));
	 rq.setAttribute("apellido", rq.getParameter("apellido"));
	 rq.setAttribute("sexo", rq.getParameter("sexo"));
	 rq.setAttribute("edad", rq.getParameter("edad"));
	 rq.setAttribute("dedicado", rq.getParameter("dedicado"));
	 rq.setAttribute("uno", rq.getParameter("uno"));
	 rq.setAttribute("dos", rq.getParameter("dos"));
	 RequestDispatcher rd;
	 rd=rq.getRequestDispatcher("/Resultado.jsp");
	 rd.forward(rq,rs);
  }
}