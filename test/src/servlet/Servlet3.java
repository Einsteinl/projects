package servlet;

import org.apache.commons.io.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class Servlet3 extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s=request.getParameter("ideas");
        Part part=request.getPart("files");
        System.out.println("files.getContentType()"+part.getContentType());
        System.out.println("files.getSubmittedFileName"+part.getSubmittedFileName());
        System.out.println(s);
        request.setAttribute("s",s);
        request.getRequestDispatcher("firend.jsp").forward(request,response);




    }



}
