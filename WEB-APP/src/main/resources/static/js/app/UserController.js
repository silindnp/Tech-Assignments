'use strict'

var module = angular.module('test.controllers', []);
module.controller("UserController", [ "$scope", "UserService",
		function($scope, UserService) {
	
			$scope.unitId = null;
			
			$scope.unitValue = null;
			
			$scope.userLoginDto = {
				userPassword : null,
				userName : null,
			};
			
			UserService.getUserById(1).then(function(value) {
				console.log(value.data);
			}, function(reason) {
				console.log("error occured");
			}, function(value) {
				console.log("no callback");
			});

			UserService.convertUnit(unitValue,unitId).then(function(value) {
				$scope.unitDto= value.data;
				console.log(value.data);
			}, function(reason) {
				console.log("error occured");
			}, function(value) {
				console.log("no callback");
			});
			//alert("Called2");
		} ]);