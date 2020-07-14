<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Random number sum</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<p>CALCULATE SUM OF NUMBERS APP</p>

	<form:form action="/calculate" method="GET" id="calcParameters">
		<div>
			<label>Choose sources for random numbers:</label>
			<form:checkboxes items="${typesOfSource}" path="calcSources" />
			<button>Calculate!</button>
		</div>
	</form:form>
</body>
</html>