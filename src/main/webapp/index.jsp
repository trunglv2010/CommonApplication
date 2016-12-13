<%@taglib uri="/struts-tags"  prefix="s"%>
<html>
<header>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
<script type="text/javascript">
	var myapp = angular.module('myapp', []);
	myapp.controller('myController', function($scope, $http){
		$http.get("fc.json").success(function(data){
			$scope.fc = data;
		});
	});
</script>
</header>
<body>
<div ng-app="myapp" ng-controller="myController">

	<s:form action="login">
		<s:textfield name="userBean.username" label="User Name:"></s:textfield>
		<br/>
		<s:password name="userBean.password" label="Pass word:"></s:password>
		<s:submit value="Login"></s:submit>
	</s:form>
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>
				FIRST NAME
			</th>
			<th>
				MIDDLE NAME
			</th>
			<th>
				LAST NAME
			</th>
			<th>
				DATEOFBIRTH
			</th>
			<th>
				MOBILEPHONE
			</th>
			<th>
				PERSONAL EMAIL
			</th>
		</tr>
		<tr ng-repeat="item in fc">
			<td> {{item.FIRSTNAME}}
			</td>
			<td> {{item.MIDDLENAME}}</td>
			<td> {{item.LASTNAME}}</td>
			<td> {{item.DATEOFBIRTH}}</td>
			<td> {{item.MOBILEPHONE}}</td>
			<td> {{item.PERSONALEMAIL}}</td>
		</tr>
	</table>
</div>

</body>
</html>
