# Assignment 35

For this assignment you will create a program to simulate volleyball and racquetball matches. The simulation of matches will be done using recursion.

Using the structure discussed in class and given in the skeleton given on Github, complete the program to perform a full simulation.
See the starter code on Github for specific directions.

### Game Outline

General outline of a Volleyball or Racquetball game:

Serve

if server wins volley

&nbsp;&nbsp;&nbsp;&nbsp;score a point

&nbsp;&nbsp;&nbsp;&nbsp;if server wins game

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;report winner

&nbsp;&nbsp;&nbsp;&nbsp;else

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;server serves again

else

&nbsp;&nbsp;&nbsp;&nbsp;other team serves

#### Important Notes for Grading

1. Your code must use two classes.
2. Your code must throw an error when the user inputs information incorrectly. 
    -Must only take "volleyball" or "racquetball".
    -Probability must be between 0 and 1.
    -Number of simulations > 0.
3. Your code must print the winner of each game and give a win percentage at the end (as shown in the sample outputs)..

### Sample Outputs

```
What game are you simulating? volleyball
What is the probability that team A wins a volley? .5
How many simulations would you like to run? 10


Run 10 simulations with 0.5 probability:

Game 1 winner: A
Game 2 winner: B
Game 3 winner: B
Game 4 winner: B
Game 5 winner: A
Game 6 winner: A
Game 7 winner: A
Game 8 winner: B
Game 9 winner: B
Game 10 winner: A

Team A wins: 5/10 = 0.5
```

```
What game are you simulating? volleyball
What is the probability that team A wins a volley? .6
How many simulations would you like to run? 10


Run 10 simulations with 0.6 probability:

Game 1 winner: A
Game 2 winner: A
Game 3 winner: A
Game 4 winner: A
Game 5 winner: A
Game 6 winner: A
Game 7 winner: A
Game 8 winner: B
Game 9 winner: A
Game 10 winner: A

Team A wins: 9/10 = 0.9
```

```
What game are you simulating? racquetball
What is the probability that team A wins a volley? .55
How many simulations would you like to run? 1000


Run 1000 simulations with 0.55 probability:

Game 1 winner: B
Game 2 winner: A
Game 3 winner: A
Game 4 winner: A
Game 5 winner: A

...

Game 995 winner: B
Game 996 winner: B
Game 997 winner: A
Game 998 winner: B
Game 999 winner: A
Game 1000 winner: B

Team A wins: 798/1000 = 0.798
```

### Grading

Please make sure you have comments for every method you create. As always, your program will be graded on its functionality according to the project specifications and proper code style.

