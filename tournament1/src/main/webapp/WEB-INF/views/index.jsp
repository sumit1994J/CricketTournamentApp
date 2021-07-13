<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
   <div class="container mt-3">
     <h1 class="text-center"> Crick4u</h1>
       <div class="row">
         
         
         <div class="col-md-6">
            
            <a href="${pageContext.request.contextPath }/teamHome" class="btn btn-primary btn-lg btn-block mt-3" role="button" aria-pressed="true">Team</a>
            <a href="${pageContext.request.contextPath }/playersHome" class="btn btn-primary btn-lg btn-block mt-3" role="button" aria-pressed="true">Players</a>
            <a href="${pageContext.request.contextPath }/rslt" class="btn btn-primary btn-lg btn-block mt-3" role="button" aria-pressed="true">Results</a>
        </div>
        
         
         
         <div class="col-md-6">
           
           <a href="${pageContext.request.contextPath }/CountriesHome" class="btn btn-primary btn-lg btn-block mt-3" role="button" aria-pressed="true">Countries</a>
           <a href="${pageContext.request.contextPath }/venue" class="btn btn-primary btn-lg btn-block mt-3" role="button" aria-pressed="true">Venue</a>
        </div>
      
      
      
      </div>
   
   </div>
  </body>
</html>
