package Listas;

import Classes.Locacao;

public class ListaLocacao {
    /* atributo de LDE */
    private LDE lista;

    /**
     * Construtor da classe de manipulações da lista de Locacoes
     */
    public ListaLocacao() {
        lista = new LDE();
    }

    /**
     * Método para adicionar Locacao no inicio da lista
     * 
     * @param Locacao
     */
    public void addInicio(Locacao locacao) {
        lista.insereInicio(locacao);
    }

    /**
     * Método para adicionar Locacao no fim da lista
     * 
     * @param Locacao
     */
    public void addFim(Locacao locacao) {
        lista.insereFim(locacao);
    }

    /**
     * Método para remover Locacao da lista
     * 
     * @param long cnh - CNH do Clinte cadastrada na locação
     * @return
     */
    public Locacao getLocacaoCNH(long cnh) {
        if (lista.getInicio() != null) {
            Locacao c = (Locacao) lista.getInicio().getInfo();
            if (c.getCnh() == cnh) {
                return (Locacao) lista.getInicio().getInfo();
            }
            Noh n = lista.getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Locacao) n.getInfo();
                if (c.getCnh() == cnh) {
                    return c;
                }
            }
        }
        return null;
    }

    /**
     * Método para remover Locacao da lista
     * 
     * @param String placa - placa do Veículo cadastrado na Locação
     * @return
     */
    public Locacao getLocacaoPlaca(String placa) {
        if (lista.getInicio() != null) {
            Locacao c = (Locacao) lista.getInicio().getInfo();
            if (c.getPlaca() == placa) {
                return (Locacao) lista.getInicio().getInfo();
            }
            Noh n = lista.getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Locacao) n.getInfo();
                if (c.getPlaca() == placa) {
                    return c;
                }
            }
        }
        return null;
    }

    /**
     * Método para remover Locacao da lista
     * 
     * @param String placa - placa do Veículo cadastrado na Locação
     * @param long   cnh - CNH do Clinte cadastrada na locação
     * @return
     */
    public Locacao getLocacaoDuo(String placa, long cnh) {
        if (lista.getInicio() != null) {
            Locacao c = (Locacao) lista.getInicio().getInfo();
            if (c.getPlaca() == placa && c.getCnh() == cnh) {
                return (Locacao) lista.getInicio().getInfo();
            }
            Noh n = lista.getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Locacao) n.getInfo();
                if (c.getPlaca() == placa && c.getCnh() == cnh) {
                    return c;
                }
            }
        }
        return null;
    }

    /**
     * Método para getLocacao Locacao na lista e imprimir String
     * 
     * @param String placa - placa do Veículo cadastrado na Locação
     * @return
     */
    public String getInfo(String placa) {
        if (getLocacaoPlaca(placa) != null) {
            return getLocacaoPlaca(placa).toString();
        }
        return null;
    }

    /**
     * Método para imprimir lista de Locacaos em String
     * 
     * @return
     */
    public String getInfoInicio() {
        return lista.imprimeListaInicio();
    }

    /**
     * Método para imprimir lista de Locacaos em String
     * 
     * @return
     */
    public String getInfoFim() {
        return lista.imprimeListaFim();
    }

    /**
     * Método para remover Locacao da lista
     * 
     * @param String placa - placa do Veículo cadastrado na Locação
     * @return
     */
    public boolean remove(String placa) {
        return lista.remove(getLocacaoPlaca(placa));
    }

    /**
     * Método para verificar se Locacao existe na lista
     * 
     * @param String placa - placa do Veículo cadastrado na Locação
     * @return
     */
    public boolean existe(String placa) {
        if (getLocacaoPlaca(placa) != null) {
            return true;
        }
        return false;
    }

    /**
     * Método para verificar se Locacao existe na lista
     * 
     * @param long cnh - CNH do Clinte cadastrada na locação
     * @return
     */
    public boolean existeCNH(long cnh) {
        if (getLocacaoCNH(cnh) != null) {
            return true;
        }
        return false;
    }
}

