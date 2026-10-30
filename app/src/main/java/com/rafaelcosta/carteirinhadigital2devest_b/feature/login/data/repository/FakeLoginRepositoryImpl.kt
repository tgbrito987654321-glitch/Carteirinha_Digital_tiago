package com.rafaelcosta.carteirinhadigital2devest_b.feature.login.data.repository

import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.model.UsuarioLogado
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.repository.LoginRepository
import kotlinx.coroutines.delay

class FakeLoginRepositoryImpl : LoginRepository {

    override suspend fun login(login: String, senha: String): Result<UsuarioLogado> {
        delay(1500)
        return if (login == "aluno" && senha == "123") {
            Result.success(
                UsuarioLogado(
                    id = "1",
                    nome = "Rafael Costa",
                    curso = "Desenvolvimento de Sistema",
                    turma = "2DEVEST-B",
                    token = "token-fake-para-aula"
                )
            )
        } else {
            Result.failure(
                IllegalArgumentException("Login ou senha inválidos")
            )
        }
    }
}
