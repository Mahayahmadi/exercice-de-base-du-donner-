<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.sql.Connection"%>
<%@ page import=" java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%


String  nom=request.getParameter("t2");

String email =request.getParameter("t3");
Connection conn = null;

try{

 Class.forName("com.mysql.jdbc.Driver");
   
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","");
       PreparedStatement pst = con.prepareStatement("insert into maha(nom,email)values(?,?) ");
       
       pst.setString(1, nom);
       pst.setString(2, email);
       
       int x =pst.executeUpdate();
       if(x>0){
     
      out.println("<b>Client est deja existe </b>");
       }else{
     
      out.println("<b>Client ne pas Existe</b>");
       }
       
   
       
}
catch(Exception e){
out.println(e);
}



%>




</body>
</html>