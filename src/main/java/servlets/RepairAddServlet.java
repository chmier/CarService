package servlets;


import model.RepairOrder;
import service.RepairOrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/repair-add")
public class RepairAddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/repair-form.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RepairOrder repairOrder = extractRepairOrderFromParameters(req);
        RepairOrderService.INSTANCE.addOrder(repairOrder);
        resp.sendRedirect("/repair-list");

    }

    private RepairOrder extractRepairOrderFromParameters(HttpServletRequest req) {
        RepairOrder repairOrder = new RepairOrder.RepairBuldier()
                        .setDescription(req.getParameter("description"))
                        .setUrgence(req.getParameter("urgance") != null ? req.getParameter("urgance").equals("on") : false)
                        .createRepair();

        return repairOrder;
    }

}
