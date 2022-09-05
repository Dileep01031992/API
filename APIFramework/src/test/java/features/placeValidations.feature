Feature: Validating Place API's

@AddPlaceAPI
Scenario Outline: Verify if Place is being Succesfully added using AddPlaceAPI
	Given Add Place Payload with "<Address>" "<Language>" "<Name>"
	When user calls "AddPlaceAPI" with "Post" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_id created maps to "<Name>" using "getPlaceAPI"

	
Examples:
|Address               |Language    |Name              |
|Ratu Road ranchi konge|Hindi-indian|Dileep kumar muthy|
# |Miska more ranchi     |Bhojpuri    |Rakesh kumar murthy|


@DeletePlaceAPI
Scenario: Verify if Delete Place functionality is working

Given DeletePlace Payload
When user calls "deletePlaceAPI" with "Post" http request
Then the API call got success with status code 200
And "status" in response body is "OK"