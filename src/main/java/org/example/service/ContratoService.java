package org.example.service;

import org.example.service.dao.IContratoDao;

public class ContratoService implements IContratoService{
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return null;
    }

    @Override
    public boolean excluir() {
        contratoDao.excluir();
        return true;
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso";
    }
}
