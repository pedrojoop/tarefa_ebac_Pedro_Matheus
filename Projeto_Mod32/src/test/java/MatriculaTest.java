package test.java;

import Main.java.dao.IMatriculaDAO;
import Main.java.dao.MatriculaDAO;
import Main.java.domain.Matricula;
import org.junit.Test;
import java.time.Instant;

import static org.junit.Assert.assertNotNull;

/**
 * @author pmpedrolima@gmail.com
 */
public class MatriculaTest {

    private IMatriculaDAO matriculaDAO;

    public MatriculaTest() {
        matriculaDAO = new MatriculaDAO();
    }

    @Test
    public void cadastrar() {
        Matricula mat = new Matricula();
        mat.setCodigo("123");
        mat.setDataMatricula(Instant.now());
        mat.setValor(2000d);
        mat.setStatus("ATIVA");
        matriculaDAO.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());
    }

    @Test
    public void buscarPorCodigo() {
        Matricula mat = new Matricula();
        mat.setCodigo("123");
        mat.setDataMatricula(Instant.now());
        mat.setValor(2000d);
        mat.setStatus("ATIVA");
        matriculaDAO.cadastrar(mat);

        Matricula mat2 = matriculaDAO.buscarPorCodigo(mat.getCodigo());

        assertNotNull(mat2);
        assertNotNull(mat2.getId());
    }

    @Test
    public void atualizarMatricula() {
        Matricula mat = new Matricula();
        mat.setCodigo("123");
        mat.setDataMatricula(Instant.now());
        mat.setValor(2000d);
        mat.setStatus("ATIVA");
        matriculaDAO.cadastrar(mat);

        Matricula mat2 = matriculaDAO.buscarPorCodigo(mat.getCodigo());

        mat2.setStatus("INATIVA");
        matriculaDAO.atualizarMatricula(mat2);

        Matricula mat3 = matriculaDAO.buscarPorCodigo(mat.getCodigo());

        assertNotNull(mat3);
        assertNotNull(mat3.getId());
    }

    @Test
    public void excluirMatricula() {
        Matricula mat = new Matricula();
        mat.setCodigo("123");
        mat.setDataMatricula(Instant.now());
        mat.setValor(2000d);
        mat.setStatus("ATIVA");
        matriculaDAO.cadastrar(mat);

        Matricula mat2 = matriculaDAO.buscarPorCodigo(mat.getCodigo());

        matriculaDAO.excluirMatricula(mat2);

        Matricula mat3 = matriculaDAO.buscarPorCodigo(mat.getCodigo());

        assertNotNull(mat3);
        assertNotNull(mat3.getId());
    }
}
