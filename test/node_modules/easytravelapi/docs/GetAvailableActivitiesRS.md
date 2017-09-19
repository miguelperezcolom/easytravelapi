# EasyTravelApi.GetAvailableActivitiesRS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statusCode** | **Number** | status code for the operation. It will be 200 if it was OK and any other value if something went wrong. Provider dependant | [optional] 
**msg** | **String** | error message, if needed | [optional] 
**systemTime** | **String** | System time in ISO8651 format. Useful for bug resolution | [optional] 
**availableActivities** | [**[AvailableActivity]**](AvailableActivity.md) | List of the available activities for that resort and dates | [optional] 


