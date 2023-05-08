package Listas;

import java.util.List;

import Classes.Cliente;

public class ListaCliente {
    /* atributo de LDE */
    private LDE lista;
    private ListaLocacao listaL;

    /**
     * Construtor da classe de manipulações da lista de cliente
     */
    public ListaCliente(ListaLocacao listaL) {
        lista = new LDE();
        this.listaL = listaL;
    }

    /**
     * Método para adicionar cliente no inicio da lista
     * 
     * @param cliente
     */
    public void addInicio(Cliente cliente) {
        lista.insereInicio(cliente);
    }

    /**
     * Método para adicionar cliente no fim da lista
     * 
     * @param cliente
     */
    public void addFim(Cliente cliente) {
        lista.insereFim(cliente);
    }

    /**
     * Método para remover cliente da lista
     * 
     * @param cpf
     * @return
     */
    public Cliente getCliente(long cpf) {
        if (lista.getInicio() != null) {
            Cliente c = (Cliente) lista.getInicio().getInfo();
            if (c.getCpf() == cpf) {
                return (Cliente) lista.getInicio().getInfo();
            }
            Noh n = lista.getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Cliente) n.getInfo();
                if (c.getCpf() == cpf) {
                    return c;
                }
            }
        }
        return null;
    }

    /**
     * Método para getCliente cliente na lista e imprimir String
     * 
     * @param CPF
     * @return
     */
    public String getInfo(long CPF) {
        if (getCliente(CPF) != null) {
            return getCliente(CPF).toString();
        }
        return null;
    }

    /**
     * Método para imprimir lista de clientes em String
     * 
     * @return
     */
    public String getInfoInicio() {
        return lista.imprimeListaInicio();
    }

    /**
     * Método para imprimir lista de clientes em String
     * 
     * @return
     */
    public String getInfoFim() {
        return lista.imprimeListaFim();
    }

    /**
     * Método para remover cliente da lista
     * 
     * @param CPF
     * @return
     */
    public boolean remove(long CPF) {
        if (listaL.existeCNH(getCliente(CPF).getCnh())) {
            return false;
        } else {
            return lista.remove(getCliente(CPF));
        }
    }

    /**
     * Método para verificar se cliente existe na lista
     * 
     * @param CPF
     * @return
     */
    public boolean existe(long CPF) {
        if (getCliente(CPF) != null) {
            return true;
        }
        return false;
    }

}