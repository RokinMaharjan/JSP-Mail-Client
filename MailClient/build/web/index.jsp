<%@include file="Shared/header.jsp"%>

<h1>Students</h1>
<a href="action/add.jsp" class="btn btn-success pull-right">
    <span class="glyphicon glyphicon-plus"></span></a>

    
    
<table class="table table-bordered table-hover">
    <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Faculty</th>
        <th>Email</th>
        <th>Action</th>
    </tr>

    <%
        StudentDAO studentDAOImpl = new StudentDAOImpl();
        for (Student s : studentDAOImpl.getAll()) {
    %>
    <tr>
        <td><%=s.getId()%></td>
        <td><%=s.getFirstName()%></td>
        <td><%=s.getLastName()%></td>
        <td><%=s.getFaculty()%></td>
        <td><%=s.getEmail()%></td>
        <td></td>
    </tr>
    <%
        }
    %>
</table>
    
<%@include file="Shared/footer.jsp" %>
