
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%! 
     double rupeesToUSD(int rs){
         return rs* 0.013;
     }
    %>
    
    <%
           String rs= (String)pageContext.getAttribute("rupees",PageContext.SESSION_SCOPE);
           System.out.println(rs);
           int rupees = Integer.parseInt(rs);
    %>
    
    <h3><%= rupees%> rs = <%= rupeesToUSD(rupees)%> USD</h3> 

</body>
</html>