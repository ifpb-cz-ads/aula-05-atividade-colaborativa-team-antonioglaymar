<%@ page import="java.util.*" %>

<html>
    <body>
        <div class="container">
            <h1>Headers da requisição</h1>
            <ul>
                <%
                    Map<String, String> styles = (Map<String, String>) request.getAttribute("styles");
                    Set<String> keys = styles.keySet();
                    for (String key : keys) {
                        out.print("<li>"+key+":"+styles.get(key)+"</li>");
                    }
                %>
            </ul>
        </div>
    </body>
</html>