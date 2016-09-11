angular.module('dbModule', [])
.controller('SelectableTableController', ['$scope', '$element', '$attrs', '$http', '$templateCache',
    function($scope, $element, $attrs, $http, $templateCache) {
      $scope.method = 'GET';
      $scope.url = $attrs.url;
      $scope.attrs = $attrs;
      $scope.data = [/*{
                         "entityID" : -1,
                         "parentEntityID" : 0,
                         "entityName" : "club",
                         "label" : "sucursal",
                         "description" : "esta es una sucursal",
                         "isMultiple" : "N",
                         "createdBy" : 1,
                         "updatedBy" : 1,
                         "createDate" : "2016-09-06",
                         "updateDate" : "2016-09-06"
                       }, {
                         "entityID" : -2,
                         "parentEntityID" : -1,
                         "entityName" : "contact",
                         "label" : "contactos",
                         "description" : "tabla de contactos",
                         "isMultiple" : "N",
                         "createdBy" : 1,
                         "updatedBy" : 1,
                         "createDate" : "2016-09-06",
                         "updateDate" : "2016-09-06"
                       }*/];      

      $scope.fetch = function() {
        $scope.code = null;
        $scope.response = null;
        if (window.console) console.log('EntityController request from data' + $scope.url);

        $http({method: $scope.method, url: $scope.url, cache: $templateCache}).
          then(function(response) {
            $scope.status = response.status;
            $scope.data =  response.data;
            if (window.console) console.log('EntityController changed data');
            window.setTimeout(function () {
            	$('#' + $scope.attrs.id).selectableTable("refresh");
             }, 100)
          }, function(response) {
            $scope.data = response.data || 'Request failed';
            $scope.status = response.status;
        });
      };

      $scope.updateModel = function(method, url) {
        $scope.method = method;
        $scope.url = url;
      };
      
      $scope.fetch();
}]);

