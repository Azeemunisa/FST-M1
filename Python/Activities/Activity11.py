fruit_shop = {
    "apple": 10,
    "BANANA": 15,
    "orange": 8,
    "peaches": 15
}

key_to_check = input("What are you looking for? ").upper()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")