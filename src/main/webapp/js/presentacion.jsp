<%-- 
    Document   : ResultadoDeCalificaciones
    Created on : 31-oct-2014, 20:16:34
    Author     : ADGM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADGM</title>
        <script>
            $(document).ready(function() {
                $("#guardar-evaluacion").click(function() {
                    $.ajax( {
                        url:'guardar-evaluacion',
                        method:'post',
                        data: {
                            nombre:$("#nombre").val(),
                            calificaion:$("#calificaion").val(),
                        },
                        success:function(resultado){
                            $("#resultado-guardar-calificaion").html(resultado);
                        }
                    });
                });
            });
 </script>
    </head>
    <body>
        <h1>Resultado de Calificaciones</h1>
        <form action="resultado" method="get">
         <p>Nombre</p>
         <input type="text" name="nombre"/><br>
         <p Calificacion </p>
         <input type="text" name="calificacion"/>
         
            
        </form>
            
        
    </body>
</html>
