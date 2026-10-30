package com.rafaelcosta.carteirinhadigital2devest_b.feature.login.presentation.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.repository.LoginRepository
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.presentation.LoginViewModel

class LoginViewModelFactory(
    private val repository: LoginRepository
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(repository = repository) as T
        }
        throw IllegalArgumentException("ViewModel desconhecido: ${modelClass.name}")
    }
}
