import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/order-form")
public class OrderFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        response.setContentType("text/html");
        response.getWriter().println("<form method=\"POST\" action=\"/order-summary.jsp\">\n" +
                "    <label for=\"productName\">Product Name</label>\n" +
                "    <input id=\"productName\" name=\"productName\" type=\"text\">\n" +
                "    <br>\n" +
                "\n" +
                "    <label for=\"quantity\">Quantity</label>\n" +
                "    <input id=\"quantity\" name=\"quantity\" type=\"quantity\">\n" +
                "\n" +
                "    <button type=\"submit\">Submit</button>\n" +
                "    </form>");
    }
}
