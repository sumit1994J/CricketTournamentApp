<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
    <div class="container mt-3">
       <div class="row">
          <div class="col-md-12">
             <h1 class="text-center  mb-3"> Team Profile</h1>
               <table class="table">
                  <thead>
                   <tr>
                     <th scope="col">no</th>
                     <th scope="col">team name</th>
                     <th scope="col">team country</th>
                     <th scope="col">Action</th>
                  </tr>
                 </thead>
              <tbody>
             <c:forEach items="${allTeam}" var="n">
             <tr>
            <th scope="row">${n.id}</th>
            <td>${n.teamName }</td>
            <td>${n.teamCountry }</td>
             <td>
             <a href="teamHome/delete/${n.id}"><i class="fas fa-trash-alt"></i></a>
            
            </td>
             </tr>
           </c:forEach>
            </table>
    
    <div class="container text-center">
       <a  href="${pageContext.request.contextPath }/addTeam" class="btn btn-outline-success">add Team</a>
       <a  href="${pageContext.request.contextPath }/" class="btn btn-outline-warning">back</a>
    </div>
          
          </div>
       </div>
  </div>
  </body>
</html>
