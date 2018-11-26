package sujith.childtwo.util;

import com.google.gson.Gson;

import sujith.childone.util.StudentDAO;

public class StudentRepo {

	public static void main(String[] args) {
		StudentDAO obj = new StudentDAO();
		Gson gson = new Gson();
		System.out.println(gson.toJson(obj.getStudent()));
	}

}
