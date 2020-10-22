<%@ page import="java.util.*" %>

<html>
    <body>
        <div class="container">
            <ul>
                <%
                   Double result = (Double) request.getAttribute("result");
                   out.print("O resultado eh: "+ result);
                %>
            </ul>
        </div>
    </body>
</html>