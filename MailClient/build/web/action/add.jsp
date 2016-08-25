<%@include file="../Shared/header.jsp" %>
<h1>Add Student</h1>
<form method="post" action="save.jsp">
    <div class="form-group">
        <label>First Name</label>
        <input type="text" name="student_firstName" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>Last Name</label>
        <input type="text" name="student_lastName" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>Faculty</label>
        <input type="text" name="student_faculty" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>Email</label>
        <input type="text" name="student_email" class="form-control"/>
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>
    
</form>



<%@include file="../Shared/footer.jsp" %>