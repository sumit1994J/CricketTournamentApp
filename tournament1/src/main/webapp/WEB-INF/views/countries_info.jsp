<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
    <div class="container mt-3">
       <div class="row">
          <div class="col-md-12">
             <h1 class="text-center  mb-3"> Countries</h1>
                
               <table class="table">
                  <thead>
                   <tr>
                     <th scope="col">no</th>
                     
                     <th scope="col">countries</th>
                     <th scope="col">Action</th>
                  </tr>
                 </thead>
              <tbody>
             <c:forEach items="${allCountries}" var="c">
             <tr>
            <th scope="row">${c.cid}</th>
            <td>${c.countryName }</td>
            <td>
             <a href="CountriesHome/delete/${c.cid }"><i class="fas fa-trash-alt"></i></a>
            
            </td>
          
    
             </tr>
           </c:forEach>
            </table>
     
          <div class="container text-center">
              <a href="${pageContext.request.contextPath }/addCountries"
                    class="btn btn-outline-danger ">add countries</a>
                <a  href="${pageContext.request.contextPath }/" class="btn btn-outline-warning">back</a>
          </div>
    
          </div>
       </div>
  </div>
  </body>
</html>
