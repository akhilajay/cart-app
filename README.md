# Getting Started

## Running Test Case
* Run CartServiceTest to see the final payable amount as per the assessment document.

## Run the project as fat jar
* run mvn clean package
* go to cart project target directory and run java - jar cart-service.jar
* to check the service is running , try accessing using http://localhost:7070/cart-service/v1/ping.if the service running fine you will see "ping bill-service is sucessfull" message.
* to see the payable amount for given bill
  ## POST below payload to http://localhost:7070/cart-service/v1/pay.
  You will see same respone with payabale total consider discount if applicable based on UserType.

  ## 2 Enum you need understand
    #  CartItem Type which is the itemType in below payload
            GROCERY(200, "Grocery"), CLOTH(201, "Fashion"), BEAUTY(203, "Beauty"),ELECTRONICS(204,"Electronics");
    # UserType which is the userType in below payload
            EMPLOYEE(450, "Employee"), AFFILIATE(500, "Affiliate"), PRIVILEGED_CUSTOMER(550, "Privileged Customer");

  {
	"userType": 450,
	"cart": [{
			"cartId": 1,
			"unitPrice": ".020",
			"item": "Apple",
			"itemType": 200,
			"unit": "gram",
			"quantity": 763,
			"currency": "AED"
		}, {
			"cartId": 2,
			"unitPrice": ".015",
			"item": "Orange",
			"itemType": 200,
			"unit": "gram",
			"quantity": 553,
			"currency": "AED"
		}, {
			"cartId": 3,
			"unitPrice": "4",
			"item": "Santor",
			"itemType": 203,
			"unit": "gram",
			"quantity": 3,
			"currency": "AED"
		}, {
			"cartId": 4,
			"unitPrice": ".010",
			"item": "Tomato",
			"itemType": 200,
			"unit": "gram",
			"quantity": 500,
			"currency": "AED"
		}, {
			"cartId": 5,
			"unitPrice": "0.005",
			"item": "Potato",
			"itemType": 200,
			"unit": "gram",
			"quantity": 500,
			"currency": "AED"
		}, {
			"cartId": 6,
			"unitPrice": "20",
			"item": "T-Shirt",
			"itemType": 201,
			"unit": "",
			"quantity": 3,
			"currency": "AED"
		}, {
			"cartId": 7,
			"unitPrice": "100",
			"item": "T-Shirt",
			"itemType": 201,
			"unit": "",
			"quantity": 5,
			"currency": "AED"
		}

	]
}
