<html>
    <body>
        <h3>Questao 1</h3>
        <form action="Headers" method="POST">
            <input type="submit" value="Headers"/>
        </form>
        <hr/>
        <h3>Questao 2</h3>
        <form action="Sum" method="POST">
            <input type="number" name="number" placeholder="Informe um numero"/>
            <input type="submit" value="Enviar"/>
        </form>
        <hr/>
        <h3>Questao 3</h3>
        <form action="NumandStrin" method="GET">
            <input type="text" name="text" placeholder="eu advinho se eh texto ou n">
            <input type="submit" value="Enviar">
        </form>
        <hr>
        <h3>Questao 4</h3>
        
        <form action="PostAndGet" method="POST">
            <input type="number" name="brabo1">
            <input type="number" name="brabo2">
            <input type="submit" value="doPost">
            
        </form>
        <br/>
        <form action="PostAndGet" method="GET">
            <input type="number" name="brabo1">
            <input type="number" name="brabo2">
            <input type="submit" value="doGet">
            
        </form>
        
    </body>
</html>
