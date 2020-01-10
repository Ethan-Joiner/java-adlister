import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/addContact")
public class AddContactServlet extends HttpServlet {

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        Contacts contactDao = DaoFactory.getContactsDao();
//        String firstName = request.getParameter("addFirstName");
//        String lastName = request.getParameter("addLastName");
//        String phoneNumber = request.getParameter("addNumber");
//        Contact contact = new Contact(firstName,lastName,phoneNumber);
//        contactDao.saveContact(contact);
//        List<Contact> contacts = contactDao.getContacts();
//        request.setAttribute("contacts", contacts);
//        request.getRequestDispatcher("contacts/contacts-index.jsp").forward(request, response);
//
//    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Contacts contactDao = DaoFactory.getContactsDao();
        String firstName = request.getParameter("addFirstName");
        String lastName = request.getParameter("addLastName");
        String phoneNumber = request.getParameter("addNumber");
        Contact contact = new Contact(firstName,lastName,phoneNumber);
        contactDao.saveContact(contact);
        response.sendRedirect("/contacts");
    }
}
