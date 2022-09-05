Feature: To verify the datatable

Scenario: check the data table
Given To log on registration page
When Enter te set of data
|Name|Rollno|Email|Phonenumebr|
|Dileep|466|dileep499689@gmail.com|8754450657|
|Rakesh|467|dileep499688@gmail.com|8754450658|
|Deepak|468|dileep499687@gmail.com|8754450659|
Then submit the report



Scenario: check the data table to retun List

Given To log on search page
When Enter the search criteria
|Dileep|466|dileep499689@gmail.com|8754450657|
|Rakesh|467|dileep499688@gmail.com|8754450658|
|Deepak|468|dileep499687@gmail.com|8754450659|
Then go with search

