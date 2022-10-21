# Impledge Task
Programming Problem - "Search the longest compounded word"

# PROBLEM STATMENT

Write a program that reads a file containing a sorted list of words (one word per line, no spaces, all lower case), then identifies the longest word in the file that can be constructed by concatenating copies of shorter words also found in the file.

For example, if the file contained:

   cat
   cats
   catsdogcats
   catxdogcatsrat
   dog
   dogcatsdog
   hippopotamuses
   rat
   ratcatdogcat
   
   Ratcatdogcat, the longest word AND Second Longest  Word: catsdogcatsconstructed from other words on the list with 12 letters, would be the correct response.
   The following section of the software should include a report on how many of the words on the list can be formed from other words on the list.

# ALOGORITHM TO SOLVE THIS

The apporach to solve the problem is using a trir data structure  
so firstly store all the given input in the trie data structure 
Now trie contains all the words ,now itterate one by one in the trie data structure 
eg- for cat we check that prefix of cat exist in trie data structure or not if yest that check = true
now store in the data queue structure in the form of pair to store that word and the l;ength of that word
now do this for all the string present in the trie data structure 
now in the end we have all the valid string with prefix store  in the de queue data structure 
if it is greater than the first and last one so we can easly return first and second largest  because
we store in this manner that for front we check or first largest and for second we check for second largest 
Now the last and first one is the first and second largest string with all prefix 

# STEPS

1. READ THE INPUT
2. STORE THAT INPUT IN QUESUE DATA STRUCTURE
3. ITTREARTE AND STORE IN THE SELF DECLARE TRIE DATA STRUCTURE 
4.ITTREATE AND CHECK FOR PREFX OF THAT PARTICULAR STRING

5.DO FOR ALL THE STRING PRESENT IN THE TRIE DATA STRUCTURE
6. CREATE A DEQUEUE TO SOTRE FIRST AND SECOND LARGEST 

7. DEQUEUE IS DOUBLE ENDED SO WE USE THIS AS FIRST AND LAST TO STORE FIRST LARGEST AT FRONT AND SECOND LARGEST IN LAST
8 STORE IN STRIN1 AND STRING 2 AND PRINT THE FINAL ANS I.E FIRST AND SECOND LARGEST


#Time Complexity

O(N*length) + O(N) * O(length) + O(N*length)
O(N*length) --> to read input and store in queue data structure where N is number of string input and average length of all the string;

O(N*length) --> to read input and store in  trie data structure where N is number of string input  and average length of all the string;
O(N*length) --> to ittrate  where N is number of string input  and average length of all the string;
 


 

#Space Complexity

O(N*length) +O(N*length)
O(N*length) --> to read input and store in  trie data structure where N is number of string input  and average length of all the string;
O(N*length) --> to read input and store in  trie queue data structure where N is number of string input  and average length of all the string;
