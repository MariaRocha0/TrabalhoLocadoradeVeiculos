package Listas;

import java.util.List;

import Classes.Categoria;

public class ListaCategoria {
   /* atributo de LDE */
   private LDE lista;
   private ListaVeiculo listaV;

   /**
    * Construtor da classe de manipulações da lista de Categorias
    */
   public ListaCategoria(ListaVeiculo listaV) {
       lista = new LDE();
       this.listaV = listaV;
   }

   /**
    * Método para adicionar Categoria no inicio da lista
    * 
    * @param Categoria
    */
   public void addInicio(Categoria categoria) {
       lista.insereInicio(categoria);
   }

   /**
    * Método para adicionar Categoria no fim da lista
    * 
    * @param Categoria
    */
   public void addFim(Categoria categoria) {
       lista.insereFim(categoria);
   }

   /**
    * Método para identificar Categoria da lista
    * 
    * @param int id - identificador gerado na classe Categoria
    * @return
    */
   public Categoria getCategoria(int id) {
       if (lista.getInicio() != null) {
           Categoria c = (Categoria) lista.getInicio().getInfo();
           if (c.getIdentificador() == id) {
               return (Categoria) lista.getInicio().getInfo();
           }
           Noh n = lista.getInicio();
           while (n.getProximo() != null) {
               n = n.getProximo();
               c = (Categoria) n.getInfo();
               if (c.getIdentificador() == id) {
                   return c;
               }
           }
       }
       return null;
   }

   /**
    * Método para remover Categoria da lista
    * 
    * @param String name - nome da Categoria
    * @return
    */
   public Categoria getCategoriaName(String name) {
       if (lista.getInicio() != null) {
           Categoria c = (Categoria) lista.getInicio().getInfo();
           if (c.getNome() == name) {
               return (Categoria) lista.getInicio().getInfo();
           }
           Noh n = lista.getInicio();
           while (n.getProximo() != null) {
               n = n.getProximo();
               c = (Categoria) n.getInfo();
               if (c.getNome() == name) {
                   return c;
               }
           }
       }
       return null;
   }

   /**
    * Método para getCategoria Categoria na lista e imprimir String
    * 
    * @param int id - identificador gerado na classe Categoria
    * @return
    */
   public String getInfo(int id) {
       if (getCategoria(id) != null) {
           return getCategoria(id).toString();
       }
       return null;
   }

   /**
    * Método para imprimir lista de Categorias em String
    * 
    * @return
    */
   public String getInfoInicio() {
       return lista.imprimeListaInicio();
   }

   /**
    * Método para imprimir lista de Categorias em String
    * 
    * @return
    */
   public String getInfoFim() {
       return lista.imprimeListaFim();
   }

   /**
    * Método para remover Categoria da lista
    * 
    * @param int id - identificador gerado na classe Categoria
    * @return
    */
   public boolean remove(int id) {
       if (listaV.getCategoriaVeiculo(getCategoria(id))) {
           return false;
       } else {
           return lista.remove(getCategoria(id));
       }
   }

   /**
    * Método para verificar se Categoria existe na lista
    * 
    * @param int id - identificador gerado na classe Categoria
    * @return
    */
   public boolean existe(int id) {
       if (getCategoria(id) != null) {
           return true;
       }
       return false;
   }
}
