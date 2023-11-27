package br.com.pedro;

import br.com.pedro.dao.IClienteDAO;
import br.com.pedro.domain.Cliente;
import br.com.pedro.dao.ClienteMapDAO;

import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null
                , "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração e 5 para sair"
                , "Green dinner", JOptionPane.INFORMATION_MESSAGE);


        while(!isOpcaoValida(opcao)) {
            if("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null
                    , "opção inválida digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração e 5 para sair"
                    , "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while(isOpcaoValida(opcao)) {
            if(isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null
                        , "Digite os dados do cliente separados por vírgula, conforme o exemplo: Nome, CPF, Telefone, cidade, estado e endereço" + opcao
                        , "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null
                        , "Digite o CPF: "
                        , "Consultar", JOptionPane.INFORMATION_MESSAGE);

                consultar(dados);
            } else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null
                        , "Digite os novos dados do cliente separados por vírgula: Nome, CPF, Telefone, cidade, estado e endereço"
                        , "Alteração", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            } else if (isExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null
                        , "Digite o CPF do cliente a ser excluído: "
                        , "Exclusão", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            }
            opcao = JOptionPane.showInputDialog(null
                    , "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração e 5 para sair"
                    , "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        if (isOpcaoCadastro(opcao)) {
            JOptionPane.showInputDialog(null
                    , "Opçao: " + opcao, "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        // validar se foi passado somente cpf
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (isNumeric(dados)) {
            long cpf = Long.parseLong(dados);
            iClienteDAO.consultar(cpf);
        } else {
            JOptionPane.showMessageDialog(null, "Dados passados não são compatíves com CPF");
        }
        if(cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente Encontrado" + cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }

    }

    private static boolean isNumeric(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isConsultar(String opcao) {
        return "2".equals(opcao);
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");

        // Validar se há dados suficientes para criar um cliente
        if (dadosSeparados.length <= 5) {
            JOptionPane.showMessageDialog(null,"Dados insuficientes para cadastrar um cliente");
            throw new IllegalArgumentException("Dados insuficientes para cadastrar um cliente");
        }

        try {
            Cliente cliente = new Cliente(
                    dadosSeparados[0].trim(),          // Nome
                    Long.parseLong(dadosSeparados[1].trim()),   // CPF
                    Long.parseLong(dadosSeparados[2].trim()),   // Telefone
                    dadosSeparados[3].trim(),          // Endereço
                    dadosSeparados[4].trim(),          // Cidade
                    dadosSeparados[5].trim()           // Estado
            );

            boolean isCadastrado = iClienteDAO.cadastrar(cliente);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Erro ao converter dados numéricos");
            throw new IllegalArgumentException("Erro ao converter dados numéricos");
        }

        if (dadosSeparados.length < 7) {
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso");
        }
    }

    private static boolean isCadastro(String opcao) {
        return "1".equals(opcao);
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null
                , "Até logo"
                , "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
    }

    private static boolean isOpcaoCadastro(String opcao) {
        return "1".equals(opcao);
    }

    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");

        // Validar se há dados suficientes para alterar um cliente
        if (dadosSeparados.length <= 5) {
            JOptionPane.showMessageDialog(null,"Dados insuficientes para alterar um cliente");
            throw new IllegalArgumentException("Dados insuficientes para alterar um cliente");
        }

        try {
            Cliente novoCliente = new Cliente(
                    dadosSeparados[0].trim(),          // Nome
                    Long.parseLong(dadosSeparados[1].trim()),   // CPF
                    Long.parseLong(dadosSeparados[2].trim()),   // Telefone
                    dadosSeparados[3].trim(),          // Endereço
                    dadosSeparados[4].trim(),          // Cidade
                    dadosSeparados[5].trim()           // Estado
            );

            iClienteDAO.alterar(novoCliente);

            JOptionPane.showMessageDialog(null,"Cliente alterado com sucesso");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Erro ao converter dados numéricos");
            throw new IllegalArgumentException("Erro ao converter dados numéricos");
        }
    }

    private static void excluir(String dados) {
        try {
            Long cpf = Long.parseLong(dados);
            iClienteDAO.excluir(cpf);

            JOptionPane.showMessageDialog(null,"Cliente excluído com sucesso");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Erro ao converter CPF");
            throw new IllegalArgumentException("Erro ao converter CPF");
        }
    }

    private static boolean isAlterar(String opcao) {
        return "4".equals(opcao);
    }

    private static boolean isExcluir(String opcao) {
        return "3".equals(opcao);
    }
}



