package org.example.service;

import org.example.dao.IContratoDao;

public class ContratoService implements IContratoService {

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
        return "Buscar";
    }

    @Override
    public Boolean excluir() {
        contratoDao.excluir();
        return true;
    }

    @Override
    public Boolean atualizar() {
        contratoDao.atualizar();
        return true;
    }
}
