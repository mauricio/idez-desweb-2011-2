package br.com.faculdadeidez.java.pagamentos;

public class Transacao {

	private long id;
	private Status status;
	
	public Transacao(long id, Status status) {
		this.id = id;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
