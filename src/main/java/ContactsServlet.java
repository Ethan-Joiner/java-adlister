import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/contacts")
public class ContactsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Contacts contactDao = DaoFactory.getContactsDao();
        List<Contact> contacts = contactDao.getContacts();
        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("/contacts/contacts-index.jsp").forward(request, response);
    }
}
