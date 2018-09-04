import java.util.Random;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Quiz {

	protected String filename = null;
	protected ArrayList<Question> questions = null;
	protected ArrayList<Question> selectedQuestions = null;
	protected ArrayList<Integer> numberList = null;
	
	/**
	 *ALGORITHM CreateQuiz(num studentNum, num numberQuestions)
	 *BEGIN
	 *	FOR M=0 to numberQuestions-1
	 *	BEGIN
	 *		num number = RandomNumber(0..9)
	 *		
	 *		Question = getQuestion(number);
	 *	END
	 *	
	 *	return Question
	 * END
	 */
	 
	public Quiz() {
		questions = new ArrayList<Question>();
		selectedQuestions = new ArrayList<Question>();
		numberList = new ArrayList<Integer>();
	}
	 
	protected boolean found(int number) {
		int count = numberList.size();
		
		for(int index = 0; index < count; index++) {
			if(numberList.get(index) == number) {
				return true;
			}
		}
		return false;
	}
	 
	public int CreateQuiz(int studentNum, int numberQuestions, String filename) {
		DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println("Java Quiz On " + df.format(dateobj));
		System.out.println();
		

		this.filename = filename;
		
		int retVal = loadQuestions(filename);
		
		if(retVal < 0) {
			return retVal;
		}
		
		Random rand = new Random();
		
		int count = questions.size();
		
		if(count <= 0) {
			System.out.println("No questions found in file");
			return -1;
		}
		
		for(int index = 0; index < numberQuestions; index++) {
			int number = rand.nextInt(count - 1);
			
			if(!found(number)) {
				numberList.add(number);
			}
			
			Question question = questions.get(number);
			selectedQuestions.add(question);
		}
	
		return 0;
	}

	public int listQuizQuestions() {
		int count = selectedQuestions.size();
	
		for(int index = 0; index < count; index++) {
			Question question =  selectedQuestions.get(index);
		
			if(question != null) {
			
				System.out.print(index+1 + ". ");
				System.out.print(question.getQuestion());
				System.out.println();
				
				int numQuestions = question.numAnswers();
	
				System.out.println("Answers");
				System.out.println();

		
				for(int jindex = 0; jindex < numQuestions; jindex++) {
					System.out.println(question.getSelectedAnswer(jindex));
				
				}
				
				System.out.println();
			}
		}
		System.out.println("====================================DONE!======================================");
		
		return 0;		
	}

		
	int loadQuestions(String filename) {
		Scanner scan = null;
		FileInputStream in = null;
		String quest = null;
		boolean done = false;
		Question qu = null;
		
		try {
			File file = new File(filename);
			
			
			if(!file.exists() || file.isDirectory()) { 
				System.out.println("File " + filename + " does not exist");
				return -1;
			}
			else {
				file = null;
			}
			
			in = new FileInputStream(filename);
			
			scan = new Scanner(in);
		
			quest = getQuestions(scan,in);
		}
		catch(FileNotFoundException except) {
			System.out.println(except.getMessage());
		}
		
		try {
			if (in != null) {
				in.close();
			}
		}
		catch(Exception except) {
			System.out.println(except.getMessage());
		}
				
		return 0;
	}
	
	public int listAllQuestions() {
		int count = questions.size();
		
		for(int index = 0; index < count; index++) {
			Question question = questions.get(index);
		
			if(question != null) {
				System.out.print(index+1 + ". ");
				System.out.print(question.getQuestion());
				System.out.println();
				System.out.println();
			}
		}
		
		return 0;
	}
	
	
	protected int getAnswers(String answer, Question qu) {
		String[] answers = answer.split(",");
		int arraySize = answers.length;
	
		int length = answers[0].length();

		String answer1 = answers[0].substring(1,length);

		String answerLast = answers[arraySize-1];

		int lastCharLoc = answerLast.length()-1;

		answerLast = answerLast.substring(0,lastCharLoc);

		for(int index = 0; index < arraySize; index++) {
			if(index == 0) {
				qu.addAnswer(0,answer1);	
			}
			else
			if(index == arraySize-1) {
				qu.addAnswer(0,answerLast);
			}
			else {
				qu.addAnswer(0,answers[index]);
			}
		}
		
		return 0;	
	}

	protected String getQuestions(Scanner scan, FileInputStream in) {
		StringBuilder question = null;  
		String quest = null;
		Question qu = new Question();
		
		while(scan.hasNextLine()) {
			quest = scan.nextLine();
	
			if(quest.equals("<<")) {
				question = new StringBuilder(""); 
			}
			else
			//Check for END of Question
			if(quest.equals(">>")) {
				//Done
			}
			else 
			if(quest.indexOf('%') == 0) {
				String answerLine = quest;
				quest = question.toString();
				
				qu = new Question(quest);
				getAnswers(answerLine,qu);
				questions.add(qu);
			}
			else {
				question.append(quest);
				question.append("\n");
			}
		}
		
		return quest;
	}
}

