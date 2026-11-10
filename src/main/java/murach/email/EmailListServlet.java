package murach.email;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import murach.business.User;
import murach.business.Survey;

public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join"; // default action
        }

        if (action.equals("join")) {
            url = "/index.html";
        } else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter(("lastName"));
            String email = request.getParameter("email");
            String dob = request.getParameter("dob");
            String referralSource = request.getParameter("referral_source");
            String announcements = request.getParameter("announcements");
            boolean wantAnnouncements = "yes".equals(announcements);
            String offer = request.getParameter("offer");
            boolean wantOffer = "yes".equals(offer);
            String contactVia = request.getParameter("contactVia");

            User user = new User(firstName, lastName, email, dob);
            Survey survey = new Survey(referralSource, wantAnnouncements, wantOffer, contactVia);

            request.setAttribute("user", user);
            request.setAttribute("survey", survey); // lưu vào body của request
            url = "/thanks.jsp";
        }

        getServletContext()
                .getRequestDispatcher(url) // sử dụng cái này để dữ liệu của request vẫn tồn tại
                .forward(request, response);
        // Nếu dùng response.sendRedirect(url) sẽ kết thúc request
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
