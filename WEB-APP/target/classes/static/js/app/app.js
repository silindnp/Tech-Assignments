'use strict'

var testApp = angular.module('test', [ 'ui.bootstrap', 'test.controllers',
		'test.services' ]);
testApp.constant("CONSTANTS", {
	getUserByIdUrl : "/onlineconvertunits/login/",
	getAvailUnitsUrl : "/onlineconvertunits/getAllUnits/",
	getUnitByIdUrl : "/onlineconvertunits/getUnit/",
	convertUnitUrl : "/onlineconvertunits/convert/"
});