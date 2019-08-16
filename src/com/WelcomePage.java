package com;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.http.*;

public class WelcomePage extends javax.servlet.http.HttpServlet {

    private static String firstName;
    private static String lastName;
    private static int age;

    private static AtomicInteger countJava = new AtomicInteger(0);
    private static AtomicInteger countCsharp = new AtomicInteger(0);
    private static AtomicInteger countIdea = new AtomicInteger(0);
    private static AtomicInteger countVS = new AtomicInteger(0);
    private static AtomicInteger countDeveloperYes = new AtomicInteger(0);
    private static AtomicInteger countDeveloperNo = new AtomicInteger(0);

    static final String TEMPLATE = "<html>" +
            "<head><title>Welcome.com</title></head>" +
            "<body><p>%s</p></body></html>";

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException{
        final String answerLanguage = request.getParameter("questionLanguage");
        final String answerIDE = request.getParameter("questionIDE");
        final String answerDeveloper = request.getParameter("questionDeveloper");

        if (answerLanguage.equals("java")) {
            countJava.incrementAndGet();
        } else {
            countCsharp.incrementAndGet();
        }

        if (answerIDE.equals("idea")){
            countIdea.incrementAndGet();
        }else {
            countVS.incrementAndGet();
        }

        if (answerDeveloper.equals("yes")){
            countDeveloperYes.incrementAndGet();
        } else {
            countDeveloperNo.incrementAndGet();
        }

        String result = "<table border  = 1>" +
                "<tr><td>Questions</td><td>Answers<td></tr>"+
                "<tr><td>Java </td><td>" + countJava + "</td></tr>" +
                "<tr><td>C#</td><td>" + countCsharp + "</td></tr>" +
                "<tr><td>Idea </td><td>" + countIdea + "</td></tr>"+
                "<td>Visual Studio</td><td>" + countVS + "</td></tr>" +
                "<tr><td>Developer</td><td>" + "good: " + countDeveloperYes + " Bad: " + countDeveloperNo + "</td></tr>" +
                "</table>";
        response.setContentType("text/html");
        response.getWriter().println(String.format(TEMPLATE , result));
    }
}
