package com.rafaelcosta.carteirinhadigital2devest_b.core.designsystem.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext

private val lightScheme = lightColorScheme(
    primary = Color(0xFF7B2CBF),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFE0AAFF),
    onPrimaryContainer = Color(0xFF2A0646),

    secondary = Color(0xFF9D4EDD),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFE8D5F5),
    onSecondaryContainer = Color(0xFF32104A),

    tertiary = Color(0xFF5A189A),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFE8D5F5),
    onTertiaryContainer = Color(0xFF26003D),

    error = Color(0xFFBA1A1A),
    onError = Color.White,
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    background = Color(0xFFF8F3FC),
    onBackground = Color(0xFF1C1720),

    surface = Color(0xFFFFFBFF),
    onSurface = Color(0xFF1C1720),

    surfaceVariant = Color(0xFFE8DDEB),
    onSurfaceVariant = Color(0xFF4D4550),

    outline = Color(0xFF7D747F),
    outlineVariant = Color(0xFFCEC4D0),

    scrim = Color.Black,

    inverseSurface = Color(0xFF312D33),
    inverseOnSurface = Color(0xFFF5EFF6),
    inversePrimary = Color(0xFFD69AFF),

    surfaceDim = Color(0xFFDED8DF),
    surfaceBright = Color(0xFFFFFBFF),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainerLow = Color(0xFFF9F3FA),
    surfaceContainer = Color(0xFFF3EDF4),
    surfaceContainerHigh = Color(0xFFEDE7EE),
    surfaceContainerHighest = Color(0xFFE7E1E8)
)

