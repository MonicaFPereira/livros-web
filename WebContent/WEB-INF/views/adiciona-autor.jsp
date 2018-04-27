<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Incluir Autor</title>
<link rel="icon" href="favicon.ico" type="image/x-icon">
<link rel="stylesheet" type="text/css" href="../css/padrao.css">
<link rel="stylesheet" type="text/css" href="../css/index.css">

</head>
<body>
	<header>
		<div class="container">
			<h2 class="titulo">Incluir Autor</h2>
		</div>
	</header>
	<main>

	<section class="container" >
		<h2 id="titulo-form">Adicionar novo autor</h2>
		<form action="adicionarAutor" method="post">
			<div class="grupo">
				<label for="autor">Autor:</label> <input id="nome" name="nome"
					type="text" placeholder="digite o nome do autor" class="campo">
			</div>
			<div class="editora">
				<label for="editora">Editora:</label> <input id="editora"
					name="editora" type="text" placeholder="digite o nome da editora"
					class="campo campo-medio">
			</div>

			<input type="submit" id="adicionar-livro" class="botao bto-principal" value="Adicionar" />
		</form>
	</main>
	</section>

	<script src="../js/principal.js"></script>

</body>
</html>
