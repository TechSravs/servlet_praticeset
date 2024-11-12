<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%! 
     double rupeesToBitcoin(int rs){
         return rs*0.00000026871799;
     }
   double rupeesToDoge(int rs){
       return rs*0.074;
      } 
    %> 
    
    <%
           String rs= request.getParameter("rs");
           pageContext.setAttribute("rupees", rs, PageContext.SESSION_SCOPE);
           int rupees = Integer.parseInt(rs);
    %>
    
    
    <h3><%= rupees%> rs = <%= rupeesToBitcoin(rupees)%> BTC</h3>
    <h3><%= rupees%> rs = <%= rupeesToDoge(rupees)%> DOGE</h3>


    <form action="usdconvert.jsp">
      <input type = "submit" value = "USD">
    
    </form>           
</body>
</html>