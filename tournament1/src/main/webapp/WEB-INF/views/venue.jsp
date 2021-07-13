<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
   <div class="container mt-3">
       <div class="row">
          <div class="col-md-12">
          
            <c:if test="${page=='venue' }">
              <h1 class="text-center">view venue</h1>
               
               <table class="table">
                  <thead>
                   <tr>
                     <th scope="col">no</th>
                     <th scope="col">venue</th>
                    
                     <th scope="col">Action</th>
                  </tr>
                 </thead>
              <tbody>
             <c:forEach items="${allVenue}" var="c">
             <tr>
            <th scope="row">${c.id}</th>
            <td>${c.addVenue}</td>
            
             <td>
             <a href="venue/delete/${c.id}"><i class="fas fa-trash-alt"></i></a>
            
            </td>
             </tr>
           </c:forEach>
            </table>
              <div class="container text-center">
                    <a href="${pageContext.request.contextPath }/"
                    class="btn btn-outline-danger">Back</a>
                
                   <a href="${pageContext.request.contextPath }/addvenue"
                    class="btn btn-outline-danger">add</a>
              </c:if>

            <c:if test="${page=='addvenue' }">
              <h1>Add Venue</h1>
                  
                <form action="handle-venue" method="post" >   
               <div class="form-group">
                 
                  <div class="col-md-6 offset-mb-2">
                   <label for="name">add venue</label> 
                    <input type="text" class="form-control" id="name" aria-describedby="eamilhelp"
                    name="addVenue" placeholder="Enter the location">
                  </div>
                  
                  
                  
                 </div>
                  <div class="container text-center">
                    <button type="submit" class="btn btn-primary">Add</button>
                </div>
               </form>
              
              </c:if>
              
          </div>
       </div>
  </div>
  </body>
</html>
