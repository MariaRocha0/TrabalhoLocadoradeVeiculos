package Menus;

import java.util.Scanner;

import Classes.Categoria;
import Classes.Veiculo;
import Listas.ListaCategoria;
import Listas.ListaVeiculo;

public class MenuCategoria {
    private int op = 0;
    private ListaCategoria lca;

    public MenuCategoria(ListaCategoria lca) {
        this.lca = lca;
    }

    Scanner entrada = new Scanner(System.in);

    public void show() {
        do {
            System.out.println("\n|-----------------------------------|");
            System.out.println("|       ##--Menu Categoria--##         |");
            System.out.println("|-------------------------------------|");
            System.out.println("| Opção 1 - Cadastrar nova Categoria  |");
            System.out.println("| Opção 2 - Verificar Categoria       |");
            System.out.println("| Opção 3 - Alterar Categoria         |");
            System.out.println("| Opção 4 - Excluir Categoria         |");
            System.out.println("| Opção 5 - Listar                    |");
            System.out.println("| Opção 6 - Listar de trás para frente|");
            System.out.println("| Opção 7 - Voltar ao menu principal  |");
            System.out.println("|-------------------------------------|\n");
            System.out.println("Digite uma opção:\n");

            do {
                try {
                    op = entrada.nextInt();
                } catch (Exception e) {
                    System.out.println("Opção inválida! Escolha uma opção válida!");
                }
            } while (op < 1 || op > 7);

            entrada.nextLine();
            switch (op) {
                case 1:
                    Cadastrar();
                    break;
                case 2:
                    Verificar();
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
                    System.out.print("Opção inválida!  ");
                    break;
            }
        } while (op != 7);
    }

    public void Cadastrar() {
        System.out.println("Informe o nome da categoria: ");
        String nome = entrada.nextLine();

        if (lca.getCategoriaName(nome) != null) {
            System.out.println("Já há um categoria cadastrada com esse nome!");
        } else {
            Categoria v = new Categoria(nome);
            lca.addFim(v);
            System.out.println("Categoria cadastrada com sucesso!");
            System.out.println(lca.getCategoriaName(nome));
        }
    }

    public void Verificar() {

        boolean aux = false;
        int id = 0;

        do {
            try {
                System.out.print("Informe o ID: ");
                id = entrada.nextInt();
                aux = true;
            } catch (Exception e) {
                System.out.println("ID inválido! Digite apenas números!");
                aux = false;
            }
        } while (aux == false);

        if (lca.getCategoria(id) != null) {
            System.out.println("Categoria encontrada: ");
            System.out.println(lca.getInfo(id));
        } else {
            System.out.println("Nenhuma categoria cadastrado com esse ID! ");
        }
    }

    public void Excluir() {
        boolean aux = false;
        int id = 0;

        do {
            try {
                System.out.println("Informe a ID da categoria que deseja excluir: ");
                id = entrada.nextInt();
                aux = true;
            } catch (Exception e) {
                System.out.println("ID inválido! Digite apenas números!");
                aux = false;
            }
        } while (aux == false);

        if (lca.remove(id)) {
            System.out.println("Categoria excluida! ");
        } else {
            System.out.println("Está categoria está associada a um veículo que está locado e não pode ser excluída.");
        }
    }

    public void Alterar() {

        boolean aux1 = false;
        int id = 0;

        do {
            try {
                System.out.print("Informe o ID: ");
                id = entrada.nextInt();
                entrada.nextLine();
                aux1 = true;
            } catch (Exception e) {
                System.out.println("ID inválido! Digite apenas números!");
                aux1 = false;
            }
        } while (aux1 == false);

        if (lca.getCategoria(id) != null) {
            System.out.println("Cadastro encontrado!");
            System.out.println(lca.getInfo(id));
            Categoria aux = lca.getCategoria(id);
            System.out.println("Qual novo nome deseja colocar? ");
            String nome = entrada.nextLine();
            aux.setNome(nome);
            System.out.println("Cadastro alterado com sucesso!");
        } else {
            System.out.println("Nenhuma categoria cadastrado com esse ID!");
        }
    }

    public void Listar() {
        System.out.println(lca.getInfoInicio());
    }

    public void ListarReverso() {
        System.out.println(lca.getInfoFim());
    }
}