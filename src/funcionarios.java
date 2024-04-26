public class funcionarios {
    
    public String NomeFuncionario, SobrenomeFuncionario, SetorFuncionario, MatriculaFuncionario;

    public String MostrarFuncionario (String nomeFuncionario, String sobrenomeFuncionario, 
            String setorFuncionario, String matriculaFuncionario) {
        
        nomeFuncionario = NomeFuncionario;
        sobrenomeFuncionario = SobrenomeFuncionario;
        setorFuncionario = SetorFuncionario;
        matriculaFuncionario = MatriculaFuncionario;
    
        return "Nome do Funcionário: " + nomeFuncionario + " - Sobrenome: " + sobrenomeFuncionario +
                " - Setor: " + setorFuncionario + " - Matricula: " + matriculaFuncionario;

    }
}
