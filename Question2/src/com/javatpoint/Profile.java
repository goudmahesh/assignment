package com.javatpoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class Profile {

	private static final String FILENAME = "resume.txt";
	private String outPut;

	public String getOutPut() {
		return outPut;
	}

	public void setOutPut(String outPut) {
		this.outPut = outPut;
	}

	public String execute() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		String s = (String) session.getAttribute("login");
		outPut = "";
		if (s != null && !s.equals("")) {
			try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

				String sCurrentLine;

				while ((sCurrentLine = br.readLine()) != null) {
					System.out.println(sCurrentLine);
					outPut += sCurrentLine;
					outPut += "\n";
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			return "success";
		} else {
			return "error";
		}

	}
}