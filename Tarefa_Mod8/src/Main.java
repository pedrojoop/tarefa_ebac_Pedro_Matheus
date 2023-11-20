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
        nota.setNota4(5);


        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("De matricula " + aluno.getMatricula());
        System.out.println("Atingiu média de: " + nota.getMedia());

        if (nota.getMedia() >= 6.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        System.out.println("*********************************************");

        Alunos aluno2 = new Alunos();
        aluno2.setMatricula(211001);
        aluno2.setNome("João");

        Notas nota2 = new Notas();
        nota2.setNota1(10);
        nota2.setNota2(8);
        nota2.setNota3(9);
        nota2.setNota4(8);

        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("De matricula " + aluno2.getMatricula());
        System.out.println("Atingiu média de: " + nota2.getMedia());

        if (nota2.getMedia() >= 6.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }


    }
}
