package Main.java.dao;

import Main.java.domain.Matricula;

public interface IMatriculaDAO {

    Matricula cadastrar(Matricula mat);

    Matricula buscarPorCodigo(String codigo);

    Matricula atualizarMatricula(Matricula mat);

    String excluirMatricula(Matricula mat);
}
