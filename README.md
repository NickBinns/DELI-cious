Hello and welcome to my second capstone project. Here I will explain my project along with some of my code and show some pictures of my application. This project is a deli appilcation called DELI-cious. The purpose of this app is that a user can create a sandwich inside of the app by selecting many options such as bread type, bread size and choice of meat and many more options. They can also add chips and a drink if they like. I will be showing some pictures of how everything works along with some line of code as well.

This picture below is my home screen which is simply asking the user if they want to create a new order or exit the application. The code is running from line 9-30 in my user interface class.
![deliHomeScreen](https://github.com/NickBinns/DELI-cious/assets/166635288/d7d76024-5a44-4cf6-b4cb-bfc52d4323fe)

This next picture is my order screen running which gives the user the option to either start building out a sandwich, drink and/or chips. The user is free to get just a sandwich if they want too or they can add chips and a drink to their order as well.
![deliOrderScreen](https://github.com/NickBinns/DELI-cious/assets/166635288/3683e0ae-01b8-4225-899b-429fbfb91799)

This here is an example of what it would look like for the user creating their sandwich of choice. As you can see, I choose the type of bread I want along with the size, the meat (or in this case it's called premium toppings), the cheese I want, if i want the sandwich toasted or not and my regualr toppings. I can also choose what type of sauce or condiment I want on my sandwich.
![sandwichCreator](https://github.com/NickBinns/DELI-cious/assets/166635288/c4f18a6e-5169-4b95-ae40-62640cc39835)
![sandwichCreator2](https://github.com/NickBinns/DELI-cious/assets/166635288/ea3e547c-768f-4c4c-9613-e6be08d45d01)

As stated before, the user can add chips and a drink to their order so for this example, I choose to add a drink and chips for reference. They can choose their drink size and type along with chips size and types for their order.
![drinkAndChipBuilder](https://github.com/NickBinns/DELI-cious/assets/166635288/f913039e-938d-4bf2-b234-73d04163e4f9)

Once the user is done and enters option 4, they have the option to checkout and when they enter that their final order will display and ask for either a confirmation for their order or to cancel it. If they hit option 1 for checkout then it will save to a folder and create a receipt text file once the appilcation stops running or if they hit option 2 for cancel then it will disregard their entire order and go back to the home screen for them to either start a new order or exit the appilcation
![checkoutScreen](https://github.com/NickBinns/DELI-cious/assets/166635288/c7797b20-efe7-4c2c-960f-6b35eac74cf9)
![receiptFile](https://github.com/NickBinns/DELI-cious/assets/166635288/0b797f3e-76cd-4976-a43c-b80a2e1075a1)

The one piece of interesting code from my project actually comes from the order screen in which I am asking the user to select a option. Behind that screen was me coding it out using switch case statements and calling methods into those statements. Beforehand, I was not very familiar on how to use switch case statements or even creating methods so I can call upon them when a user input is accepted. For this project I wanted to try something different and not be as repetitive as my last project when I was only using if-else statements and instead of creating methods for my code to run, I would just literally type out all that code into the statement so it was something new for me and was very interesting. This code runs from line 56-90 in my user interface class. 
![interestingDeliCode](https://github.com/NickBinns/DELI-cious/assets/166635288/a03b4010-f7f1-4973-8167-f2bde22ca95c)

Unlike my last capstone I personally feel like this time around my code is more polished. The only 2 bugs I have as of right now is my calculation is off by a .50 cents at the most. The dollar amount of what the user ordered is correct but the cent amount is off. The second bug I have is when the user selects if they want their sandwich toasted or not, on the receipt file it shows as true or false. I know the reason why behind that is because their input is being accepted as a boolean statement but to avoid confusion, I have a string "Toasted" next to the boolean in my format for the receipt so they could know weither their sandwich is being toasted or not. I could look into fixing it by having that boolean statement converted to a string to display on the receipt so if they enter "Y" then it shows "Toasted" on the receipt or if they enter "F" then it shows "Not toasted".

This project really helped me expand my coding skills from my last one and I look forward to getting even better at what I am doing.
