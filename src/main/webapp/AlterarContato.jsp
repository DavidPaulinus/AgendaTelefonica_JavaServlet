<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "/AgendaTelefonica_JavaServlet/entrada?acao=AlteraContato" method = "post">
	Nome: <input type="text" name = "nome" value = "${contato.nome }">
	Número: <input type="text" name = "numero" value = "${contato.numero }">
	Tipo: <select required name = "tipo">
			<option>Celular</option>
			<option>Residencial</option>
			<option>Trabalho</option>
						
			</select>
	E-mail: <input type="text" name = "email" value = "${contato.email }">
	Favorito: <select required name = "favorito">
				<option >Favorito</option>
				<option></option>
						
				</select>
	
	<input type="hidden" name="id" value = "${contato.id}">
	<input type="hidden" name="acao" value = "AlteraContato">
	
	<input type = "submit" value = "Salvar">
</form>
</body>
</html>