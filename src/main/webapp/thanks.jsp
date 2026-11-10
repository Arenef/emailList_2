<%-- Created by IntelliJ IDEA. User: baokh Date: 11/10/2026 Time: 10:27 AM To change this template use File | Settings |
    File Templates. --%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>

        <head>
            <meta charset="utf-8">
            <title>Murach's Java Servlets and JSP</title>
            <link rel="stylesheet" href="styles/main.css" type="text/css">
        </head>

        <body>
            <h1>Thanks for joining our email list</h1>
            <p>Here is the information that you need entered: </p>
            <label> Email: </label>
            <span> ${user.email}</span><br>
            <label> First Name: </label>
            <span> ${user.firstName} </span><br>
            <label> Last Name: </label>
            <span> ${user.lastName}</span><br>
            <label> Date of Birth: </label>
            <span> ${user.dob} </span><br>
            <label>Heard From:</label>
            <span> ${survey.referralSource}</span><br>
            <label> Announcements:</label>
            <span> ${survey.announcements ? "Yes" : "No"}</span><br>
            <label> Offer: </label>
            <span> ${survey.offer ? "Yes" : "No"}</span><br>
            <label> Contact Via: </label>
            <span>${survey.contactVia}</span><br>
            <p> To enter another email address, click on the Back button in your browser or the Return button shown
                below</p>
            <form action="" method="get">
                <input type="hidden" name="action" value="join">
                <input type="submit" value="Return">
            </form>
        </body>

        </html>