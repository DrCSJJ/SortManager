# SortManager
Sort Manager for several sorts I have created it. It generates a random array with integers from 0 to 1000 based on the size of the input recieved from the user. The User can also Select which sorter to use and it will display the the time
taken and teh sorted array. 

## Sorters Used
* Bubblesort
* Binarysort
* Mergesort

## Design
It uses a basic Factory design pattern to structure my sorting algorithms. I have tried to mantain the SOLID principles of object orientated program by providing single responsilbilty for classes, creating an MVC desgin pattern and 
using interfaces for my sorts while mantaining Liskovs princicple. 

## How to use 
Simply run the app main file and the program will then prompt you to input a number from 1 to 3, stating the corresponding sorter to be used. It will then prompt the user to pick the size of the array from 1 to 1000.
these inputs are both checked and will only allow the user to input previously stated numbers. 

