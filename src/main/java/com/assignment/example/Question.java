package com.assignment.example;

import java.util.List;
import java.util.Iterator;

public class Question {
	private int questionId;
	private String question;
	private List<String> answers;

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(questionId + " " + question);
		System.out.println("answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
