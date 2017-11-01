#Answers.md
##Nathan Bullock

###1.What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
    -These methods are recursive so populateList populateFifoList and printReverse are able to add to the list and be called again within the program.
    -The method populateList adds to a list. The method populateFifoList adds to a list but in first in first out order. The printReverse method 
    -recursively adds to a stack and prints it out in reverse order. 
###2.Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
    -The methods need to have arguments in order to end the recursive loop. There needs to be a base case in which n is the smallest. 
    -Each recursive call changes in that n decreases until it eventually reaches the base case. 
###3.What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
    -populateList O(n)
    -populateFifoList (n)
    -ReverseLines.printReverse(n)
###4.Which of these methods can be implemented using while loops?
    -All of these methods could be implimented using a while loop. 