package poly.edu.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/poly/home","/poly/edit/*","/poly/abc"}) //Được dùng để ánh xá một hoặc nhiều  URL với một servlet
public class HomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().write("doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().write("doPost");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = arg0.getRequestURI();
		if (uri.contains("home")) {
			arg1.getWriter().write("home");
		}else if(uri.contains("edit")) {
			arg1.getWriter().write("/poly/edit");
		}else if(uri.contains("abc")) {
			arg1.getWriter().write("abc");
		}
	}

}
