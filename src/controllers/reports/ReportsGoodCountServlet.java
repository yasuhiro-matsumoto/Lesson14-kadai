package controllers.reports;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Report;

/**
 * Servlet implementation class ReportsGoodCountServlet
 */
@WebServlet("/ReportsGoodCountServlet")
public class ReportsGoodCountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportsGoodCountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        ServletContext sc = this.getServletContext();
        Report r = (Report) sc.getAttribute("report.good_count");


        if(r == null) {
            r = new Report();
            sc.setAttribute("report.good_count", r);
        }


            request.setCharacterEncoding("UTF-8");
            String good_count= request.getParameter("action");



        if (good_count != null) {


            Report Report  = new Report();
            Report.goodPlus(r);


            sc.setAttribute("good_count", r);
        }}}


