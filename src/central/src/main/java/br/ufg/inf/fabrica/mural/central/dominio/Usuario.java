package br.ufg.inf.fabrica.mural.central.dominio;

import java.util.Collection;

public class Usuario {
    private long id;
    private String login;
    private String senha;
    private boolean apenasProdutor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isApenasProdutor() {
        return apenasProdutor;
    }

    public void setApenasProdutor(boolean apenasProdutor) {
        this.apenasProdutor = apenasProdutor;
    }

    public Collection obterGrupoDestinatarios(Usuario usuario) {
        GrupoDestinatario grupoDestinatario = new GrupoDestinatario();
        return grupoDestinatario.obterGruposDoUsuario(usuario);
    }
}
