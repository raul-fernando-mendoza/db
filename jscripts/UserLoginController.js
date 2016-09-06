angular.module('dbModule', [])
  .controller('TodoListController', function() {
    var todoList = this;
	todoList.someFlag = true;
	todoList.id = 2;
	
    todoList.todos = [
      {id:1, text:'learn_angular', done:true},
      {id:2, text:'build_an_angular_app', done:false}];
 
    todoList.addTodo = function() {
      todoList.todos.push({id:++todoList.id, text:todoList.todoText, done:false});
      
	  enhanceChangedItems(todoList.id);
	  todoList.todoText = '';
    };
 
    todoList.remaining = function() {
      var count = 0;
      angular.forEach(todoList.todos, function(todo) {
        count += todo.done ? 0 : 1;
      });
      return count;
    };
 
    todoList.archive = function() {
      var oldTodos = todoList.todos;
      todoList.todos = [];
      angular.forEach(oldTodos, function(todo) {
        if (!todo.done) todoList.todos.push(todo);
      });
    };
  });