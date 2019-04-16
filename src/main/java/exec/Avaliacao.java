package exec;

public class Avaliacao {

	private Aluno aluno;
	private Disciplina disciplina;
	private float nota;
	
	public Avaliacao(Aluno aluno, Disciplina disciplina, float nota) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = nota;
	}
	
	public float getNota() {
		return nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}
	
}
