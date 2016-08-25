<%@include file="../Shared/header.jsp" %>
    
<%
    if(request.getMethod().equalsIgnoreCase("POST"))
    {
        StudentDAO studentDAOImpl = new StudentDAOImpl();
        Student student = new Student();
        student.setFirstName(request.getParameter("student_firstName"));
        student.setLastName(request.getParameter("student_lastName"));
        student.setFaculty(request.getParameter("student_faculty"));
        student.setEmail(request.getParameter("student_email"));
        
        studentDAOImpl.insertStudent(student);
        response.sendRedirect("../index.jsp?success");
    }
    else
    {
        response.sendRedirect("../index.jsp?error");
    }
%>

<%@include file="../Shared/footer.jsp" %>