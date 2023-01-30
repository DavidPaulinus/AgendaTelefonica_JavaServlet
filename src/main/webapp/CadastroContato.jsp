<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Contato</title>
</head>
<body>
	
	<form action ="/AgendaTelefonica_JavaServlet/entrada?acao=CadastraContato" method = "post">
		Nome:     <input type ="text" name = "nome">
		Número:   <input type ="text" name = "numero">
		Tipo:     <select required name = "tipo">
						<option>Celular</option>
						<option>Residencial</option>
						<option>Trabalho</option>
						
					</select>
		E-mail:   <input type ="text" name = "email">
		Favorito: <select required name = "favorito">
						<option >Favorito</option>
						<option></option>
						
					</select>
		
		<input type = "submit" value = "Salvar"> 
	
	</form>
	
</body>
</html>