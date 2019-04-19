package exec;

import java.util.ArrayList;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList();
		ArrayList<Disciplina> disciplinas = new ArrayList();
		
		App.adicionarAlunos(alunos);
		App.adicionarDisciplinas(disciplinas);
		
		for(Disciplina disciplina: disciplinas) {
			System.out.println("--------------------------------------");
			System.out.println(disciplina.getNome());
			for(Aluno aluno: alunos) {
				System.out.println(" " + aluno.getNome());
				if (disciplinas.indexOf(disciplina) >= alunos.indexOf(aluno)) {
					System.out.println("   " + "REPROVADO: ");
					App.reprovados(disciplina, aluno);
				} else {
					System.out.println("   " + "APROVADO: " );
					App.aprovados(disciplina, aluno);
				}
			}
		}
	}

	private static void aprovados(Disciplina disciplina, Aluno aluno) {
		for(int i = 0; i < 4; i++) {
			Random r = new Random();
			int nota = r.nextInt((10 - 6) + 1) + 6;
			Avaliacao avaliacao = new Avaliacao(aluno, disciplina, nota);
			System.out.println("    " + "Nota do bimestre " + (i+1) + ": " + nota);
		}
		
	}

	private static void reprovados(Disciplina disciplina, Aluno aluno) {
		for(int i = 0; i < 4; i++) {
			Random r = new Random();
			int nota = r.nextInt((6 - 0) + 1) + 0;
			Avaliacao avaliacao = new Avaliacao(aluno, disciplina, nota);
			System.out.println("    " + "Nota do bimestre " + (i+1) + ": " + nota);
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
	
}
