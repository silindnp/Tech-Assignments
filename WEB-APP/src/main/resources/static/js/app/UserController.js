'use strict'

var module = angular.module('test.controllers', []);
module.controller("UserController", [ "$scope", "UserService",
		function($scope, UserService) {
	
			$scope.userLoginDto = {
				userPassword : null,
				userName : null,
			};
			
			$scope.AllUnits = [];
			$scope.selectedUnit = null;
			
			$scope.unitDto = {
					id : null,
					description : null,
				};

			$scope.AllunitsDto = {
					id : null,
					description : null,
				};
			
			$scope.Convertedunit = {
					id : null,
					description : null,
				};
			
			$scope.$inject = ["$window", "UserService", "notify"];
			
			UserService.getAvailUnits().then(function(response) {
				console.log("Function Executed...");
				console.log(response.data);
				$scope.AllunitsDto = response.data;
				angular.forEach($scope.AllunitsDto, function(item) {
					$scope.AllUnits.push(item.description);	
				});
			});
			
			$scope.getUserById = function() {
				//console.log("Clicked logon...");
				UserService.getUserById($scope.username,$scope.password).then(function(response) {
					console.log(response.data);
					if(response) {
						location.href = "home";
			        } else {
			        	location.href = "index";
			        }
					//$window.location.href = "home.html";
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}	
				
			$scope.convertUnit = function() {
				//$scope.selectedUnit = $scope.venues[i];
				angular.forEach($scope.AllunitsDto, function(item) {
					if (item.description === $scope.selectedUnit) {
						$scope.unitId = item.id;
					}
				});
				console.log($scope.selectedUnit + " - is Select - " + $scope.unitId);
				UserService.convertUnit($scope.unitValue,$scope.unitId).then(function(response) {
					$scope.Convertedunit = response.data;
					console.log("After Rest call: " + $scope.Convertedunit.description);
					$scope.converted = $scope.Convertedunit.description;
					/*angular.forEach($scope.Convertedunit, function(item) {
						$scope.converted = 	item.description;
					});*/
				}, function(reason) {
					console.log("error occured" + reason);
				}, function(value) {
					console.log("no callback");
				});
			}
			//alert("Called2");
		} ]);