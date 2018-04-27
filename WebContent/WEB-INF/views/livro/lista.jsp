  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
      <html>
      <body>

          <a href="novaTarefa">Criar nova tarefa</a> 

          <br /> <br />                

          <table>
              <tr>
                  <th>Id</th>
                  <th>T�tulo</th>
                  <th>Editora</th>
                  <th>Edi��o</th>
                  <th>Ano Publi��o</th>
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