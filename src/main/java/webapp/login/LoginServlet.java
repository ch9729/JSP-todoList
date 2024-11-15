package webapp.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//localhost:8080 뒤의 url 주소
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("name", req.getParameter("name"));	//name으로 넘어오는 파라미터를 key name으로 넘긴다.
		req.setAttribute("password", req.getParameter("password"));
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("name", req.getParameter("name"));
		req.setAttribute("password", req.getParameter("password"));
		req.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(req, resp);
	}
	
	
	
}
