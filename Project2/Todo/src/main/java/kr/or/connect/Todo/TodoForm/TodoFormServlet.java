package kr.or.connect.Todo.TodoForm;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todoform")
public class TodoFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodoFormServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		RequestDispatcher rd = request.getRequestDispatcher("/jsp/todoForm.jsp");
		rd.forward(request, response);
		
		
	}

}
