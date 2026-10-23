package com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.repository

import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.model.UsuarioLogado

interface LoginRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}