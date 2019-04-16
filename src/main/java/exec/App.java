package exec;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList();
		ArrayList<Disciplina> disciplinas = new ArrayList();
		
		App.adicionarAlunos(alunos);
		App.adicionarDisciplinas(disciplinas);
		
		for(Disciplina disciplina: disciplinas) {
			for(Aluno aluno: alunos) {
				if (disciplinas.indexOf(disciplina) >= alunos.indexOf(aluno)) {
					App.reprovados();
				} else {
					App.aprovados();
				}
			}
		}
		
		for(Aluno aluno: alunos) {
			System.out.println(aluno.getNome());
		}

		for(Disciplina disci: disciplinas) {			
			System.out.println(disci.getNome());
		}
		
		
	}
	
	private static void adicionarAlunos(ArrayList<Aluno> alunos) {
		for(int i = 1; i <= 10; i++) {
			alunos.add(new Aluno(i, "Aluno " + i));
		}
	}
	
	private static void adicionarDisciplinas(ArrayList<Disciplina> disciplinas) {
		for(int i = 1; i <= 5; i++) {
			disciplinas.add(new Disciplina("Disciplina " + i));
		}
	}
	
	private static void aprovados() {
		System.out.println("Aprovou");
	}

	private static void reprovados() {
		System.out.println("Deu bom nao mano");
	}
}
