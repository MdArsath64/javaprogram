package Codesoft;
//Quiz Application with Timer
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
//class quiz
    public class QuizApplication{
    private String question;
    private String[] options;
    private int correctAnswer;

    public QuizApplication(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
//class QuizApp
   class QuizApp {
    private QuizApplication[] quizzes;
    private int score;
    private int currentQuestionIndex;
    private Scanner scanner;

    public QuizApp(QuizApplication[] quizzes) {
        this.quizzes = quizzes;
        this.score = 0;
        this.currentQuestionIndex = 0;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        for (currentQuestionIndex = 0; currentQuestionIndex < quizzes.length; currentQuestionIndex++) {
            QuizApplication quiz = quizzes[currentQuestionIndex];
            displayQuestion(quiz);
            startTimer(10); // 10 seconds per question
            int userAnswer = getUserAnswer();
            checkAnswer(userAnswer, quiz);
        }
        displayResult();
    }

    private void displayQuestion(QuizApplication quiz) {
        System.out.println("Question " + (currentQuestionIndex + 1) + ": " + quiz.getQuestion());
        String[] options = quiz.getOptions();
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]);
        }
    }

    private void startTimer(int seconds) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up!");
                System.exit(0);
            }
        }, seconds * 1000);
    }

    private int getUserAnswer() {
        System.out.println("Enter your answer (1-4):");
        int answer = scanner.nextInt();
        return answer - 1; // Adjust for 0-based index
    }

    private void checkAnswer(int userAnswer, QuizApplication quiz) {
        if (userAnswer == quiz.getCorrectAnswer()) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer was: " + (quiz.getCorrectAnswer() + 1));
        }
        System.out.println();
    }

    private void displayResult() {
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score + "/" + quizzes.length);
    }
//main method
    public static void main(String[] args) {
        QuizApplication[] quizzes = {
            new QuizApplication("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2),
            new QuizApplication("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 1),
            new QuizApplication("What is the largest ocean on Earth?", new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"}, 3)
        };
        QuizApp quizApp = new QuizApp(quizzes);
        quizApp.start();
    }
}