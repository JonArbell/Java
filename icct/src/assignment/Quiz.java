package assignment;

import java.util.Scanner;

public class Quiz {
    static boolean askQuestion(String question, String correctAnswer) {
        Scanner s = new Scanner(System.in);
        System.out.println(question);
        System.out.print("Your answer: ");
        String userAnswer = s.nextLine().toUpperCase();
                                                                                                                    /*Assignment 08
                                                                                                                    code by Jon Arbell De Ocampo
                                                                                                                    November 5, 2023*/
        while (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C")) {
            System.out.println("Invalid input.");
            System.out.print("Your answer: ");
            userAnswer = s.nextLine().toUpperCase();
        }

        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect! The correct answer is letter " + correctAnswer + ".");
            return false;
        }
    }

    public static void main(String[] args) {

        int score = 10;

        String[] questions = {
                "1) What is the largest planet in our solar system?\nA. Earth\n" +
                        "B. Mars\n" +
                        "C. Jupiter",
                "2) Which famous telescope was launched into space in 1990 and has provided stunning images of the universe?\nA. Hubble Space Telescope\n" +
                        "B. Kepler Space Telescope\n" +
                        "C. James Webb Space Telescope",
                "3) Which celestial object is often called the \"Red Planet\"?\nA. Venus\n" +
                        "B. Mercury\n" +
                        "C. Mars",
                "4) What is the term for a natural light display in the Earth's sky, typically seen in high-latitude regions?\nA. Solar eclipse\n" +
                        "B. Aurora borealis (Northern Lights)\n" +
                        "C. Meteor shower",
                "5) Which astronaut was the first human to set foot on the Moon in 1969?\nA. John Glenn\n" +
                        "B. Neil Armstrong\n" +
                        "C. Yuri Gagarin",
                "6) What is the process by which a star transforms into a massive explosion, releasing a tremendous amount of energy and light?\nA. Black hole formation\n" +
                        "B. Supernova\n" +
                        "C. Solar flares",
                "7) Which of the following is not a moon of Jupiter?\nA. Europa\n" +
                        "B. Titan\n" +
                        "C. Ganymede",
                "8) What is the name of the largest volcano in our solar system, located on Mars?\nA. Olympus Mons\n" +
                        "B. Mount Vesuvius\n" +
                        "C. Mount Kilimanjaro",
                "9) Which famous comet, known for its periodic returns to the inner solar system, was last seen in 1986 and will return in 2061?\nA. Comet Hale-Bopp\n" +
                        "B. Comet Halley\n" +
                        "C. Comet NEOWISE",
                "10) What is the term for a group of stars that forms a recognizable pattern in the night sky?\nA. Galaxy\n" +
                        "B. Constellation\n" +
                        "C. Nebula"};

        String[] answers = {
                "C",
                "A",
                "C",
                "B",
                "B",
                "B",
                "B",
                "A",
                "B",
                "B"
        };

        for(int i = 0; i < questions.length;i++){
            if(askQuestion(questions[i],answers[i])){

            } else {
                score--;
            }
        }

        int incorrectAns = 10-score;
        System.out.println("Score: "+score);
        System.out.println("Incorrect answers: "+incorrectAns);







//        int score = 5;
//        String ans;
//        System.out.println("\n1) What is the primary objective of the hobby of gardening?\na) To breed exotic animals\nb) To cultivate and grow plants\nc) To build model airplanes\nd) To solve mathematical puzzles");
//        System.out.print("Your answer: ");
//        ans = s.nextLine();
//        if(ans.matches("[aA-dD]")){
//
//            if(ans.equalsIgnoreCase("b")){
//                System.out.println("You're correct!");
//            }else {
//                System.out.println("Incorrect. The correct answer is b) To cultivate and grow plants");
//                score--;
//            }
//
//        }else {
//            System.out.println("Invalid Input");
//            score--;
//        }
//
//        System.out.println("\n2) Which of these artists is known as the \"King of Pop\"?\na) Elvis Presley\nb) Michael Jackson\nc) Bob Marley\nd) Fransis Magalona");
//        System.out.print("Your answer: ");
//        ans = s.nextLine();
//        if(ans.matches("[aA-dD]")){
//
//            if(ans.equalsIgnoreCase("b")){
//                System.out.println("You're correct!");
//            }else {
//                System.out.println("Incorrect. The correct answer is b) Michael Jackson");
//                score--;
//            }
//
//        }else {
//            System.out.println("Invalid Input");
//            score--;
//        }
//
//        System.out.println("\n3) What is the largest planet in our solar system?\na) Mars\nb) Earth\nc) Saturn\nd) Jupiter\n");
//        System.out.print("Your answer: ");
//        ans = s.nextLine();
//        if(ans.matches("[aA-dD]")){
//
//            if(ans.equalsIgnoreCase("d")){
//                System.out.println("You're correct!");
//            }else {
//                System.out.println("Incorrect. The correct answer is d) Jupiter");
//                score--;
//            }
//        }else {
//            System.out.println("Invalid Input");
//            score--;
//        }
//
//        System.out.println("\n4) What popular TV series is set in the fictional world of Westeros and Essos and is based on a book series by George R.R. Martin?\na) Breaking Bad\nb) The Walking Dead\nc) Game of Thrones\nd) Friends");
//        System.out.print("Your answer: ");
//        ans = s.nextLine();
//        if(ans.matches("[aA-dD]")){
//
//            if(ans.equalsIgnoreCase("c")){
//                System.out.println("You're correct!");
//            }else {
//                System.out.println("Incorrect. The correct answer is c) Game of Thrones");
//                score--;
//            }
//        }else {
//            System.out.println("Invalid Input");
//            score--;
//        }
//
//        System.out.println("\n5) In the world of photography, what does the acronym \"DSLR\" stand for?\na) Digital Single-Lens Reflector\nb) Dynamic Shutter Light Response\nc) Direct Shutter Lens Reflex\nd) Dual Sensor Light Reducer");
//        System.out.print("Your answer: ");
//        ans = s.nextLine();
//        if(ans.matches("[aA-dD]")){
//
//            if(ans.equalsIgnoreCase("a")){
//                System.out.println("You're correct!");
//            }else {
//                System.out.println("Incorrect. The correct answer is a) Digital Single-Lens Reflector");
//                score--;
//            }
//        }else {
//            System.out.println("Invalid Input");
//            score--;
//        }
//
//        double percentage = ((double) score/5)*100;
//        int incorrect = 5-score;
//
//        System.out.println("Correct answers: "+score+"\nIncrrect Answers: "+incorrect+"\nAverage: "+percentage);

    }
}