private val darkScheme = darkColorScheme(
    primary = Color(0xFFD69AFF),
    onPrimary = Color(0xFF430078),
    primaryContainer = Color(0xFF5A189A),
    onPrimaryContainer = Color(0xFFEEDCFF),

    secondary = Color(0xFFD0A0F5),
    onSecondary = Color(0xFF35104F),
    secondaryContainer = Color(0xFF51206D),
    onSecondaryContainer = Color(0xFFEEDCFF),

    tertiary = Color(0xFFE0AAFF),
    onTertiary = Color(0xFF3A005F),
    tertiaryContainer = Color(0xFF6B2490),
    onTertiaryContainer = Color(0xFFF3DFFF),

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),

    background = Color(0xFF151019),
    onBackground = Color(0xFFEDE5EE),

    surface = Color(0xFF151019),
    onSurface = Color(0xFFEDE5EE),

    surfaceVariant = Color(0xFF4D4550),
    onSurfaceVariant = Color(0xFFD0C4D2),

    outline = Color(0xFF978D9A),
    outlineVariant = Color(0xFF4D4550),

    scrim = Color.Black,

    inverseSurface = Color(0xFFEDE5EE),
    inverseOnSurface = Color(0xFF322D33),
    inversePrimary = Color(0xFF7B2CBF),

    surfaceDim = Color(0xFF151019),
    surfaceBright = Color(0xFF3B343D),
    surfaceContainerLowest = Color(0xFF100C13),
    surfaceContainerLow = Color(0xFF1E1820),
    surfaceContainer = Color(0xFF211B23),
    surfaceContainerHigh = Color(0xFF2C252E),
    surfaceContainerHighest = Color(0xFF373038)
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = Color(0xFF6923A8),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFD69AFF),
    onPrimaryContainer = Color(0xFF25003F),

    secondary = Color(0xFF8238BD),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFE0AAFF),
    onSecondaryContainer = Color(0xFF2D0645),

    tertiary = Color(0xFF4E0E88),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFE0AAFF),
    onTertiaryContainer = Color(0xFF23003A),

    error = Color(0xFFBA1A1A),
    onError = Color.White,
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    background = Color(0xFFF8F3FC),
    onBackground = Color(0xFF1C1720),

    surface = Color(0xFFFFFBFF),
    onSurface = Color(0xFF1C1720),

    surfaceVariant = Color(0xFFE8DDEB),
    onSurfaceVariant = Color(0xFF4D4550),

    outline = Color(0xFF665D68),
    outlineVariant = Color(0xFF8D838F),

    scrim = Color.Black,

    inverseSurface = Color(0xFF312D33),
    inverseOnSurface = Color(0xFFF5EFF6),
    inversePrimary = Color(0xFFD69AFF),

    surfaceDim = Color(0xFFDED8DF),
    surfaceBright = Color(0xFFFFFBFF),
    surfaceContainerLowest = Color.White,
    surfaceContainerLow = Color(0xFFF9F3FA),
    surfaceContainer = Color(0xFFF3EDF4),
    surfaceContainerHigh = Color(0xFFEDE7EE),
    surfaceContainerHighest = Color(0xFFE7E1E8)
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = Color(0xFF4F0085),
    onPrimary = Color.White,
    primaryContainer = Color(0xFF7B2CBF),
    onPrimaryContainer = Color.White,

    secondary = Color(0xFF5F1595),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFF9D4EDD),
    onSecondaryContainer = Color.White,

    tertiary = Color(0xFF420075),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFF7B2CBF),
    onTertiaryContainer = Color.White,

    error = Color(0xFF8C0009),
    onError = Color.White,
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    background = Color(0xFFF8F3FC),
    onBackground = Color(0xFF000000),

    surface = Color.White,
    onSurface = Color(0xFF000000),

    surfaceVariant = Color(0xFFE8DDEB),
    onSurfaceVariant = Color(0xFF000000),

    outline = Color(0xFF403841),
    outlineVariant = Color(0xFF5C535F),

    scrim = Color.Black,

    inverseSurface = Color(0xFF1C1720),
    inverseOnSurface = Color.White,
    inversePrimary = Color(0xFFE0AAFF),

    surfaceDim = Color(0xFFDED8DF),
    surfaceBright = Color.White,
    surfaceContainerLowest = Color.White,
    surfaceContainerLow = Color(0xFFF9F3FA),
    surfaceContainer = Color(0xFFF3EDF4),
    surfaceContainerHigh = Color(0xFFEDE7EE),
    surfaceContainerHighest = Color(0xFFE7E1E8)
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = Color(0xFFE0AAFF),
    onPrimary = Color(0xFF35005F),
    primaryContainer = Color(0xFF7B2CBF),
    onPrimaryContainer = Color.White,

    secondary = Color(0xFFD9A7FF),
    onSecondary = Color(0xFF300048),
    secondaryContainer = Color(0xFF6B2490),
    onSecondaryContainer = Color(0xFFF3DFFF),

    tertiary = Color(0xFFE0AAFF),
    onTertiary = Color(0xFF320052),
    tertiaryContainer = Color(0xFF7B2CBF),
    onTertiaryContainer = Color.White,

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),

    background = Color(0xFF151019),
    onBackground = Color(0xFFEDE5EE),

    surface = Color(0xFF151019),
    onSurface = Color(0xFFEDE5EE),

    surfaceVariant = Color(0xFF4D4550),
    onSurfaceVariant = Color(0xFFD0C4D2),

    outline = Color(0xFFB0A5B2),
    outlineVariant = Color(0xFF7D747F),

    scrim = Color.Black,

    inverseSurface = Color(0xFFEDE5EE),
    inverseOnSurface = Color(0xFF322D33),
    inversePrimary = Color(0xFF7B2CBF),

    surfaceDim = Color(0xFF151019),
    surfaceBright = Color(0xFF3B343D),
    surfaceContainerLowest = Color(0xFF100C13),
    surfaceContainerLow = Color(0xFF1E1820),
    surfaceContainer = Color(0xFF211B23),
    surfaceContainerHigh = Color(0xFF2C252E),
    surfaceContainerHighest = Color(0xFF373038)
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = Color(0xFFF0C4FF),
    onPrimary = Color(0xFF25003F),
    primaryContainer = Color(0xFF9D4EDD),
    onPrimaryContainer = Color.White,

    secondary = Color(0xFFE0AAFF),
    onSecondary = Color(0xFF26003D),
    secondaryContainer = Color(0xFF7B2CBF),
    onSecondaryContainer = Color.White,

    tertiary = Color(0xFFE0AAFF),
    onTertiary = Color(0xFF26003D),
    tertiaryContainer = Color(0xFF9D4EDD),
    onTertiaryContainer = Color.White,

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),

    background = Color(0xFF151019),
    onBackground = Color.White,

    surface = Color(0xFF151019),
    onSurface = Color.White,

    surfaceVariant = Color(0xFF4D4550),
    onSurfaceVariant = Color.White,

    outline = Color(0xFFD0C4D2),
    outlineVariant = Color(0xFF978D9A),

    scrim = Color.Black,

    inverseSurface = Color.White,
    inverseOnSurface = Color(0xFF151019),
    inversePrimary = Color(0xFF7B2CBF),

    surfaceDim = Color(0xFF151019),
    surfaceBright = Color(0xFF3B343D),
    surfaceContainerLowest = Color(0xFF100C13),
    surfaceContainerLow = Color(0xFF1E1820),
    surfaceContainer = Color(0xFF211B23),
    surfaceContainerHigh = Color(0xFF2C252E),
    surfaceContainerHighest = Color(0xFF373038)
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified,
    Color.Unspecified,
    Color.Unspecified,
    Color.Unspecified
)

@Composable
fun CarteirinhaDigital2DEVEST_BTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        darkTheme -> darkScheme
        else -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}

