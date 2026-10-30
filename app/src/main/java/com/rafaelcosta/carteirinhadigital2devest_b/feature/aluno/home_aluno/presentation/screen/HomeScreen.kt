package com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.home_aluno.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.home_aluno.presentation.component.BotaoNavegacao
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.model.PerfilAcesso
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.model.UsuarioLogado

@Composable
fun HomeAlunoScreen(
    usuarioLogado: UsuarioLogado,
    onCarteirinhaClick: () -> Unit,
    onUnidadesCurricularesClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Olá, ${usuarioLogado.nome}",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer
            )
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Aluno",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "Matrícula: ${usuarioLogado.matricula}"
                )
                Text(
                    text = "Curso: ${usuarioLogado.curso}"
                )
                Text(
                    text = "Turma: ${usuarioLogado.turma}"
                )
            }
        }

        BotaoNavegacao(
            text = "Carteirinha",
            onClick = onCarteirinhaClick,
            modifier = Modifier.fillMaxWidth()
        )

        BotaoNavegacao(
            text = "Unidades Curriculares",
            onClick = onUnidadesCurricularesClick,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeAlunoScreenPreview() {
    HomeAlunoScreen(
        usuarioLogado = UsuarioLogado(
            id = "1",
            nome = "Aluno Teste",
            matricula = "2026001",
            perfil = PerfilAcesso.ALUNO,
            curso = "Desenvolvimento de Sistemas",
            turma = "2DEVEST-B",
            token = "token"
        ),
        onCarteirinhaClick = {},
        onUnidadesCurricularesClick = {}
    )
}
