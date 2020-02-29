package servlets;


import model.Car;
import model.CarBrand;
import service.CarsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/car-add")
public class CarAddServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("brands", CarBrand.values());
        req.getRequestDispatcher("/car-form.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Car car = loadFromCarParameter(req);
        CarsService.INSTANCE.addCar(car);
        resp.sendRedirect("/car-list");
    }

    private Car loadFromCarParameter(HttpServletRequest req) {
        Car car = new Car.CarBuildier()
                .setCarBrand(CarBrand.valueOf(req.getParameter("brand")))
                .setLicensePlate(req.getParameter("licenseplate"))
                .setLastName(req.getParameter("lastname"))
                .setYearbook(Integer.parseInt(req.getParameter("yearbook")))
                .setInterval(Long.parseLong(req.getParameter("interval")))
                .createCar();

        return car;
    }
}

