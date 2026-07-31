package com.github.kr328.clash.design.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = Catppuccin.Latte.Sapphire,
    onPrimary = Catppuccin.Latte.Base,
    primaryContainer = Catppuccin.Latte.Sky,
    onPrimaryContainer = Catppuccin.Latte.Crust,
    secondary = Catppuccin.Latte.Mauve,
    onSecondary = Catppuccin.Latte.Base,
    secondaryContainer = Catppuccin.Latte.Lavender,
    onSecondaryContainer = Catppuccin.Latte.Crust,
    tertiary = Catppuccin.Latte.Teal,
    onTertiary = Catppuccin.Latte.Base,
    tertiaryContainer = Catppuccin.Latte.Sky,
    onTertiaryContainer = Catppuccin.Latte.Crust,
    background = Catppuccin.Latte.Base,
    onBackground = Catppuccin.Latte.Text,
    surface = Catppuccin.Latte.Surface0,
    onSurface = Catppuccin.Latte.Text,
    surfaceVariant = Catppuccin.Latte.Surface1,
    onSurfaceVariant = Catppuccin.Latte.Subtext0,
    surfaceContainerLowest = Catppuccin.Latte.Base,
    surfaceContainerLow = Catppuccin.Latte.Surface0,
    surfaceContainer = Catppuccin.Latte.Surface1,
    surfaceContainerHigh = Catppuccin.Latte.Surface2,
    surfaceContainerHighest = Catppuccin.Latte.Overlay0,
    error = Catppuccin.Latte.Red,
    onError = Catppuccin.Latte.Base,
    errorContainer = Catppuccin.Latte.Maroon,
    onErrorContainer = Catppuccin.Latte.Crust,
    outline = Catppuccin.Latte.Overlay1,
    outlineVariant = Catppuccin.Latte.Surface2,
    inverseSurface = Catppuccin.Latte.Crust,
    inverseOnSurface = Catppuccin.Latte.Base,
    inversePrimary = Catppuccin.Latte.Sky,
    scrim = Catppuccin.Latte.Crust.copy(alpha = 0.5f),
)

private val DarkColorScheme = darkColorScheme(
    primary = Catppuccin.Mocha.Sapphire,
    onPrimary = Catppuccin.Mocha.Crust,
    primaryContainer = Catppuccin.Mocha.Sky,
    onPrimaryContainer = Catppuccin.Mocha.Crust,
    secondary = Catppuccin.Mocha.Mauve,
    onSecondary = Catppuccin.Mocha.Crust,
    secondaryContainer = Catppuccin.Mocha.Lavender,
    onSecondaryContainer = Catppuccin.Mocha.Crust,
    tertiary = Catppuccin.Mocha.Teal,
    onTertiary = Catppuccin.Mocha.Crust,
    tertiaryContainer = Catppuccin.Mocha.Sky,
    onTertiaryContainer = Catppuccin.Mocha.Crust,
    background = Catppuccin.Mocha.Base,
    onBackground = Catppuccin.Mocha.Text,
    surface = Catppuccin.Mocha.Surface0,
    onSurface = Catppuccin.Mocha.Text,
    surfaceVariant = Catppuccin.Mocha.Surface1,
    onSurfaceVariant = Catppuccin.Mocha.Subtext0,
    surfaceContainerLowest = Catppuccin.Mocha.Base,
    surfaceContainerLow = Catppuccin.Mocha.Surface0,
    surfaceContainer = Catppuccin.Mocha.Surface1,
    surfaceContainerHigh = Catppuccin.Mocha.Surface2,
    surfaceContainerHighest = Catppuccin.Mocha.Overlay0,
    error = Catppuccin.Mocha.Red,
    onError = Catppuccin.Mocha.Crust,
    errorContainer = Catppuccin.Mocha.Maroon,
    onErrorContainer = Catppuccin.Mocha.Crust,
    outline = Catppuccin.Mocha.Overlay1,
    outlineVariant = Catppuccin.Mocha.Surface2,
    inverseSurface = Catppuccin.Mocha.Surface1,
    inverseOnSurface = Catppuccin.Mocha.Text,
    inversePrimary = Catppuccin.Mocha.Sapphire,
    scrim = Catppuccin.Mocha.Crust.copy(alpha = 0.5f),
)

/**
 * Catppuccin Compose theme for the design module.
 *
 * Dynamic color is intentionally disabled: the fixed Catppuccin palette
 * must not be overridden by Material You wallpaper colors on Android 12+.
 * No Typography / Shapes — the app currently consumes colors only.
 */
@Composable
fun ClashTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        content = content,
    )
}
