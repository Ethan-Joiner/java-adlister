import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/order-summary")
public class OrderSummaryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");

        String product = request.getParameter("productName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        response.getWriter().println("<h3>" + product + " " + quantity + "</h3>");
    }
}
