package com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.model

class UsuarioLogado(id: String, nome: String, curso: String, turma: String) {
    val perfil: Any

    data class UsuarioLogado(
        val id: String,
        val nome: String,
        val matricula: String,
        val perfil: PerfilAcesso,
        val curso: String,
        val turma: String,
        val token: String
    )
}