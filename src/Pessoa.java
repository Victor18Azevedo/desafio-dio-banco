
public abstract class Pessoa {
	protected String nome;
	protected String sexo;
	protected int anoNascimento;
	protected byte mesNascimento;
	protected byte diaNascimento;
	protected String cpf;
	protected String nacionalidade;
	protected String natruralidade;
	protected String telefone;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public byte getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(byte mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public byte getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(byte diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNatruralidade() {
		return natruralidade;
	}

	public void setNatruralidade(String natruralidade) {
		this.natruralidade = natruralidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}