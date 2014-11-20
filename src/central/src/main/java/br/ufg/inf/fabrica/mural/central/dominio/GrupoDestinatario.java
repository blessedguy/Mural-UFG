package br.ufg.inf.fabrica.mural.central.dominio;

import br.ufg.inf.fabrica.mural.central.persistencia.GrupoDestinatarioDao;

import java.util.Collection;

public class GrupoDestinatario {

    // TODO implementar
    public boolean usuarioTemPermissaoEnvio(Usuario usuario) {
        return true;
    }

    public Collection obterGruposDoUsuario(Usuario usuario) {
        GrupoDestinatarioDao grupoDestinatarioDao = new GrupoDestinatarioDao();
        return grupoDestinatarioDao.obterGruposDoUsuario(usuario);
    }
}
