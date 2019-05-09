Feature: Register user
@regression
Scenario Outline: Successful login with valid credentials at http://automationpractice.com/index.php.
Given user is on homepage.
When navigates to login page and user enters <username> and <password>.
Then login is successfully.

Scenario Outline: Add an item to the cart.
Given user is on homepage.
When navigates to T-SHIRTS and select Faded Short Sleeve T-shirt and add to cart.
Then Shirt is added to the cart.

Scenario Outline: Go to Personal information section.
Given user is on homepage.
When navigates to Update personal information and select First name and change and save it.
Then First name gets changed.

 Examples:
| Username | Password |
| ektadubey6@gmail.com | Password123 |

