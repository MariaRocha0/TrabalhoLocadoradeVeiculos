package Menus;

import java.util.Scanner;

import Listas.ListaCliente;
import Classes.Cliente;

public class MenuCliente {
    Scanner entrada = new Scanner(System.in);
    private int op1;
    private int op2;
    private ListaCliente lc;

    public MenuCliente(ListaCliente lc) {
        this.lc = lc;
    }

    public void show() {
        do {
            System.out.println("--------------------------------");
            System.out.println("         MENU CLIENTES");
            System.out.println("--------------------------------");
            System.out.println("1 - Cadastrar um cliente");
            System.out.println("2 - Verificar o cadastro de um cliente");
            System.out.println("3 - Alterar dados de um cliente já cadastrado");
            System.out.println("4 - Excluir um cliente cadastrado");
            System.out.println("5 - Listar");
            System.out.println("6 - Listar de trás para frente");
            System.out.println("7 - Retornar ao menu principal");
            System.out.println("--------------------------------");
            System.out.print("O que você deseja fazer? ");
            op1 = entrada.nextInt();
            entrada.nextLine();
            switch (op1) {
                case 1:
                    Cadastro();
                    break;
                case 2:
                    Verificacao();
                    break;
                case 3:
                    Alterar();
                    break;
                case 4:
                    Excluir();
                    break;
                case 5:
                    Listar();
                    break;
                case 6:
                    ListarReverso();
                    break;
                case 7:
                    break;
                default:
                    System.out.print("Opção inválida!");
                    break;
            }
        } while (op1 != 7);
    }

    private void Cadastro() {

        System.out.print("Informe o CPF: ");
        long CPF = entrada.nextLong();
        entrada.nextLine();

        if (lc.getCliente(CPF) == null) {

            System.out.print("Informe o nome completo: ");
            String nome = entrada.nextLine();
            System.out.print("Informe o número da CNH: ");
            long nunCarteira = entrada.nextLong();
            System.out.print("Informe o número e telefone para contato: ");
            long telefone = entrada.nextLong();
            entrada.nextLine();
            Cliente cadastro = new Cliente(nome, telefone, nunCarteira, CPF);
            lc.addFim(cadastro);
            System.out.println("Cliente cadastrado:");
            System.out.println(lc.getInfo(CPF));

        } else {
            System.out.println("Já há um cadastro com esse CPF.");
        }
    }

    private void Verificacao() {
        System.out.print("Informe o CPF: ");
        long CPF2 = entrada.nextLong();
        lc.getCliente(CPF2);
        if (lc.getCliente(CPF2) != null) {
            System.out.println("Cliente encontrado: ");
            System.out.println(lc.getCliente(CPF2));
        } else {
            System.out.println("Nenhum cliente cadastrado com esse CPF!");
        }
    }

    private void Alterar() {
        System.out.print("Informe o CPF: ");
        long CPF3 = entrada.nextLong();
        lc.getCliente(CPF3);
        if (lc.getCliente(CPF3) != null) {
            System.out.println("Cadastro encontrado!");
            System.out.println(lc.getCliente(CPF3).toString());
            System.out.println("");
            do {
                System.out.println("1 - Nome");
                System.out.println("2 - CPF");
                System.out.println("3 - Número da carteira de habilitação");
                System.out.println("4 - Telefone");
                System.out.print("Qual dado você gostaria de alterar? ");
                op2 = entrada.nextInt();
                entrada.nextLine();
                System.out.println("");
                switch (op2) {
                    case 1:
                        System.out.println("Digite o novo nome: ");
                        String nome = entrada.nextLine();
                        lc.getCliente(CPF3).setNome(nome);
                        System.out.println("Dado alterado com sucesso.");
                        break;
                    case 2:
                        System.out.println("Digite o novo CPF: ");
                        long cpf = entrada.nextLong();
                        lc.getCliente(CPF3).setCpf(cpf);
                        System.out.println("Dado alterado com sucesso.");
                        break;
                    case 3:
                        System.out.println("Digite o novo número da carteira: ");
                        int ncm = entrada.nextInt();
                        lc.getCliente(CPF3).setCnh(ncm);
                        System.out.println("Dado alterado com sucesso.");
                        break;
                    case 4:
                        System.out.println("Digite o novo telefone: ");
                        int tel = entrada.nextInt();
                        lc.getCliente(CPF3).setTelefone(tel);
                        System.out.println("Dado alterado com sucesso.");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while ((op2 != 1) && (op2 != 2) && (op2 != 3) && (op2 != 4));
        } else {
            System.out.println("Nenhum cliente cadastrado com esse CPF!");
        }
    }

    private void Excluir() {
        System.out.print("Informe o CPF: ");
        long CPF4 = entrada.nextLong();
        lc.getCliente(CPF4);
        if (lc.getCliente(CPF4) != null) {
            if(lc.remove(CPF4)){
                lc.remove(CPF4);
                System.out.println("Cliente excluído com sucesso.");
            } else {
                System.out.println("Erro ao excluir cliente.");
            }
        } else {
            System.out.println("Nenhum cliente cadastrado com esse CPF.");
        }
    }

    private void Listar(){
        System.out.println(lc.getInfoInicio());
    }

    private void ListarReverso(){
        System.out.println(lc.getInfoFim());
    }
}
