package fr.imie.contact.servlets;

import fr.imie.contact.entities.Person;
import fr.imie.contact.repositories.PersonRepository;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;

@WebServlet("/person/*")
public class PersonServlet extends HttpServlet {

    @Inject
    private PersonRepository repository;

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        repository.save(new Person());

        List<Person> persons = repository.findAll();
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("WEB-INF/views/person.jsp").forward(request, response);
    }

}