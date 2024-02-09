
package Controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.Patient_Data;
import Dataaccess.Access_data;

@WebServlet("/patientForm")
public class Mainclass extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);

		String Pname = req.getParameter("patientName");
		int age = Integer.parseInt(req.getParameter("patientAge"));
		String DOb = req.getParameter("DOB");
		String Gender = req.getParameter("patientGender");
		long Phno = Long.parseLong(req.getParameter("Contact_number"));
		String MailId = req.getParameter("Email_address");
		String Password = req.getParameter("Password");
		String CPassword = req.getParameter("ConformPassword");

		Patient_Data Access = new Patient_Data();
		Access.setAge(age);
		Access.setDob(DOb);
		Access.setGender(Gender);
		Access.setMail_id(MailId);
		Access.setPhno(Phno);
		Access.setPname(Pname);
		if (Password.equals(CPassword)) {
			Access.setPassword(Password);

			Access_data Ad = new Access_data();
			Ad.Insert(Access);
		} else {
			resp.getWriter()
					.print("* Entered the wrong Password please make sure that password and Conformpassword are same");
		}

	}
}
