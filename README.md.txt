*******************************
Chris Saba
Class: CS4200 Artificial Intelligence
Project 2 -N Queens-

Description: N-Queens is a game whos goal is to place an N amount of queens on a board NxN, where queens are
not allowed to attack each other. There are multiple solutions for n=8, 92 to be exact.

Class descriptions:
Main.java: The main class/driver program, which takes input for the algorithms, and calculates the accuracy of HillClimbing, as well as run
both algorithms.

Queens.java: This class implements the board, sets up a GUI for a board, and places queens in the locations that are calculated by HillClimbing,
as well as GeneticAlgorithm.

SolverUtils.java: This is a small helper class for the algorithms, which allows states to be randomized, for HillClimbing, this would be
where a search gets stuck on a local maximum that isnt a solution. This also generates a Heuristic cost for the algorithms, whos function is if
two queens are in the same row, col, or diagonal; will increase the cost.

HillClimbing.java: This class implements the Hill Climb algorithm, using max iterations, and the heuristic function to move "up the hill" and will
go to a new random state if the hilltop isn't a solution.

GeneticAlgorithm.java: Using the Heuristic function, we are utilizing this to generate our Fitness function. This class will select the best from a population,
apply the fitness function, cross-over with the best fitness, and attempt a chance at mutation for variety. In order to guarantee a solution, it is best
to choose a high amount of generations, >20000, as this is the fastest way to guarantee a solution above 8 queens.

*****************************************************************
In order to run this program, you must first import the whole project with all the .java files in the javaswing folder, under src.

Before running the program, if you have already done so, you may see that there are no queens on the board.
This is fixed by changing the location of the queen.jpg file under Queens.java line 46.
This is a file path name, and will require a format like "C:\Users\Chris\Desktop\queen.jpg" for example, if my queen icon was on the desktop.