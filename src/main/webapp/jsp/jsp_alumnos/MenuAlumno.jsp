<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.functions" prefix="fn" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema Academico Menu Alumnos</title>
    <link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
    <header>
        <div class="logo">
            <img src="../../img/escudo.jpg" alt="escudo de la escuela"class="logoimg">
            <h1 class="logotext">Escuela Tecnica N° 28 Republica Francesa</h1>
            <img src="../../img/escudo.jpg" alt="escudo de la escuela"class="logoimg">
        </div>
    </header>
    <br>
    <hr>
    <nav class="navcontainer">
        <h4 class="navh4">${Usuario.apellido},${Usuario.nombre}</h4>
        <p>Curso: 1°año 2da division</p>
        <a href="./Materias.html" class="nava">Materias</a>
        <a href="./Calificaciones.html" class="nava">Calificaciones</a>
        <a href="../../index.html" class="nava">Salir</a>
    </nav>
</body>
</html>