<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
    <div class="container mt-3">
     <div class="row">
       <div class="col-md-6 offset-md-3">
         <h1 class="text-center mb-3">Add Teams  information</h1>
              
             <form action="handle-teams" method="post" >   
               <div class="form-group">
                 
                  <div class="col-md-6 offset-mb-2">
                   <label for="name">add team name </label> 
                    <input type="text" class="form-control" id="name" aria-describedby="eamilhelp"
                    name="teamName" placeholder="Enter the team name">
                  </div>
                  
                  <div class="col-md-6 offset-mb-2 mt-3">
                  <label for="name">add team country</label> 
                     <input type="text" class="form-control" id="name" aria-describedby="eamilhelp"
                     name="teamCountry" placeholder="Enter team country">
                  </div>
                  
                 </div>
                
                
         
                <div class="container text-center">
                    <a href="${pageContext.request.contextPath }/playersHome"
                    class="btn btn-outline-danger">Back</a>
                
                  <button type="submit" class="btn btn-primary">Add</button>
                </div>
            </form>
        </div>
     </div>
  </div>
    
</body>
</html>