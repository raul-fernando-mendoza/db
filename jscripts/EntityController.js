angular.module('dbModule', [])
  .controller('EntityController', function() {
    var entityList = this;
	entityList.newID = 2;
	entityList.newName = '';
	
    entityList.entities = [
      {id:1, name:'employee', done:false},
      {id:2, name:'sites', done:false}];
 
    entityList.addEntity = function() {
      entityList.entities.push({id:++entityList.newID, name:entityList.newName});
      
	  //enhanceChangedItems(todoList.id);
	  entityList.newName = '';
    };
 
    entityList.remove = function() {
    };
  });