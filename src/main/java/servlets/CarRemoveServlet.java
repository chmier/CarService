package servlets;

import service.CarsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/car-remove")
public class CarRemoveServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            // pobieram od użytkownika parametr (indeks)
           Long idNumber = Long.parseLong(req.getParameter("idNumber"));

            // usuwam studenta z listy
            CarsService.INSTANCE.removeCar(idNumber);

            // przekierowuje użytkownika na stronę z listą studentów
            resp.sendRedirect("/car-list");
        }
    }


