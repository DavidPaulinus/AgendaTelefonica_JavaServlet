<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Contatos</title>
</head>
<body>
	<h1>Contatos: </h1>
		<ol>
			<c:forEach items = "${lista }" var = "list">
				<p>
				Nome:  ${list.nome }
				Número: ${list.numero }
				Tipo:   ${list.tipo }
				E-mail: ${list.email }
				${list.favorito }
				</p>
				
				<p><a href="/AgendaTelefonica_JavaServlet/entrada?acao=EditaContato&id=${list.id }"> Editar</a>
					<a href="/AgendaTelefonica_JavaServlet/entrada?acao=DeletaContato&id=${list.id }"> Excluir</a>
				</p>
				
				
			</c:forEach>
		</ol>
		<a href = "/AgendaTelefonica_JavaServlet/cadastro">Novo Contato</a>
</body>
</html>