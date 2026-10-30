package com.rafaelcosta.carteirinhadigital2devest_b.feature.login.presentation.factory;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static java.lang.ref.Cleaner.create;

import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.model.repository.LoginRepository;
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.presentation.LoginViewModel;

import kotlin.Suppress;

public class LoginViewModelFactory {
}
class LoginViewModelFactory(private val repository:LoginRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return LoginViewModel(repository = repository) as T
        }
        throw IllegalArgumentException("ViewModel desconhecido: ${modelClass.name}")
    }
}