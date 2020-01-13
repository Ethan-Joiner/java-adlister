import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        session.setAttribute("theName", "The Value");

//        set interval
        session.setMaxInactiveInterval(5);
        int duration = session.getMaxInactiveInterval();
        session.setAttribute("timeout", duration);
//        Create cart
        Cart cart = new Cart();
        cart.setNumItems(7);
        request.setAttribute("cart", cart);

//        set a context attribute
        ServletContext context = getServletContext();
        context.setAttribute("conAt", "Context Attribute");
        request.getRequestDispatcher("/session.jsp").forward(request, response);
    }
}
