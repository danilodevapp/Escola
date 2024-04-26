public class alunos {
    public String NomeAluno, SobreNomeAluno, CursoAluno, MatriculaAluno;
    public double Nota01, Nota02, Nota03, Media;

    public String MostrarAluno (String nomeAluno, String sobrenomeAluno, 
            String cursoAluno, String matriculaAluno) {

        nomeAluno = NomeAluno;
        sobrenomeAluno = SobreNomeAluno;
        cursoAluno = CursoAluno;
        matriculaAluno = MatriculaAluno;

        return "Nome do Aluno: " + nomeAluno + " - Sobrenome: " + sobrenomeAluno +
                " - Curso: " + cursoAluno + " - Matrícula: " + matriculaAluno;

    }
    
    public void MostrarMedia(double nota01, double nota02, double nota03) {

        nota01 = Nota01;
        nota02 = Nota02;
        nota03 = Nota03;
        
        Media = (nota01 + nota02 + nota03) / 3;
    }
}
