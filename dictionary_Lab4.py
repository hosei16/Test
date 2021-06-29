
# LAB STEP 2
grocery_list = {"chicken": 1.59, "beef" : 1.99, "cheese" : 1.00, "milk": 2.50 }
​
​
# LAB STEP 3: MAKE SURE TO CUSTOMIZE DICTIONARY NAME, KEY AND VALUE
coffee_prices = {"latte" : 4.25, "machiatto" : 2.80, "cappucino" : 3.60, "americano" : 3.20}
​
# LAB STEP 4: ACESSING PRICES
latte_price = coffee_prices["latte"]
machiatto_price = coffee_prices["machiatto"]
cappucino_price = coffee_prices["cappucino"]
americano_price = coffee_prices["americano"]
​
​
# LAB STEP 5: ACESSING PRICES PT 2
chicken_price = grocery_list["chicken"]
# accesses the grocery list dictionary, finds the key "chicken" and returns the value
beef_price = grocery_list["beef"]
cheese_price = grocery_list["cheese"]
milk_price = grocery_list["milk"]
​
# STEP 5.2
coffee_prices["latte"] -= 1.0
coffee_prices["machiatto"] = 2.0
coffee_prices["cappucino"] += 0.5 
coffee_prices["americano"] -= 1.25
​
​
​
​
​
​
#add two items together to know the cost 
def total_price (item1, item2):
    price = grocery_list[item1] + grocery_list[item2]
    return price
​
grocery_list = {"chicken": 1.59, "beef" : 1.75, "cheese" : 1.00, "milk": 2.50 }
def price_difference (item1, item2):
    price = grocery_list[item1] - grocery_list[item2]
    return price
​
print(price_difference("milk", "beef"))
​
​
# STEP 6
shoe_inv = {"Jordan 13": 1, "Yeezy" : 8, "Foamposite" : 10, "Air Max": 5, "SB Dunk": 20}
​
​
def restock(shoe_name, multiplier):
    newInv = shoe_inv[shoe_name] * multiplier
    shoe_inv[shoe_name] = newInv
    return shoe_inv
​
def clearance_sale(shoe_name, discount):
    salePrice = shoe_inv[shoe_name] / discount #using divison to find value
    shoe_inv[shoe_name] = salePrice # assigning sale price to key in dictionary
    return shoe_inv # returning the dictionary
​
​
​
​
​
​
​
​
​
​
​
​
# def restock ( multiplier):
#     for shoe in shoe_inv:
#         total_items = (shoe_inv[shoe] * multiplier)
#         shoe_inv[shoe] = total_items
#     return total_items
​
def clearance_sale(shoe_name, clearance_amount):
    new_price =  shoe_inv[shoe_name] / clearance_amount  # new price = 20 /5
    shoe_inv[shoe_name] = new_price # SB DUNK = 20/5 = 4
    
​
#restock("Yeezy", 3)
​
clearance_sale("SB Dunk", 5)
print(shoe_inv)
​
# STEP 7 
shoe_inv["SB Dunk"] -= 2
shoe_inv["Yeezy"] += 1
​
shoe_inv["Pegasus"] = 6
Collapse
























