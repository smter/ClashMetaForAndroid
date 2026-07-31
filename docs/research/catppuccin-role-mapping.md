# Catppuccin 语义角色映射表（latte / mocha）

> 来源：wayfinder 票「定义 Catppuccin 语义角色映射表（latte/mocha）」(#2) 的 grilling 决议。
> 主色定为 Sapphire；所有色值均为 Catppuccin 调色板原生色（手选映射，无派生）。

## Material3 colorScheme

### Latte (light)

| 角色 | Catppuccin | Hex |
|---|---|---|
| primary | Sapphire | #209fb5 |
| onPrimary | Base | #eff1f5 |
| primaryContainer | Sky | #04a5e5 |
| onPrimaryContainer | Crust | #dce0e8 |
| secondary | Mauve | #8839ef |
| onSecondary | Base | #eff1f5 |
| secondaryContainer | Lavender | #7287fd |
| onSecondaryContainer | Crust | #dce0e8 |
| tertiary | Teal | #179299 |
| onTertiary | Base | #eff1f5 |
| tertiaryContainer | Sky | #04a5e5 |
| onTertiaryContainer | Crust | #dce0e8 |
| background | Base | #eff1f5 |
| onBackground | Text | #4c4f69 |
| surface | Surface0 | #ccd0da |
| onSurface | Text | #4c4f69 |
| surfaceVariant | Surface1 | #bcc0cc |
| onSurfaceVariant | Subtext0 | #6c6f85 |
| surfaceContainerLowest | Base | #eff1f5 |
| surfaceContainerLow | Surface0 | #ccd0da |
| surfaceContainer | Surface1 | #bcc0cc |
| surfaceContainerHigh | Surface2 | #acb0be |
| surfaceContainerHighest | Overlay0 | #9ca0b0 |
| error | Red | #d20f39 |
| onError | Base | #eff1f5 |
| errorContainer | Maroon | #e64553 |
| onErrorContainer | Crust | #dce0e8 |
| outline | Overlay1 | #8c8fa1 |
| outlineVariant | Surface2 | #acb0be |
| inverseSurface | Crust | #dce0e8 |
| inverseOnSurface | Base | #eff1f5 |
| inversePrimary | Sky | #04a5e5 |
| scrim | Crust @ 50% | #dce0e8 |

### Mocha (night)

| 角色 | Catppuccin | Hex |
|---|---|---|
| primary | Sapphire | #74c7ec |
| onPrimary | Crust | #11111b |
| primaryContainer | Sky | #89dceb |
| onPrimaryContainer | Crust | #11111b |
| secondary | Mauve | #cba6f7 |
| onSecondary | Crust | #11111b |
| secondaryContainer | Lavender | #b4befe |
| onSecondaryContainer | Crust | #11111b |
| tertiary | Teal | #94e2d5 |
| onTertiary | Crust | #11111b |
| tertiaryContainer | Sky | #89dceb |
| onTertiaryContainer | Crust | #11111b |
| background | Base | #1e1e2e |
| onBackground | Text | #cdd6f4 |
| surface | Surface0 | #313244 |
| onSurface | Text | #cdd6f4 |
| surfaceVariant | Surface1 | #45475a |
| onSurfaceVariant | Subtext0 | #a6adc8 |
| surfaceContainerLowest | Base | #1e1e2e |
| surfaceContainerLow | Surface0 | #313244 |
| surfaceContainer | Surface1 | #45475a |
| surfaceContainerHigh | Surface2 | #585b70 |
| surfaceContainerHighest | Overlay0 | #6c7086 |
| error | Red | #f38ba8 |
| onError | Crust | #11111b |
| errorContainer | Maroon | #eba0ac |
| onErrorContainer | Crust | #11111b |
| outline | Overlay1 | #7f849c |
| outlineVariant | Surface2 | #585b70 |
| inverseSurface | Surface1 | #45475a |
| inverseOnSurface | Text | #cdd6f4 |
| inversePrimary | Sapphire | #74c7ec |
| scrim | Crust @ 50% | #11111b |

## XML 主题角色（design 模块）

| 角色 | Latte | Mocha |
|---|---|---|
| colorPrimary | Sapphire #209fb5 | Sapphire #74c7ec |
| colorOnPrimary | Base #eff1f5 | Crust #11111b |
| colorSurface | Surface0 #ccd0da | Surface0 #313244 |
| colorControlNormal（文本） | Text #4c4f69 | Text #cdd6f4 |
| colorControlActivated | Sapphire #209fb5 | Sapphire #74c7ec |
| colorControlDisabled | Overlay0 #9ca0b0 | Overlay1 #7f849c |
| colorClashStopped（中性灰） | Overlay1 #8c8fa1 | Overlay0 #6c7086 |
| colorLogo（light） | colorControlActivated | colorControlNormal |
| colorError | Red #d20f39 | Red #f38ba8 |
| android:windowBackground | Base #eff1f5 | Base #1e1e2e |
| color_system_ui_overlay | Crust(mocha) #11111b @ 31% | Crust #11111b @ 31% |

## 已定决策（grilling 决议）

1. 映射方式：手选映射——每个角色从 26 色调色板原生选择，无派生色
2. 主色：Sapphire（非 Blue；品牌图标 #3372b6→Blue 的映射不受影响，主题主色独立为 Sapphire）
3. 强调家族：secondary=Mauve、tertiary=Teal、primaryContainer=Sky
4. colorClashStopped：中性灰（latte=Overlay1、mocha=Overlay0）
5. background/surface 分层：background=Base、surface=Surface0
6. color_system_ui_overlay：Crust 深遮罩 @ 31% alpha（latte 也取 mocha Crust 保持遮罩功能性）
7. dynamicColor 关闭（charter 已定）
