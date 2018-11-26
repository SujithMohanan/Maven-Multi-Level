package sujith.childone.util;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	public List<ModelClass> getStudent() {
		return retrieveData();
	}

	private List<ModelClass> retrieveData() {
		List<ModelClass> list = new ArrayList<ModelClass>();
		list.add(new ModelClass(1, "Sujith", "Mohanan"));
		list.add(new ModelClass(2, "Mohammmed", "Jasir"));
		list.add(new ModelClass(3, "Anas", "E A"));
		return list;
	}

}
