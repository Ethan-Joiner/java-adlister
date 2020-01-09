import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class AdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    Ads adDao = DaoFactory.getAdsDao();
    List<Ad> ads = adDao.all();
    request.setAttribute("ads", ads);
    request.getRequestDispatcher("ads/index.jsp").forward(request, response);
    }
}
