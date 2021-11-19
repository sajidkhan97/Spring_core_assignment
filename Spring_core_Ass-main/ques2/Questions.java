package springs.ques2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Questions {
	private String quesId;
	private String question;
	 private List<String> answer1; 
	 private Set<String> answer;
	 private Map<Integer,String> answer2;
	 
	public Map<Integer, String> getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Map<Integer, String> answer2) {
		this.answer2 = answer2;
	}
	public List<String> getAnswer1() {
		return answer1;
	}
	public void setAnswer1(List<String> answer1) {
		this.answer1 = answer1;
	}
	
	public String getQuesId() {
		return quesId;
	}
	public void setQuesId(String quesId) {
		this.quesId = quesId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	/* */
	
	public Set<String> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}
	void disp()
	{
		System.out.println(" Question Id : "+getQuesId());
		System.out.println(" Question : "+getQuestion());
		System.out.println(" Answers : "+getAnswer2());
	}	
	

}
