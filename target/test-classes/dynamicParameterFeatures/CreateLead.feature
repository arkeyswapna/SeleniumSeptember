Feature: CreateLead Functionality for LeafTaps Application


Scenario Outline: CreateLead with different data
Given Click CRMSFA link
And Click Leads button
And Click CreateLeads button
When Enter the CompanyName as <companyname>
And Enter the FirstName as <firstname>
And Enter the LastName as <lastname>
And Click on the CreateLeads button

Examples: 
|companyname|firstname|lastname|
|TsetLeaf|Subraja|Subi|
|Qeagle|Vidhya|R|



