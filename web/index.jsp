<%--
  Created by IntelliJ IDEA.
  User: oleksandr.vladyka
  Date: 8/15/2019
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Welcome.com</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/welcome" method="POST">

<h2> Please enter your personal</h2>
    <table>
        <tr><td>First name: </td><td><label>
            <input type="text" name="First name" required>
        </label></td></tr>
        <tr><td>Last name: </td><td><label>
            <input type="text" name="Last name" required>
        </label></td></tr>
        <tr><td>Age: </td><td><label>
            <input type="number" name="Age">
        </label></td></tr>
    </table>

    <h2>Please answer the questions</h2><br>

What is your favorite programing language?<br>
    <label>
        <input type="radio" name="questionLanguage" value="java">
    </label>Java<br>
    <label>
        <input type="radio" name="questionLanguage" value="c#">
    </label>C#<br>

What IDE do you use?<br>
    <label>
        <input type="radio" name="questionIDE" value="idea">
    </label>Idea<br>
    <label>
        <input type="radio" name="questionIDE" value="VS">
    </label>Visual Studio<br>

Are you a good developer?<br>
    <label>
        <input type="radio" name="questionDeveloper" value="yes">
    </label>yes<br>
    <label>
        <input type="radio" name="questionDeveloper" value="no">
    </label>not yet, but I will become<br>
    <input type="submit" value="ok">
</form>
</body>
