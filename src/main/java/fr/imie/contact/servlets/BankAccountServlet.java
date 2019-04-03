package fr.imie.contact.servlets;

import fr.imie.contact.entities.BankAccount;
import fr.imie.contact.repositories.BankAccountRepositoryMock;
import fr.imie.contact.repositories.BankAccountRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


    @WebServlet("/bankaccount/*")
    public class BankAccountServlet extends HttpServlet {

        private BankAccountRepository repository = new BankAccountRepositoryMock();

        protected void service(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            List<BankAccount> bankaccounts = repository.findAll();
            request.setAttribute("bankaccount", bankaccounts);
            request.getRequestDispatcher("WEB-INF/views/bankaccount.jsp").forward(request, response);
        }
    }
