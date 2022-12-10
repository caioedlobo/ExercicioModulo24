package org.example.service.dao;

public class ContratoDao implements IContratoDao{
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public String buscar() {
        return null;
    }

    @Override
    public void excluir() {

    }

    @Override
    public void atualizar() {

    }
}
