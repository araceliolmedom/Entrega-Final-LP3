package py.edu.uc.lp3.users;

import javax.persistence.Entity;

@Entity

public class Brainstormer extends Usuario {
	String idea;

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

}
