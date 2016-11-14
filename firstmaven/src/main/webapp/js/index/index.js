$(document).ready(function() {
	$("#addUsers").click(function() {
		$.ajax({
			url : path + '/user/addUsers',
			async : false,
			success : function(data) {
				alert('success:'+JSON.stringify(data));
			},
			error : function(data) {
				alert('error:'+JSON.stringify(data));
			}
		});
	});
});