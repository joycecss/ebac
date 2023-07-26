package org.example;

import org.example.dao.ClienteMapDAO;
import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;

import javax.swing.*;

public class Main {
    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para cadastro, 4 para alteração ou 5 para sair",
                    "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            switch (opcao) {
                case "1": {
                    String dados = JOptionPane.showInputDialog(null,
                            "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    cadastrar(dados);
                    break;
                }
                case "2": {
                    String dados = JOptionPane.showInputDialog(null,
                            "Digite o cpf",
                            "Consultar", JOptionPane.INFORMATION_MESSAGE);
                    consultar(dados);
                    break;
                }
                case "3": {
                    String dados = JOptionPane.showInputDialog(null,
                            "Digite o CPF do cliente",
                            "Excluir cliente", JOptionPane.INFORMATION_MESSAGE);
                    excluir(dados);
                    break;
                }
                case "4": {
                    String dados = JOptionPane.showInputDialog(null,
                            "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                            "Atualização", JOptionPane.INFORMATION_MESSAGE);
                    atualizar(dados);
                    break;
                }
                case "5": {
                    sair();
                    break;
                }
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        boolean isNumeric = dados.matches("[+-]?\\d*(\\.\\d+)?");
        if(isNumeric){
            Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
            if (cliente != null) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite apenas o cpf ou um cpf valido", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
    }


    private static void sair() {
        String clientesCadastrados = "";
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            clientesCadastrados += cliente.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Clientes cadastrados: " + clientesCadastrados, "Até logo",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
}