var todos = document.querySelectorAll('.todo');
var doings = document.querySelectorAll('.doing');

todos.forEach(function(todo){
	todo.addEventListener('click', function(){
		var xhr = new XMLHttpRequest();
		var id = todo.parentNode.querySelectorAll('input')[0].value;
    	var type = todo.parentNode.querySelectorAll('input')[1].value;
        
	    xhr.onreadystatechange = function(){
	        if(xhr.readyState === 4 && xhr.status === 200){
	        	alert("success!");
	        	location.reload();
	        }
	    }
	    
	    xhr.open('GET', 'todotype?id='+ id + '&type=' + type, true);
	    xhr.send();
	});
});
doings.forEach(function(doing){
	doing.addEventListener('click', function(){
		var xhr = new XMLHttpRequest();
		var id = doing.parentNode.querySelectorAll('input')[0].value;
    	var type = doing.parentNode.querySelectorAll('input')[1].value;
        
	    xhr.onreadystatechange = function(){
	        if(xhr.readyState === 4 && xhr.status === 200){
	        	alert("success!");
	        	location.reload();
	        }
	    }
	    
	    xhr.open('GET', 'todotype?id='+ id + '&type=' + type, true);
	    xhr.send();
	});
});