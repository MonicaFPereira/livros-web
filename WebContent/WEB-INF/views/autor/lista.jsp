  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
      <html>
      <body>

          <a href="novaTarefa">Criar novo autor</a> 

          <br /> <br />                

          <table>
              <tr>
                  <th>Id</th>
                  <th>Nome</th>
              </tr>
              <c:forEach items="${autores}" var="tarefa">
                  <tr>
                      <td>${autor.id}</td>
                      <td>${autor.titulo}</td>
                  </tr>
              </c:forEach>
          </table>
      </body>
      </html>