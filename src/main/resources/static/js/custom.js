$(document).ready(
		function() {
			$("button").click(
					function() {
						$.ajax({
							url : "books",
							data : {
								userId : this.id
							},
							success : function(result) {
								$("#result").html(
										'<h2>Books lent to the selected user </h2>'
												+ result);
							}
						});
					});
		});