package Listas;

import Classes.Cliente;

public class ListaCliente {
    /* atributo de LDE */
    private LDE lista;
    private ListaLocacao listaL;

    /**
     * Construtor da classe de manipulações da lista de cliente
     */
    public ListaCliente() {
        lista = new LDE();
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
     * @throws Exception
     */
    public Cliente getCliente(long cpf) throws Exception {
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
        throw new Exception("Cliente não encontrado");
    }

    /**
     * Método para getCliente cliente na lista e imprimir String
     * 
     * @param CPF
     * @return
     * @throws Exception
     */
    public String getInfo(long CPF) throws Exception {
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
     * @throws Exception
     */
    public boolean remove(long CPF) throws Exception {
        if(listaL == null){
            lista.remove(getCliente(CPF));
            return true;
        }else if (listaL.existeCNH(getCliente(CPF).getCnh()) == false) {
            throw new Exception("Cliente possui locação ativa!");
        } else {
            return lista.remove(getCliente(CPF));
        }
    }

    /**
     * Método para verificar se cliente existe na lista
     * 
     * @param CPF
     * @return
     * @throws Exception
     */
    public boolean existe(long CPF) throws Exception {
        if (getCliente(CPF) != null) {
            return true;
        }
        return false;
    }

}