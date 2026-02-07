# Password_Strength_Project
A Java-based console application that allows users to create accounts, analyze password strength, and estimate the time required for a brute-force attack( a cybersecurity method that uses trial-and-error to systematically guess passwords, login credentials, or encryption keys until the correct combination is found) on a given password.
The project mainly has 4 classes used one of which is the main class,where all the user credentials(i.e Name and Password) are stored in an ArrayList.
User gets 4 options in the main method:
1. To create account.
2. Analyze password strength.
3. To check Brute Force Time
4. To exit the code.
I used a switch case for these 4 cases....
The Password Analyser class helps to check the strength of the password by putting all the needed conditions like checking for all the alphabets, numbers and special characters... it also checks that password length is more than 8... it then returns is the password strong or not or how much strong is it..
The Password Simulator class helps to write the checking conditions for the brute force attack and see how much time it takes to track the password in seconds..
## Concepts Used
- Object-Oriented Programming (OOP)
- Java Collections (ArrayList)
- Switch-Case Control Statements
- String manipulation
- Basic cybersecurity concepts
- Brute-force attack simulation logic
