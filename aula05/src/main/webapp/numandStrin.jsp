<%@ page import="java.util.*" %>

<html>
    <body>
        <div class="container">
            <h1>Eh caractere ou nao eh ?</h1>
                <% 
                String value = (String) request.getAttribute("styles");
                out.print("O valor eh: "+value);
                %>
            <form>
        </div>
    </body>
</html>