package servlets;


import service.CarsService;
import service.RepairOrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/repair-list")
public class RepairListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("orders", RepairOrderService.INSTANCE.getOrders());
        req.getRequestDispatcher("/repair-list.jsp").forward(req, resp);

    }
}


