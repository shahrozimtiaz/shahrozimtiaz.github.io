from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from emailSender import emailSender
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as ec
from selenium.webdriver.support.ui import WebDriverWait
import os

options = Options()
options.headless = True
driver = webdriver.Chrome(options=options)
wait = WebDriverWait(driver, 10)
ps4Link = 'https://www.amazon.com/PlayStation-4-Slim-1TB-Console/dp/B071CV8CG2?ref_=Oct_BSellerC_6427871011_0&pf_rd_p=19e7ab65-a919-5edb-bc56-4af227784c6f&pf_rd_s=merchandised-search-6&pf_rd_t=101&pf_rd_i=6427871011&pf_rd_m=ATVPDKIKX0DER&pf_rd_r=5DNCG3CX7743Z023531P&th=1'
ps4Price = None
ps4PriceToCompare = 285


def priceChecker():
    driver.get(ps4Link)
    # elems = driver.find_elements_by_class_name('a-text-bold')
    # priceElem = None
    # for elem in elems:
    #     if(elem.text == 'See price in cart'):
    #         priceElem = elem
    # priceElem.click()
    # elem = wait.until(ec.visibility_of_element_located((By.ID, 'priceblock_ourprice')))
    elem = wait.until(ec.visibility_of_element_located((By.CLASS_NAME, 'price-large')))
    # elem = driver.find_element_by_id('priceblock_ourprice')
    ps4Price = int(elem.text.strip())
    return ps4Price

if(__name__ == '__main__'):
    try:
        print("Running..")
        sender = emailSender('shahrozimtiaz07@gmail.com','Jokerface07!')
        print('Checking price')
        ps4Price = priceChecker()
        if(ps4Price < ps4PriceToCompare):
            print('Sending email')
            sender.sendMessage('shahrozimtiaz07@gmail.com','PS4 Price', 'The price has dropped to $' + str(ps4Price) + '!')
            print('Sent')
            with open(__file__, "r") as f:
                lines = f.read().split('\n')
                lines[15 - 1] = "ps4PriceToCompare = " + str(ps4Price)
            with open(__file__, 'w') as f:
                for line in lines:
                    f.write(line + '\n')
            os.system('cd Documents/codingPractice/python Practice/')
            os.system('pyinstaller --onefile ps4PriceChecker.py')
            os.system('cp dist/ps4PriceChecker ~/Desktop/')
        else:
            print('Price has not dropped from $' + str(ps4PriceToCompare))
        driver.quit()
        print('Done!')
    except Exception as e:
        print('Something went wrong', e.args)
