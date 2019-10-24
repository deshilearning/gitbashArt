package com.gitbash.gitbashArt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class GitbashArtApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitbashArtApplication.class, args);
	}

	@GetMapping("/name")
	public String getName() {
		return "Desh Deepak";
	}
	
	@GetMapping("/question")
	public Question getQuestion() {
		return new Question("LongAns", "1", "20", "What are the standard proc for Heroku?");
	}
	
	@GetMapping("/address")
	public String getAddress() {
		return "Arvind, bangalore";
	}
	
}

class Question{
	private String qType;
	private String qNum;
	private String qMarks;
	private String qContent;
	public Question(String qType, String qNum, String qMarks, String qContent) {
		super();
		this.qType = qType;
		this.qNum = qNum;
		this.qMarks = qMarks;
		this.qContent = qContent;
	}
	public String getqType() {
		return qType;
	}
	public void setqType(String qType) {
		this.qType = qType;
	}
	public String getqNum() {
		return qNum;
	}
	public void setqNum(String qNum) {
		this.qNum = qNum;
	}
	public String getqMarks() {
		return qMarks;
	}
	public void setqMarks(String qMarks) {
		this.qMarks = qMarks;
	}
	public String getqContent() {
		return qContent;
	}
	public void setqContent(String qContent) {
		this.qContent = qContent;
	}
}