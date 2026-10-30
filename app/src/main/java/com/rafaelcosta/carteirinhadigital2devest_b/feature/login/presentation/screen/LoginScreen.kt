package com.rafaelcosta.carteirinhadigital2devest_b.feature.login.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.model.UsuarioLogado
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.presentation.LoginEvent
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.presentation.LoginViewModel

@Composable
fun LoginScreen(
    viewModel: LoginViewModel,
    modifier: Modifier = Modifier,
    onLoginSucesso: (UsuarioLogado) -> Unit = {}
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(uiState.usuarioLogado) {
        uiState.usuarioLogado?.let { usuario ->
            viewModel.onEvent(LoginEvent.OnNavegacaoRealizada)
            onLoginSucesso(usuario)
        }
    }

    LoginContent(
        modifier = modifier.fillMaxSize(),
        uiState = uiState,
        onEvent = viewModel::onEvent
    )
}
