package com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.model

import com.rafaelcosta.carteirinhadigital2devest_b.app.navigation.GraphRoutes.ALUNO
import com.rafaelcosta.carteirinhadigital2devest_b.app.navigation.GraphRoutes.PROFESSOR

class PerfilAcesso {
}
ALUNO,
PROFESSOR;

companion object {

    fun fromApi(
        value: String
    ): PerfilAcesso {

        return when (
            value.trim().uppercase()
        ) {

            "ALUNO" ->
                ALUNO

            "PROFESSOR" ->
                PROFESSOR

            else ->
                throw IllegalArgumentException(
                    "Perfil de acesso inválido: $value"
                )
        }
    }
}
}