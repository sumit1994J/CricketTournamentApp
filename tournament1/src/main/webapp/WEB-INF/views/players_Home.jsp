<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
    <div class="container mt-3">
       <div class="row">
          <div class="col-md-12">
             <h1 class="text-center  mb-3"> Players Profile</h1>
               <table class="table">
                  <thead>
                   <tr>
                     <th scope="col">no</th>
                     <th scope="col">Player Names</th>
                     <th scope="col">Player Type</th>
                     <th scope="col">Action</th>
                  </tr>
                 </thead>
              <tbody>
             <c:forEach items="${players}" var="p">
             <tr>
            <th scope="row">${p.pid}</th>
            <td>${p.playername }</td>
            <td>${p.playerType }</td>
             <td>
             <a href="playersHome/delete/${p.pid}"><i class="fas fa-trash-alt"></i></a>
            
            </td>
             </tr>
           </c:forEach>
            </table>
    
    <div class="container text-center">
       <a  href="${pageContext.request.contextPath }/addplayer" class="btn btn-outline-success">add player</a>
       <a  href="${pageContext.request.contextPath }/" class="btn btn-outline-success">back</a>
    </div>
    
          
          </div>
       </div>
  </div>
  </body>
</html>
