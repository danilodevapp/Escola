import java.util.Scanner;
import java.util.Locale;

public class Escola {   
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        alunos alunos = new alunos();

        System.out.println("Digite o nome do aluno: ");
        alunos.NomeAluno = scanner.nextLine();
        System.out.println("");

        System.out.println("Digite o sobrenome do aluno: ");
        alunos.SobreNomeAluno = scanner.nextLine();
        System.out.println("");

        System.out.println("Digite o curso correspondente: ");
        alunos.CursoAluno = scanner.nextLine();
        System.out.println("");

        System.out.println("Digite a matrícula com o dígito: ");
        alunos.MatriculaAluno = scanner.nextLine();
        System.out.println("");

        String mostrarResultadoAluno = alunos.MostrarAluno(null, null, null, null);
        System.out.println(mostrarResultadoAluno);
        System.out.println("");

        System.out.println("Digite a primeira nota do aluno: ");
        alunos.Nota01 = scanner.nextDouble();
        System.out.println("");

        System.out.println("Digite a segunda nota do aluno: ");
        alunos.Nota02 = scanner.nextDouble();
        System.out.println("");

        System.out.println("Digite a terceira nota do aluno: ");
        alunos.Nota03 = scanner.nextDouble();
        System.out.println("");

        alunos.MostrarMedia(0, 0, 0);
        System.out.println("A média do aluno é: " + alunos.Media);

    }
}

