package Main.java.dao;

import Main.java.domain.Curso;

/**
 * @author pmpedrolima@gmail.com
 */
public interface ICursoDAO {
    Curso cadastrar(Curso curso);

    Curso buscarPorCodigo(String codigo);

    String excluirCurso(Curso curso);

    Curso atualizarCurso(Curso curso);
}
