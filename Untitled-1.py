
##
grocery_list = {"Chicken": 1.59, "beef": 1.99 , "cheese" : 1.00, "milk": 2.50}


######
coffee_prices = {"latte" : 4.25, "machiatto": 2.80, "cappucino": 3.60, "americano": 3.20}

##########
latte_price = coffee_prices ["latte"]
machiatto_price = coffee_prices ["machiatto"]
machiatto_price = coffee_prices ["cappucino"]
americano_price = coffee_prices ["americano"]

####

beef_price = grocery_list["beef"]
cheese_price = grocery_list["cheese"]
milk_price = grocery_list["milk"]

######

coffee_prices["latte"] -= 1.0
coffee_prices["machiatto"] = 2.0
coffee_prices["cappucino"] += 0.5 
coffee_prices["americano"] -= 1.25

def total_price (item1, item2):
    price = grocery_list[item1] + grocery_list[item2]
    return price

statement = "the difference betweeen"
print(total_price(item1,item2)