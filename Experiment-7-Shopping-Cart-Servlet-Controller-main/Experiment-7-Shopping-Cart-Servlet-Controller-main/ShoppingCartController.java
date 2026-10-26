import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShoppingCartController")
public class ShoppingCartController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action == null || action.trim().isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Action parameter missing");
            return;
        }

        switch (action) {
            case "register":
                handleRegistration(request, response);
                break;
            case "login":
                handleLogin(request, response);
                break;
            case "addToCart":
                handleAddToCart(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
        }
    }

    private void handleRegistration(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, "Registration is not implemented");
    }

    private void handleLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, "Login is not implemented");
    }

    private void handleAddToCart(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, "Adding products to the cart is not implemented");
    }
}
