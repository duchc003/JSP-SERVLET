package fpoly.edu.vn;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculaterServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/view/index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(request.getParameter("numberA"));
		double b = Double.parseDouble(request.getParameter("numberA"));
		String action = request.getParameter("action");
		double rs = a + b;
		switch (action) {
		case "+": {
			rs = a + b;
			break;
		}
		case "-": {
			rs = a - b;
			break;
		}
		case "*": {
			rs = a * b;
			break;
		}
		case "/": {
			rs = a / b;
			break;
		}
		}

		request.setAttribute("RESULT", rs);
		RequestDispatcher rd = request.getRequestDispatcher("/view/result.jsp");
		rd.forward(request, response);
	}
}
