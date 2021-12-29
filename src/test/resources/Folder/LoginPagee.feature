Feature: Book a Hotel in adactin hotel

  Scenario Outline: Book the hotel with given valid credential
   Given User is on the adactinhotel Login page
   When User should enter "<userName>" and "<password>"
   And User should click login button
   And User should select hotel "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
   And User should click search hotel 
   And User should click the submit button
   And User should Book hotel and enter details"<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Select Month>","<Select Year>","<CVV Number>"
   And User should Click Submit button
   Then User should verify booking id
  


Examples: 
|username        |password    |Location|Hotels     |Room Type|Number of Rooms|Check In Date|Check Out Date|Adults per Room|Children per Room|First Name|Last Name|Billing Address|Credit Card No  |Credit Card Type|Select Month|Select Year|CVV Number|            
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |
|madhankumar99522|Madhan@99522|Sydney  |Hotel Creek|Double   |2 - Two        |28/12/2021   |29/12/2021    |1 - One        |1 - One          | madhanku |mk       |chennai        |9876543210876543|American Express|December    |2022       |097       |










