package Menus;
import java.util.Scanner;

import Listas.ListaCategoria;
import Listas.ListaCliente;
import Listas.ListaLocacao;
import Listas.ListaVeiculo;

public class Menu {

  Scanner entrada = new Scanner(System.in);

  int op;

  ListaCliente lc;
  ListaVeiculo lv;
  ListaLocacao ll;
  ListaCategoria lcat;

  MenuCliente mc;
  MenuLocacao ml;
  MenuVeiculo mv;
  MenuCategoria mca;

  public Menu(ListaCliente lc, ListaVeiculo lv, ListaLocacao ll, ListaCategoria lcat) {
    this.lc = lc;
    this.lv = lv;
    this.ll = ll;
    this.lcat = lcat;

    mc = new MenuCliente(lc);
    mv = new MenuVeiculo(lv, lcat);
    ml = new MenuLocacao(ll, lc, lv, lcat);
    mca = new MenuCategoria(lcat);

  }

  public void show() throws Exception {
    do {
      System.out.println("-------------------------------");
      System.out.println("MENU PRINCIPAL");
      System.out.println("1 - Menu Cliente");
      System.out.println("2 - Menu Veiculos");
      System.out.println("3 - Menu Locação");
      System.out.println("4 - Menu Categoria");
      System.out.println("0 - Encerrar programa");
      System.out.println("-------------------------------");
      System.out.println("Qual lista você deseja acessar? ");
      op = entrada.nextInt();
      switch (op) {
        case 1:
          mc.show();
          break;
        case 2:
          mv.show();
          break;
        case 3:
          ml.show();
          break;
        case 4:
          mca.show();
          break;
        case 0:
          break;
        default:
          System.out.println("Opção inválida");
          break;
      }
    } while (op != 0);
    System.out.println("Saindo...");
  }
}