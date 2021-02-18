<%-- 
    Document   : JSPtriangulo
    Created on : 17 feb 2021, 20:10:24
    Author     : mitzi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="FiguraTriangulo.Trinagulo" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <%
          String base=request.getParameter("valor1");
          String altura=request.getParameter("valor2");
          
          Trinagulo figura = new Trinagulo();
          figura.areaTri(base, altura);
          figura.perimetroTri(base);
          
          int area=figura.getResultadoArea();
          int perimetro=figura.getResultadoPerimetro();
        %>
        <span>Resultado del Área es: <%=area%></span>
        <span>Resultado del Perímetro es: <%=perimetro%></span>
    </body>
</html>
