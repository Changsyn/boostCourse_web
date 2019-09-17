package kr.or.connect.Todo.TodoType;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.TodoDao.TodoDao;
import kr.or.connect.TodoDto.TodoDto;

@WebServlet("/todotype")
public class TodoTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public TodoTypeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		Long id = Long.parseLong(request.getParameter("id"));
		String type = request.getParameter("type");
		
		TodoDao dao = new TodoDao();
		TodoDto dto = new TodoDto();
		
		dto.setId(id);
		dto.setType(type);
		dao.updateTodo(dto);
	}

}
