import java.util.ArrayList;

public class Question {
	protected String question;
	protected int questionID;
	
	protected ArrayList<String> answers = null;
	
	public Question() {
		answers = new ArrayList<String>();
	}
	
	public Question(String question) {
		answers = new ArrayList<String>();
		this.question = question;
	}
	
	public String getQuestion() {
		return this.question;
	}
	

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getQuestionID(String question) {
		int id = findQuestion(question);
		
		return id;
	}
	
	public int numAnswers() {
		return answers.size();
	}
	
	
	public String getSelectedAnswer(int index) {
		return answers.get(index);
	}
		
	public int addAnswer(int questionID, String answer) {
		answers.add(answer);
	
		return 0;
	}
	
	protected int findQuestion(String question) {
		for(int index = 0; index < answers.size(); index++) {
			if(answers.get(index).equals(question)) {
				return -1;
			}
		}
		return -1;
	}
	
	public ArrayList<String> getAnswers() {
		return answers;
	}
	
}
