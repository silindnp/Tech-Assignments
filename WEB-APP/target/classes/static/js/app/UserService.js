'use strict'

angular.module('test.services', []).factory('UserService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getUserById = function(userId, password) {
				var url = CONSTANTS.getUserByIdUrl + userId + "/" + password;
				return $http.get(url);
			}
			service.getAvailUnits = function() {
				return $http.get(CONSTANTS.getAvailUnitsUrl);
			}
			service.getUnitById = function(unitId) {
				return $http.post(CONSTANTS.getUnitByIdUrl + unitId);
			}
			service.convertUnit = function(unitId,unitValue) {
				return $http.post(CONSTANTS.convertUnitUrl + unitValue + "/" + unitId);
			}
			//alert("Called");
			return service;
		} ]);