  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
      <html>
      <body>

          <a href="novaTarefa">Criar nova tarefa</a> 

          <br /> <br />                

          <table>
              <tr>
                  <th>Id</th>
                  <th>Título</th>
                  <th>Editora</th>
                  <th>Edição</th>
                  <th>Ano Publição</th>
              </tr>
              <c:forEach items="${livros}" var="tarefa">
                  <tr>
                      <td>${livro.id}</td>
                      <td>${livro.titulo}</td>
                      <td>${livro.editora}</td>
                      <td>${livro.edicao}</td>
                      <td>${livro.anoPublicao}</td>
                  </tr>
              </c:forEach>
          </table>
      </body>
      </html>