package fr.imie.contact.servlets;

import fr.imie.contact.entities.DateUtils;
import fr.imie.contact.entities.Person;
import fr.imie.contact.repositories.PersonRepository;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@WebServlet("/person/*")
public class PersonServlet extends HttpServlet {

    @Inject
    private PersonRepository repository;

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getMethod().equalsIgnoreCase("post")){
            Person person = new Person();
            person.setFirstName(request.getParameter("firstName"));
            person.setLastName(request.getParameter("lastName"));
            person.setEmail(request.getParameter("email"));

            String text = request.getParameter("birthDate");
            LocalDate date = DateUtils.toLocalDate(text);
            person.setBirthDate(date);

            repository.save(person);
        }

        List<Person> persons = repository.findAll();
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("/WEB-INF/views/person.jsp").forward(request, response);
    }

}