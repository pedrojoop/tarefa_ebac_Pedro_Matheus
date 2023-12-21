package test.java;


import Main.java.dao.CursoDAO;
import Main.java.dao.ICursoDAO;
import Main.java.domain.Curso;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author pmpedrolima@gmail.com
 */
public class CursoTest {

    private ICursoDAO cursoDAO;

    public CursoTest() {
        cursoDAO = new CursoDAO();
    }

    @Test
    public void cadastrar() {

        Curso curso = new Curso();
        curso.setNome("Curso Java Back-end");
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE");

        curso = cursoDAO.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }

    @Test
    public void buscarPorCodigo() {

        Curso curso = new Curso();
        curso.setNome("Curso Java Back-end");
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE");

        curso = cursoDAO.cadastrar(curso);

        Curso busca = cursoDAO.buscarPorCodigo(curso.getCodigo());

        assertNotNull(busca);
        assertNotNull(busca.getId());
    }

    @Test
    public void excluirCurso() {

        Curso curso = new Curso();
        curso.setNome("Curso Java Back-end");
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE");

        curso = cursoDAO.cadastrar(curso);

        String retorno = cursoDAO.excluirCurso(curso);

        assertNotNull(retorno);
    }
}
