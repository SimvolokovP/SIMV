#Последние цифры зачетки - 72
import json
import requests
from pprint import pprint
username = "web-platform-tests"
url = f"https://api.github.com/users/{username}"
def write(data, filename):
    data = json.dumps(data)
    data = json.loads(str(data))
    with open(filename, 'w', encoding= 'utf-8') as file:
        json.dump(data, file, indent = 4)
n_data = requests.get(url).json()
pprint(n_data)    
write(n_data, 'data.json')