<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
   <div class="container mt-3">
       <div class="row">
          <div class="col-md-12">
          
           <c:if test="${page=='result' }">
              <h1 class="text-center">Results</h1>
               
               <table class="table">
                  <thead>
                   <tr>
                     <th scope="col">no</th>
                     <th scope="col">results</th>
                    
                     <th scope="col">Action</th>
                  </tr>
                 </thead>
              <tbody>
             <c:forEach items="${allResult}" var="r">
             <tr>
            <th scope="row">${r.id}</th>
            <td>${r.result}</td>
            
             <td>
             <a href="rslt/delete/${r.id}"><i class="fas fa-trash-alt"></i></a>
            
            </td>
             </tr>
           </c:forEach>
            </table>
              <div class="container text-center">
                    <a href="${pageContext.request.contextPath }/"
                    class="btn btn-outline-danger">Back</a>
                
                   <a href="${pageContext.request.contextPath }/addresult"
                    class="btn btn-outline-danger">add</a>
              </c:if>
              
              <c:if test="${page=='addresult' }">
              <h1 class="text-offset-mb-2 mt-3">Add Result</h1>
                  
                <form action="handle-result" method="post" >   
               <div class="form-group">
                 
                  <div class="col-md-6 offset-mb-2  mt-3">
                    
                    <input type="text" class="form-control" id="name" aria-describedby="eamilhelp"
                    name="Result" placeholder="Enter the Result">
                  </div>
                  
                 
                  
                  
                 </div>
                  <div class="container  mt-3">
                    <button type="submit" class="btn btn-primary">Add</button>
                </div>
               </form>
              
              </c:if>
              
          </div>
       </div>
  </div>
  </body>
</html>
