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
         <h1 class="text-center mb-3">Add players information</h1>
              
             <form action="handle-countries" method="post" >   
               <div class="form-group">
                 
                  <div class="col-md-6 offset-mb-2">
                   <label for="name">add country</label> 
                    <input type="text" class="form-control" id="name" aria-describedby="eamilhelp"
                    name="countryName" placeholder="Enter the country name">
                  </div>
                  
                  
                  
                 </div>
                
                
         
                <div class="container md-3">
                    <a href="${pageContext.request.contextPath }/CountriesHome"
                    class="btn btn-outline-danger">Back</a>
                
                  <button type="submit" class="btn btn-primary">Add</button>
                </div>
            </form>
        </div>
     </div>
  </div>
    
</body>
</html>