package Listas;

import Classes.Categoria;
import Classes.Veiculo;

public class ListaVeiculo {
    /* atributo de LDE */
    private LDE lista;
    private ListaLocacao listaL;

    /**
     * Construtor da classe de manipulações da lista de Veiculos
     */
    public ListaVeiculo() {
        lista = new LDE();
    }

    /**
     * Método para adicionar Veiculo no inicio da lista
     * 
     * @param Veiculo
     */
    public void addInicio(Veiculo veiculo) {
        lista.insereInicio(veiculo);
    }

    /**
     * Método para adicionar Veiculo no fim da lista
     * 
     * @param Veiculo
     */
    public void addFim(Veiculo veiculo) {
        lista.insereFim(veiculo);
    }

    /**
     * Método para verificar Veiculo da lista
     * 
     * @param String placa - placa do veículo
     * @return
     */
    public Veiculo getVeiculo(String placa) {
        if (lista.getInicio() != null) {
            Veiculo c = (Veiculo) lista.getInicio().getInfo();
            if (c.getPlaca().equals(placa)) {
                return (Veiculo) lista.getInicio().getInfo();
            }
            Noh n = lista.getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Veiculo) n.getInfo();
                if (c.getPlaca().equals(placa)) {
                    return c;
                }
            }
        }
        return null;
    }

    /**
     * Método para verificar Veiculo da lista
     * 
     * @param String placa - placa do veículo
     * @return
     */
    public boolean getCategoriaVeiculo(Categoria categoria) {
        if (lista.getInicio() != null) {
            Veiculo c = (Veiculo) lista.getInicio().getInfo();
            if (c.getCategoria() == categoria) {
                return true;
            }
            Noh n = lista.getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Veiculo) n.getInfo();
                if (c.getCategoria() == categoria) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * Método para verificar Veiculo da lista
     * 
     * @param String placa - placa do veículo
     * @return
     */
    public String getVeiculosFree() {
        String listaFree = "";

        if (lista.getInicio() != null) {
            Veiculo c = (Veiculo) lista.getInicio().getInfo();
            if (!listaL.existe(c.getPlaca())) {
                listaFree += c.toString();
            }
            
            Noh n = lista.getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Veiculo) n.getInfo();
                if (!listaL.existe(c.getPlaca())) {
                    listaFree += c.toString();
                }
            }
            return listaFree;
        }
        return "Não há veículos disponíveis";
    }

    /**
     * Método para verificar Veiculo da lista
     * 
     * @param String placa - placa do veículo
     * @return
     */
    public LDE getVeiculosFrees() {
        LDE listaFree = new LDE();

        if (lista.getInicio() != null) {
            Veiculo c = (Veiculo) lista.getInicio().getInfo();
            if (!listaL.existe(c.getPlaca())) {
                listaFree.insereFim(c);
            }
            
            Noh n = lista.getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Veiculo) n.getInfo();
                if (!listaL.existe(c.getPlaca())) {
                    listaFree.insereFim(c);
                }
            }
            return listaFree;
        }
        return null;
    }


    /**
     * Método para imprimir lista de Veiculos livres em String
     * 
     * @return
     */
    public String getInfoInicioFree() {
        return getVeiculosFrees().imprimeListaInicio();
    }

    /**
     * Método para imprimir lista de Veiculos livres em String
     * 
     * @return
     */
    public String getInfoFimFree() {
        return getVeiculosFrees().imprimeListaFim();
    }

    /**
     * Método para getVeiculo Veiculo na lista e imprimir String
     * 
     * @param String placa - placa do veículo
     * @return
     */
    public String getInfo(String placa) {
        if (getVeiculo(placa) != null) {
            return getVeiculo(placa).toString();
        }
        return null;
    }

    /**
     * Método para imprimir lista de Veiculos em String
     * 
     * @return
     */
    public String getInfoInicio() {
        return lista.imprimeListaInicio();
    }

    /**
     * Método para imprimir lista de Veiculos em String
     * 
     * @return
     */
    public String getInfoFim() {
        return lista.imprimeListaFim();
    }

    /**
     * Método para remover Veiculo da lista
     * 
     * @param String placa - placa do veículo
     * @return
     */
    public boolean remove(String placa) {
        if (listaL.existe(placa)) {
            return false;
        } else {
            return lista.remove(getVeiculo(placa));
        }
    }

    /**
     * Método para verificar se Veiculo existe na lista
     * 
     * @param String placa - placa do veículo
     * @return
     */
    public boolean existe(String placa) {
        if (getVeiculo(placa) != null) {
            return true;
        }
        return false;
    }

    /**
     * 
     * @param potencia
     * @return
     */
    public Veiculo getPotencia(int potencia) {

        if (getVeiculosFrees().getInicio() != null) {
            Veiculo c = (Veiculo) getVeiculosFrees().getInicio().getInfo();
            if (c.getPotencia() == potencia && !listaL.existe(c.getPlaca())) {
                return (Veiculo) getVeiculosFrees().getInicio().getInfo();
            }
            Noh n = getVeiculosFrees().getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Veiculo) n.getInfo();
                if (c.getPotencia() == potencia && !listaL.existe(c.getPlaca())) {
                    return c;
                }
            }
        }
        return null;
    }


    /**
     * 
     * @param lugares
     * @return
     */
    public Veiculo getLugares(int lugares) {
        if (getVeiculosFrees().getInicio() != null) {
            Veiculo c = (Veiculo) getVeiculosFrees().getInicio().getInfo();
            if (c.getNlugares() == lugares) {
                return (Veiculo) getVeiculosFrees().getInicio().getInfo();
            }
            Noh n = getVeiculosFrees().getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Veiculo) n.getInfo();
                if (c.getNlugares() == lugares) {
                    return c;
                }
            }
        }
        return null;
    }


    /**
     * 
     * @param cat
     * @param modo
     * @return
     */
    public String getCategoria(Categoria cat, int modo) {
        String listaCat = "";

        if (getVeiculosFrees().getInicio() != null) {
            Veiculo c = (Veiculo) getVeiculosFrees().getInicio().getInfo();
            if (c.getCategoria() == cat) {
                listaCat += c.toString();
            }
            Noh n = getVeiculosFrees().getInicio();
            while (n.getProximo() != null) {
                n = n.getProximo();
                c = (Veiculo) n.getInfo();
                if (c.getCategoria() == cat) {
                    listaCat += c.toString();
                }
            }
            return listaCat;
        }
        return "Não há veículos disponíveis";
    }


}

