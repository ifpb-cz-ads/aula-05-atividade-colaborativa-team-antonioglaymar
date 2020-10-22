<%@ page import="java.util.*" %>

<html>
    <body>
        <div class="container">
            <%
                Integer inputs = (Integer) request.getAttribute("styles");
                String error = (String) request.getAttribute("error");
                Double result = (Double) request.getAttribute("result");
                if (error != null){
                    out.print("<h1>"+error+"</h1>");
                } else if (result != null){
                    out.print("<h1>Resultado: "+result+"</h1>");
                } else {
                    out.print("<form action='Sum' method='GET'>");
                    for (int i = 0; i < inputs; i++){
                        out.print("<input name='values' placeholder='Numero "+(i+1)+"' type='number'/></br>");
                    }
                    out.print("<input type='submit' value='Somar'/>");
                    out.print("</form>");
                }
            %>
        </div>
    </body>
</html>