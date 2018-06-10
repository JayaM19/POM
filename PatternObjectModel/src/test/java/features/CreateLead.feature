Feature: Create a Lead in leaftaps
Scenario Outline: Create a lead
And Enter UserName as <UserName>
And Enter Password as <Password>
And Click on Login Button 
And Click CRM/SFA
And Click Leads
And Click CreateLeads
And Enter Company Name as <CompanyName>
And Enter First Name as <FirstName>
And Enter Last Name as <LastName>
When Click on Create Leads
Then Verify First Name is <FirstName>
Examples:
|UserName|Password|CompanyName|FirstName|LastName|
|DemoSalesManager|crmsfa|CTS|Mukesh|G|
|DemoCSR|crmsfa|Accenture|Jaya|S|

#Scenario: Create a lead
#Given Invoke leaftaps application
#And Enter UserName as DemoSaleManager
#And Enter Password as crmsfa
#And Click on Login Button
#And Click CRM/SFA
#And Click Leads
#And Click CreateLeads
#And Enter MandatoryFields as CTS, Mukesh, G
#When Click on Create Leads
#Then Verify First Name is Mukesh