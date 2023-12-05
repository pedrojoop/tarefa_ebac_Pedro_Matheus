import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SepararTest {

    @Test
    void testSomenteMulheres() {
        List<Pessoa> mulheres = List.of(
                new Pessoa("Luciana", "-f"),
                new Pessoa("Joana", "-f")
        );

        assertTrue(somenteMulheres(mulheres));
    }

    @Test
    void testNaoSomenteMulheres() {
        List<Pessoa> pessoas = List.of(
                new Pessoa("Pedro", "-m"),
                new Pessoa("Luciana", "-f"),
                new Pessoa("Joana", "-f"),
                new Pessoa("João", "-m")
        );

        assertFalse(somenteMulheres(pessoas));
    }

    private boolean somenteMulheres(List<Pessoa> pessoas) {
        return pessoas.stream().allMatch(p -> p.getGenero().equalsIgnoreCase("-f"));
    }
}