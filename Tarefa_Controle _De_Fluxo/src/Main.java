/*
 * @author pmpedrolima@gmail.com
 */
public class Main {
        public static void main(String[] args) {
            Alunos aluno = new Alunos();
            aluno.setNome("Pedro");
            aluno.setMatricula(211001);

            Notas nota = new Notas();
            nota.setNota1(7);
            nota.setNota2(2);
            nota.setNota3(4);
            nota.setNota4(8);


            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("De matricula " + aluno.getMatricula());
            System.out.println("Atingiu média de: " + nota.getMedia());

            if (nota.getMedia() >= 7.0) {
                System.out.println("Aluno aprovado");
            } else if (nota.getMedia() >= 5.0 && nota.getMedia() < 7.0) {
                System.out.println("Aluno em recuperação");
            } else {
                System.out.println("Aluno reprovado");
            }
        }
}
