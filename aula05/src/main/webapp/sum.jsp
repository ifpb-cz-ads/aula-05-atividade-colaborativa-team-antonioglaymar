<%@ page import="java.util.*" %>

<html>
    <body>
        <div class="container">
            <form>
                <%
                    Integer inputs = (Integer) request.getAttribute("styles");
                    String error = (String) request.getAttribute("error");
                    if (error != null){
                        out.print(error);
                    } else {
                        for (int i = 0; i < inputs; i++){
                            out.print("<input name='values' placeholder='Numero "+(i+1)+"' type='number'/></br>");
                        }
                        out.print("<input type='submit' value='Somar'/>");
                        
                    }
                %>
            </form>
        </div>
    </body>
</html>