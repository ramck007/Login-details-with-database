

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginpage
 */
@WebServlet("/loginpage")
public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String lemail=request.getParameter("lemail");
		String lpassword=request.getParameter("lpassword");
		
		MemberData member1= new MemberData(lemail,lpassword);
		
		RegisterDB rdb = new RegisterDB();
		
		if(rdb.check(member1)) {
			response.sendRedirect("welcomepage.html");
		}
		else {
			response.sendRedirect("memberlogin.html");
		}
		
	//	String result1=rdb.check(member1);
		//response.getWriter().print(result1);
	//	doGet(request, response);
	}

}
