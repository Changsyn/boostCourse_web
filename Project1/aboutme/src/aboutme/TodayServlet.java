package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TodayServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"css/time.css\"></head>");
		out.println("<body><h3><a href=\"http://localhost:8080/aboutme/index.html\">메인화면</a></h3>");
		out.println("<div id=\"time\"><h1>현재시간 : "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"))+ 
				"</h1></div></body>");
	}
}
// 주된 문법 참조를 위해 한빛 아카데미에 "프로젝트로 배우는 자바 웹프로그래밍", "Just JAVA"를 참조하였습니다.
