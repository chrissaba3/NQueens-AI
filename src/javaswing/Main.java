package javaswing;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int numIterations;
        int population;
        double mutationProb;
        int generations;
        Scanner c = new Scanner(System.in);
        System.out.println("Please enter num of queens for Hill Climb and Genetic algorithm. can be from 4 - 15, larger requires more time to compute");
        int nqueen = c.nextInt();
        System.out.println("Please enter number of Max Unstuck iterations for hillClimb; number should be >20 to guarantee solution.");
        numIterations = c.nextInt();
        System.out.println("Please enter population size for Genetic algorithm; >100 or fix generations size");
        population = c.nextInt();
        System.out.println("Please enter number of generations, 20000 is used for examples (guarantees)");
        generations = c.nextInt();
        System.out.println("Please enter probability of mutation, 0 being none, 1 being 100%, enter decimal value.");
        mutationProb = c.nextDouble();


        int[] res = null;
        Queens queenHill = new Queens(nqueen);
        HillClimbing hillClimbing = new HillClimbing();
        int timesStuck = 0;
        int timesSolved = 0;
        for(int i = 0; i < 100; i++) {
            while (res == null) {
                res = hillClimbing.solve(nqueen, numIterations);
                timesStuck++;
            }
            timesSolved++;
        }
        System.out.println("Hill climb success percentage: "+ (double)(timesSolved/timesStuck) + "%");
        queenHill.setTitle("Hill Climb Search with " + nqueen + " queens, and " + numIterations + " number of iterations");
        queenHill.setSquares(res, nqueen);
        queenHill.revalidate();

        int [] resgen = null;
        Queens queenGenetic = new Queens(nqueen);
        GeneticAlgorithm genetic = new GeneticAlgorithm();

        while(resgen == null){
            resgen = genetic.solve(nqueen, population, mutationProb, generations);
        }
        queenGenetic.setTitle("Genetic Search with " + nqueen + " queens, " + population + " population size, with " + generations + " generations");
        queenGenetic.setSquares(resgen, nqueen);

        queenGenetic.revalidate();


    }
}





