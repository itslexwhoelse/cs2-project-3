# cs2-project-3
This is my project 3 for cs2.
here's the instructions for the assignment

# instructions
Project 3: Two Player Strategy Game
===================================

Description
===========

For Project 3, you will make a program that allows for a player to play a particular game of strategy. The way this game works is as follows:

First, a random number between 3 and 7 is chosen. This will be the number of **rows**. On each row, there will be some number of **stones**. At the beginning, there are three stones on the first row, and then one more on each successive row. So for example, if there are 4 rows, the rows will look like the following at the beginning of the game:

Row 0: * * * (3 stones)  
Row 1: * * * * (4 stones)  
Row 2: * * * * * (5 stones)  
Row 3: * * * * * * (6 stones)

Gameplay alternates between two players. On a player’s turn, the player chooses a row and a number of stones to take. They **must** choose a row with at least one stone on it, and they **must** choose a non-zero number of stones. They can choose to take anywhere from 1 stone to all the stones on that row. The object of the game is **to take the last stone**.

Gameplay Example
----------------

For example, suppose the game starts with four rows:

Row 0: * * * (3 stones)  
Row 1: * * * * (4 stones)  
Row 2: * * * * * (5 stones)  
Row 3: * * * * * * (6 stones)

Player 1 might choose to take 2 stones from row 2. Then the game looks like:

Row 0: * * * (3 stones)  
Row 1: * * * * (4 stones)  
Row 2: * * * (3 stones)  
Row 3: * * * * * * (6 stones)

Player 2 might choose to take 2 stones from row 3 now:

Row 0: * * * (3 stones)  
Row 1: * * * * (4 stones)  
Row 2: * * * (3 stones)  
Row 3: * * * * (4 stones)

Player 1 might take all 3 stones from row 0 now:

Row 0: (0 stones)  
Row 1: * * * * (4 stones)  
Row 2: * * * (3 stones)  
Row 3: * * * * (4 stones)

Player 2 might take 1 stone from row 2:

Row 0: (0 stones)  
Row 1: * * * * (4 stones)  
Row 2: * * (2 stones)  
Row 3: * * * * (4 stones)

Player 1 might take all the stones from row 1:

Row 0: (0 stones)  
Row 1: (0 stones)  
Row 2: * * (2 stones)  
Row 3: * * * * (4 stones)

Player 2 might take 3 stones from row 3:

Row 0: (0 stones)  
Row 1: (0 stones)  
Row 2: * * (2 stones)  
Row 3: * (1 stone)

Player 1 might take 1 stone from row 2:

Row 0: (0 stones)  
Row 1: (0 stones)  
Row 2: * (1 stone)  
Row 3: * (1 stone)

Player 2 can take the stone from row 3:

Row 0: (0 stones)  
Row 1: (0 stones)  
Row 2: * (1 stone)  
Row 3: (0 stones)

Now **player 1 wins** by taking the stone from row 2.

(This example does not necessarily reflect the input/output that your project may use).

Directions
----------

First: your project will need to allow the user to select the players. It should give a choice between three types of players: **Human**, **Simple** Computer, and **Smart** Computer. You should allow all game types (there are 9, allowing for the difference between Human vs Simple and Simple vs Human).

The game starts with picking a random number between 3 and 7 for the number of rows. (Use the nextInt method in the Random class for this). Then display the board (you can just output the row number and how many stones are left in each row).

Player 1 gets to make a move. If the player is a computer, output the move (the row number and the amount of stones they take). If the player is a human, you need to ask the user to input the row number and the amount of stones to take. Then decrease the number of stones in the chosen row by that amount.

Continue with Player 2 making a move. The game continues until all the stones have been taken away. The player who takes the last stone wins. At that point, the program should output who the winner was.

Strategies
----------

You must implement a **Simple** computer player that follows the following strategy:

* Find the first row that has any pieces left.
* Take one piece from that row.

You must also implement a **Smarter** computer player. You are to come up with another strategy that should hopefully be better than the Simple strategy. (There are some obvious improvements; for example, the Simple strategy does not force a win when it should be able to).

For the Human player, allow the user to input in the row and number of pieces to take. Don’t worry about validating input, just make sure it’s usable.

Object-Oriented Programming
---------------------------

You are to exhibit good “OOP-style”. That means you are to use the design principles we have talked about in class. These considerations include, but are not limited to:

* limit the amount of static methods outside of the Main class
* components should be independent: that is, a HumanPlayer component should not need to know about the implementation details of a SimplePlayer component, or vice versa.
* the visibility of instance variables should be limited to “private” as much as possible; use accessor methods (“getters”) instead.

Grading
=======

Out of 100 points:

* 25 points if your submission **compiles** without any errors
* 25 points for **functionality**:
    * Three player types should be available: Simple Computer, Smarter Computer, and Human Player
    * All 9 versions of the game (Human vs Simple, Human vs Smarter, Human vs Human, etc) should be allowed
    * You must correctly determine the winner in all cases.
* 30 points for **object-oriented design/style**. Your code should be lightly coupled. You need to have several components that should be independent and testable. You should limit the usage of static methods as much as possible. Of course, the normal “style” considerations still apply: your variables should have good names, your methods should each do one job, your code should have comments explaining why things are done a certain way.
* 20 points for **documentation** / written explanation. In the "explanation.md" file on replit, write a short explanation of _how_ you solved the problem. Clearly explain how the various components are implemented and the different choices you made. For example, if you use inheritance, explain why. If you have an interface for a particular component, explain why. For the “Smarter” computer player, clearly document the strategy the player uses.
    * 12 points for explaining the object-oriented design of your code (did you use inheritance, interfaces, polymorphism? How did that help? How was it a challenge? What did you learn?).
        * 2 points for **grammar**.
        * 5 points for **comprehensiveness**: your explanation should correctly match what you did (don't say you used interfaces if you didn't, etc), and it should explain the reasons for your object-oriented design. It should explain how you were able to solve some of the harder coding challenges involved as well.
        * 5 points for **clarity**: your explanation should be understandable.
    * 8 points for explaining the smarter strategy.
        * 2 points for **grammar**.
        * 3 points for **comprehensiveness**: your explanation should correctly match what you wrote, explain how the smart strategy works, and how well it does.
        * 3 points for **clarity**: your explanation should be understandable.

Submission
==========

You are to submit the assignment through Replit as usual. The project is due on **Monday, November 27, at 11:59 PM**.

You will be giving a **demo** of your project during the last two weeks of class. This will count as a presentation grade. A rubric for this will be posted on BrightSpace, but it will be based on clarity, your explanation of your design, your smarter strategy, and your code.
