		// The following block implements the string.parseJSON method
		(function (s) {
		  // This prototype has been released into the Public Domain, 2007-03-20
		  // Original Authorship: Douglas Crockford
		  // Originating Website: http://www.JSON.org
		  // Originating URL    : http://www.JSON.org/JSON.js
	
		  // Augment String.prototype. We do this in an immediate anonymous function to
		  // avoid defining global variables.
	
		  // m is a table of character substitutions.
	
		  var m = {
		    '\b': '\\b',
		    '\t': '\\t',
		    '\n': '\\n',
		    '\f': '\\f',
		    '\r': '\\r',
		    '"' : '\\"',
		    '\\': '\\\\'
		  };
	
		  s.parseJSON = function (filter) {
	
		    // Parsing happens in three stages. In the first stage, we run the text against
		    // a regular expression which looks for non-JSON characters. We are especially
		    // concerned with '()' and 'new' because they can cause invocation, and '='
		    // because it can cause mutation. But just to be safe, we will reject all
		    // unexpected characters.
	
		    try {
		      if (/^("(\\.|[^"\\\n\r])*?"|[,:{}\[\]0-9.\-+Eaeflnr-u \n\r\t])+?$/.
		        test(this)) {
	
		          // In the second stage we use the eval function to compile the text into a
		          // JavaScript structure. The '{' operator is subject to a syntactic ambiguity
		          // in JavaScript: it can begin a block or an object literal. We wrap the text
		          // in parens to eliminate the ambiguity.
	
		          var j = eval('(' + this + ')');
	
		          // In the optional third stage, we recursively walk the new structure, passing
		          // each name/value pair to a filter function for possible transformation.
	
		          if (typeof filter === 'function') {
	
		            function walk(k, v) {
		              if (v && typeof v === 'object') {
		                for (var i in v) {
		                  if (v.hasOwnProperty(i)) {
		                    v[i] = walk(i, v[i]);
		                  }
		                }
		              }
		              return filter(k, v);
		            }
	
		            j = walk('', j);
		          }
		          return j;
		        }
		      } catch (e) {
	
		      // Fall through if the regexp test fails.
	
		      }
		      throw new SyntaxError("parseJSON");
		    };
		  }
		) (String.prototype);
		// End public domain parseJSON block
	
		// begin sample code (still public domain tho)
		//JSONData = '{"color" : "green"}';   // Example of what is received from the server.

		//JSONData = '{ "numRows":5, "items":[ { "id":91, "price":2800000.0, "currency":"MXP", "municipioName":"Monterrey", "coloniaName":"Otra", "coloniaOther":"contry sur", "bedrooms":3, "bathrooms":2.5, "stories":3, "houseSize":280, "lotSize":160, "coveredGarages":2, "uncoveredGarages":0, "coveredLaundry":"true", "age":0, "latitude":25.596329066628574, "longitude":-100.24801254272461, "preferredZoom":13, "telephone":"", "email":"", "comment":"estancia sotano cuarto de triques cuarto de servicio pisos de porcelanato equipada con multimedia bocinas entrada para ipod control infrarojo para las luces.", "approved":"true", "createdBy":15, "creationDate":"11/4/10 12:00 AM", "lastUpdateDate":"11/4/10 12:00 AM" } ] }'; 

		//testObject=JSONData.parseJSON();   
		//document.writeln(testObject.items[0].price); // Outputs: Green.
