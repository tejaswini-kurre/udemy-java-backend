<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spring Boot Web</title>\
    <style>
        .form-sections {
            display: flex;
            justify-content: space-evenly;
            color: white;
        }


    </style
</head>
<body>
    <div class="form-sections">
        <div style="background-color: limegreen; padding: 20px">
            <h2>Add Two Numbers</h2>
            <form action="add" method="post">
                <label for="num1">Enter first number:</label>
                <input type="number" id="num1" name="num1">
                <br><br>
                <label for="num2">Enter second number:</label>
                <input type="number" id="num2" name="num2">
                <br><br>
                <input type="submit" value="Add Numbers">
            </form>
        </div>
        <div style="background-color: limegreen; padding: 20px">
            <h2>Add Alien</h2>
            <form action="addAlien">
                <label for="aid">Enter alien id:</label>
                <input type="number" id="aid" name="aid">
                <br><br>
                <label for="aname">Enter alien name:</label>
                <input type="text" id="aname" name="aname">
                <br><br>
                <input type="submit" value="Add Alien">
            </form>
        </div>
    </div>
</body
</html>