import java.util.*;

public class QuizGenerator {
	public static void main(String[] args) {
		//String filename = "D:\\Users\\dchurch\\Desktop\\QuizQuestions.txt";
		String filename = null;
		
		if(args.length == 2) {
			if(args[0].equals("-f")) {
				filename = args[1];
			}
			else {
				printUsage();
				System.exit(-1);
				
			}
		}
		else {
			printUsage();
			System.exit(-1);
		}
		
		Quiz quiz = new Quiz();
		
		
		quiz.CreateQuiz(30,10,filename);
		
		//quiz.listAllQuestions();
		
		quiz.listQuizQuestions();
		
	}

	public static void printUsage() {
		System.out.println("Usage : java QuizGenerator -f filename");
	}
}