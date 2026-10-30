package com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.model

data class UsuarioLogado(
    val id: String = "",
    val nome: String = "",
    val matricula: String = id,
    val perfil: PerfilAcesso = PerfilAcesso.ALUNO,
    val curso: String = "",
    val turma: String = "",
    val token: String = ""
)
