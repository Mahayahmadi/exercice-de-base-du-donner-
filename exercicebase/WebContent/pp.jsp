<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Page</title>
</head>
<body>
    <h1>Informations</h1>
   
        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Adresse</th>
            <th>Téléphone</th>
        </tr>
 <h3>la liste est <%= request.getAttribute("InformationDAO") %></h3>

 
</body>
</html>
