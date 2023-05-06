import Arquivos.Arquivo;
import Classes.Categoria;
import Classes.Cliente;
import Classes.Veiculo;
import Listas.ListaCategoria;
import Listas.ListaCliente;
import Listas.ListaLocacao;
import Listas.ListaVeiculo;
import Menus.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        final String fileCategoria = "src\\Arquivos\\Categorias.csv";
        final String fileVeiculo = "src\\Arquivos\\Veiculos.csv";
        final String fileCliente = "src\\Arquivos\\Clientes.csv";


        Arquivo read = new Arquivo(fileCategoria);

        ListaCliente lc = new ListaCliente();
        ListaVeiculo lv = new ListaVeiculo();
        ListaLocacao ll = new ListaLocacao();
        ListaCategoria lca = new ListaCategoria();

        /**
         * passar CSV categoria
         */
        try {
            read.read();
            String content = read.getContent();
            String[] contentBreak = content.split("\n");

            for(int i = 1; i < contentBreak.length; i++) {

                String[] contentData = contentBreak[i].split(";");
                String id = contentData[0];
                String name = contentData[1];

                int idint = 0;

                try {
                    idint = Integer.parseInt(id);
                } catch (Exception e) {
                    System.out.println("Erro ao passar id para int: " + e.getMessage());
                }
                
                Categoria categoria = new Categoria(idint, name);
                
                try {
                    lca.addFim(categoria);
                } catch (Exception e) {
                    System.out.println("Erro ao adicionar categoria: " + e.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /**
         * passar CSV veículo
         */

        read.setFilePath(fileVeiculo);

        try {
            read.read();
            String content = read.getContent();
            String[] contentBreak = content.split("\n");

            for(int i = 1; i < contentBreak.length; i++) {

                String[] contentData = contentBreak[i].split(";");
                String placa = contentData[0];
                String modelo = contentData[1];
                String marca = contentData[2];
                String ano = contentData[3];
                String potencia = contentData[4];
                String lugares = contentData[5];
                String categoria = contentData[6];

                int intAno = 0;
                int intPotencia = 0;
                int intLugares = 0;
                int categoriaint = 0;

                try {
                    intAno = Integer.parseInt(ano);
                } catch (Exception e) {
                    System.out.println("Erro ao passar ano para loteirong: " + e.getMessage());
              }

                try {
                    intPotencia = Integer.parseInt(potencia);
                } catch (Exception e) {
                    System.out.println("Erro ao passar potencia para Inteiro: " + e.getMessage());
                }

                try {
                    intLugares = Integer.parseInt(lugares);
                } catch (Exception e) {
                    System.out.println("Erro ao passar lugares para Inteiro: " + e.getMessage());
                }

                try {
                    categoriaint = Integer.parseInt(categoria);
                } catch (Exception e) {
                    System.out.println("Erro ao passar lugares para Inteiro: " + e.getMessage());
                }

                Categoria categoria2 = (Categoria) lca.getCategoria(categoriaint);

                Veiculo veiculo = new Veiculo(placa, modelo, marca, intAno, intPotencia, intLugares, categoria2);  

                try {
                    lv.addFim(veiculo);
                } catch (Exception e) {
                    System.out.println("Erro ao adicionar categoria: " + e.getMessage());
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        /**
         * passar CSV cliente
         */
        read.setFilePath(fileCliente);

        try {
            read.read();
            String content = read.getContent();
            String[] contentBreak = content.split("\n");

            for(int i = 1; i < contentBreak.length; i++) {

                String[] contentData = contentBreak[i].split(";");
                String nome = contentData[0];
                String telefone = contentData[1];
                String cnh = contentData[2];
                String cpf = contentData[3];

                long telefoneL = 0;
                long cnhL = 0;
                long cpfL = 0;

                try {
                    telefoneL = Long.parseLong(telefone);
                } catch (Exception e) {
                    System.out.println("Erro ao passar telefone: " + e.getMessage());
              }

                try {
                    cnhL = Long.parseLong(cnh);
                } catch (Exception e) {
                    System.out.println("Erro ao passar CNH: " + e.getMessage());
                }

                try {
                    cpfL = Long.parseLong(cpf);
                } catch (Exception e) {
                    System.out.println("Erro ao passar CPF: " + e.getMessage());
                }

                Cliente cliente = new Cliente(nome, telefoneL, cnhL, cpfL);  

                try {
                    lc.addFim(cliente);
                } catch (Exception e) {
                    System.out.println("Erro ao adicionar cliente: " + e.getMessage());
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Menu menu = new Menu(lc, lv, ll, lca);
        menu.show();

        
    }
}
