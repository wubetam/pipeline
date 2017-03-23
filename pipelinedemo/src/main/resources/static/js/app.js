/*var app = angular.module('app', [ 'ngRoute', 'ngResource' ]);
app.config(function($routeProvider) {
	$routeProvider.when('/users', {
		templateUrl : '/views/users.html',
		controller : 'usersController'
	}).when('/roles', {
		templateUrl : '/views/roles.html',
		controller : 'rolesController'
	}).otherwise({
		redirectTo : '/'
	});
});*/

var app = angular.module("app", [ 'ui.router' ]);

app.config(function($stateProvider, $urlRouterProvider) {

	$stateProvider.state("users", {
		url : "/users",
		templateUrl : "views/users.html",
		controller : "usersController"
	});

	$stateProvider.state("roles", {
		url : "/roles",
		templateUrl : "views/roles.html",
		controller : "rolesController"
	});


	$urlRouterProvider.otherwise("/");

});