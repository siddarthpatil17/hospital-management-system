package Controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.Patient_Data;
import Dataaccess.Access_data;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		long userIdParam = Long.parseLong(req.getParameter("username"));
		String Pass = req.getParameter("password");

		Access_data acc = new Access_data();
		Patient_Data pd = acc.logincrdentieal(userIdParam);

		if (pd != null) {
			if (Pass.equals(pd.getPassword()) && userIdParam == pd.getId()) {
				resp.getWriter().print("Logged In Successfully");
			} else {
				resp.getWriter().print("Invalid Password");
			}
		} else {
			resp.getWriter().print("User Not Found By The  MRN (Medical Record Number)");
		}
	}
}
