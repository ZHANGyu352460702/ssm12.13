<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

   <table border="1">
      <tr>
        <th>商品编号</th>
        <th>商品名称</th>
      </tr>
      <c:forEach items="${products}" var="p">
         <tr>
           <td>${p.productID }</td>
		   <td>${p.productName}</td>
         </tr>
      </c:forEach>
   </table>
</body>
 <script type="text/javascript" src=""></script>
 <script type="text/javascript">
     $.ajax({
    	url : "ssm/product/test14.html",
    	type : "post",
    	success : function(data){
    		data=$.parseJSON(data);
    	}
     }); 
 </script>
 
</html>