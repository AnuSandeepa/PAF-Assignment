$().ready(function(){
	$("#regisration").validate({
		rules:{
			itemid: "required",
			orderid: "required",
			selleraccno: "required",
			customeraccno: "required",
			sellerfullname: "required",
			customerfullname: "required",
			sellerbank: "required",
			amount: "required",
			
			messages:{
				itemid: "Please enter Item ID",
				orderid: "Please enter Order ID",
				selleraccno:{ required: "Please enter Seller Acc No",
							minlength:"Your password need 10 letters"},
				customeraccno: { required: "Please enter Customer Acc No",
					minlength:"Your password need 10 letters"},
					
				sellerfullname: "Please enter Seller Full Name",
				customerfullname: "Please enter Customer Full Name",
				sellerbank: "Please enter Seller Bank",
				amount: "Please enter Amount",

				
			}
		}
	});
});