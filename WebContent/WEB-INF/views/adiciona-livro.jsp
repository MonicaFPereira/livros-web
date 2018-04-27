<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Incluir Livros</title>
<link rel="icon" href="favicon.ico" type="image/x-icon">
<link rel="stylesheet" type="text/css" href="../css/padrao.css">
<link rel="stylesheet" type="text/css" href="../css/index.css">

</head>
<body>
	<header>
		<div class="container">
			<h2 class="titulo">Incluir Livros</h2>
		</div>
	</header>
	<main>

	<section class="container" >
		<h2 id="titulo-form">Adicionar novo livro</h2>
		<form action="adicionarLivro" method="post">
			<div class="grupo">
				<label for="titulo">Título:</label> <input id="titulo" name="titulo"
					type="text" placeholder="digite o título do livro" class="campo">
			</div>
			<div class="editora">
				<label for="editora">Editora:</label> <input id="editora"
					name="editora" type="text" placeholder="digite o nome da editora"
					class="campo campo-medio">
			</div>
			<div class="Edição">
				<label for="edicao">Edição</label> <input id="edicao"
					name="edicao" type="text" placeholder="digite a edição do livro"
					class="campo campo-medio">
			</div>
			<div class="anoPublicacao">
				<label for="anoPublicacao">Ano de Publicação:</label> <input
					id="anoPublicacao" type="text"
					placeholder="digite o ano de publicacao" class="campo campo-medio">
			</div>

			<input type="submit" id="adicionar-livro" class="botao bto-principal" value="Adicionar" />
		</form>
	</main>
	</section>

	<script src="../js/principal.js"></script>

</body>
</html>
