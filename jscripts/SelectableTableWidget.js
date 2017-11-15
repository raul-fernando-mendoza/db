$.widget( "mobile.selectableTable", {
	options: {
		url: "#"
	},
	$myTable: null,
	selectedID: null,
	_create: function() {
		$myTable = this.element;
		if (window.console) console.log('selectableTable_create():');
		$myTable.addClass("selectable");


		$myTable.find("li, tr").on("click", function(event){
			$(this).siblings().removeClass("ui-selected");
			$(this).addClass("ui-selected");
			selectedID = $(this).attr('id');
		});
		
		var mytableid = $myTable.attr("id");
		
		var pageid =  $myTable.closest("[data-role=page]").first().attr("id");
		
		$(document).on("pagebeforeshow", "#" + pageid, function (event) {
			if (window.console) console.log('pagebeforeshow selectableTable:' + pageid + "->" + mytableid );
			
		});

	}
	
    ,_update: function() {
		if (window.console) console.log('selectableTable._update');
		$myTable.enhanceWithin();
		$myTable.find("li, tr").on("click", function(event){
			if (window.console) console.log('selectableTable selected:' + $(this).attr('id'));
			$(this).siblings().removeClass("ui-selected");
			$(this).addClass("ui-selected");
			selectedID = $(this).attr('id');
		});
    }
    ,getSelectedID: function(){
    	return selectedID;
    }
    // Externally callable method to force a refresh of the widget. 
    ,refresh: function() {
		if (window.console) console.log('selectableTable.refresh');
      return this._update();
    } 
});
