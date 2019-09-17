package kr.or.connect.Todo.TodoAdd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.or.connect.TodoDao.TodoDao;
import kr.or.connect.TodoDto.TodoDto;


@WebServlet("/todoadd")
public class TodoAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodoAddServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		String title = (String)request.getParameter("title");
		String name = (String)request.getParameter("name");
		int seq = Integer.parseInt(request.getParameter("sequence"));
		
		TodoDto todo = new TodoDto();
		TodoDao dao = new TodoDao();
		
		todo.setTitle(title);
		todo.setName(name);
		todo.setSequence(seq);
		dao.addTodo(todo);

		response.sendRedirect("main");
	}

}
