package br.ufg.inf.fabrica.mural.central.dominio;

import java.util.Collection;

public class SolicitacaoObterGrupoDestinatariosUsuario {

    private AutenticadorCAS autenticadorCAS;
    private Usuario usuario;
    private PapelDeUsuario papelDeUsuario;

    public SolicitacaoObterGrupoDestinatariosUsuario() {
        this.autenticadorCAS = new AutenticadorCAS();
    }

    Collection obterGruposDestinatarios(String login, String senha) {
        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);

        boolean usuarioEhValido = autenticadorCAS.validarCredencial(usuario);
        if(usuarioEhValido) {
            return usuario.obterGrupoDestinatarios(usuario);
        } else {
            return null;
        }
    }
}
