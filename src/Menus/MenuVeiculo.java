package Menus;

import java.util.Scanner;

import Classes.Veiculo;
import Listas.ListaCategoria;
import Listas.ListaVeiculo;

public class MenuVeiculo {
  private int op;
  private int op1;
  private ListaVeiculo lv;
  private ListaCategoria lca;

  public MenuVeiculo(ListaVeiculo lv, ListaCategoria lca) {
    this.lv = lv;
    this.lca = lca;
  }

  Scanner entrada = new Scanner(System.in);

  public void show() {
    do {
      System.out.println("\n|-----------------------------------|");
      System.out.println("|       ##--Menu Veiculo--##          |");
      System.out.println("|-------------------------------------|");
      System.out.println("| Opção 1 - Cadastrar novo Veiculo    |");
      System.out.println("| Opção 2 - Verificar Veiculo         |");
      System.out.println("| Opção 3 - Alterar Veiculo           |");
      System.out.println("| Opção 4 - Excluir Veiculo           |");
      System.out.println("| Opção 5 - Listar                    |");
      System.out.println("| Opção 6 - Listar de trás para frente|");
      System.out.println("| Opção 7 - Voltar ao menu principal  |");
      System.out.println("|-------------------------------------|\n");
      System.out.println("Digite uma opção:\n");
      op = entrada.nextInt();
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
    System.out.println("Informe a placa do veículo: ");
    String placa = entrada.nextLine();

    if (lv.getVeiculo(placa) != null) {
      System.out.println("Já há um veículo cadastrado com essa placa!");
    } else {

      System.out.println("Informe o modelo do veículo: ");
      String modelo = entrada.nextLine();

      System.out.println("Informe a marca do veículo: ");
      String marca = entrada.nextLine();

      System.out.println("Informe o ano do veículo: ");
      int ano = entrada.nextInt();

      System.out.println("Informe a potência do veículo: ");
      int potencia = entrada.nextInt();
      entrada.nextLine();

      System.out.println("Número de lugares: ");
      int nlugares = entrada.nextInt();

      System.out.println("Informe o id da categoria do veículo: ");
      int categoria = entrada.nextInt();

      Veiculo v = new Veiculo(placa, modelo, marca, ano, potencia, nlugares, lca.getCategoria(categoria));
      lv.addFim(v);
      System.out.println(lv.getInfo(placa));
      System.out.println("Veículo cadastrado com sucesso!");
    }
  }

  public void Verificar() {
    System.out.print("Informe a placa: ");
    String placa1 = entrada.nextLine();

    if (lv.getVeiculo(placa1) != null) {
      System.out.println("Placa encontrada: ");
      System.out.println(lv.getInfo(placa1));
    } else {
      System.out.println("Nenhum veiculo cadastrado com essa placa! ");
    }
  }

  public void Excluir() {
    System.out.println("Informe a placa do veículo que deseja excluir: ");
    String placa2 = entrada.nextLine();
    entrada.nextLine();
    if(lv.remove(placa2)){
        lv.remove(placa2);
        System.out.println("Veiculo excluido! ");
    }else{
        System.out.println("Nenhum veiculo cadastrado com essa placa! ");
    }
  }

  public void Alterar() {
    System.out.print("Informe a placa: ");
    String placa3 = entrada.nextLine();
    

    if (lv.getVeiculo(placa3) != null) {
      System.out.println("Cadastro encontrado!");
      System.out.println(lv.getInfo(placa3));
      Veiculo aux = lv.getVeiculo(placa3);
      System.out.println("");

      System.out.println("Qual item deseja alterar: 1.Placa | 2.Modelo | 3.Marca | 4.Ano" +
          " | 5.Potência | 6.Número de lugares | 7.Categoria");
      System.out.print("- ");
      op1 = entrada.nextInt();
      entrada.nextLine();

      
      switch (op1) {
        case 1:
          System.out.print("Placa: ");
          String placa = entrada.nextLine();
          aux.setPlaca(placa);
          System.out.println("Alterado com sucesso!");
          break;
        case 2:
          System.out.print("Modelo: ");
          String modelo = entrada.nextLine();
          aux.setModelo(modelo);
          System.out.println("Alterado com sucesso!");
          break;
        case 3:
          System.out.print("Marca: ");
          String marca = entrada.nextLine();
          aux.setMarca(marca);
          System.out.println("Alterado com sucesso!");
          break;
        case 4:
          System.out.print("Ano: ");
          int ano = entrada.nextInt();
          aux.setAno(ano);
          System.out.println("Alterado com sucesso!");
          break;
        case 5:
          System.out.print("Potência: ");
          int pot = entrada.nextInt();
          aux.setPotencia(pot);
          System.out.println("Alterado com sucesso!");
          break;
        case 6:
          System.out.print("Número de lugares: ");
          int num = entrada.nextInt();
          aux.setAno(num);
          System.out.println("Alterado com sucesso!");
          break;
        case 7:
          System.out.print("ID da categoria: ");
          int id = entrada.nextInt();
          aux.setCategoria(lca.getCategoria(id));
          System.out.println("Alterado com sucesso!");
          break;
      }
    } else {
      System.out.println("Nenhum veiculo cadastrado com essa placa!");
    }
  }

  public void Listar() {
    System.out.println(lv.getInfoInicio());
  }

  public void ListarReverso() {
    System.out.println(lv.getInfoFim());
  }
}
