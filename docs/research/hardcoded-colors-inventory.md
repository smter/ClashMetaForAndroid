# 硬编码颜色清单 (Hardcoded Color Inventory)

Companion research for [ClashMetaForAndroid 界面配色 Catppuccin 规范化](https://github.com/smter/ClashMetaForAndroid/issues/1) — ticket [盘点全仓硬编码颜色清单](https://github.com/smter/ClashMetaForAndroid/issues/3).

Branch: `research/hardcoded-colors-inventory`. Scanned every `src/main/res` tree (app, design, service, common; core/hideapi have no res) plus Kotlin/Java sources for color literals (`0xFF…`, `Color.parseColor/rgb/argb`, `android.R.color`, `ColorStateList`, runtime tint APIs). XML colors include `#RRGGBB`/`#AARRGGBB` literals and `@android:color/…` platform references.

Classification legend:

| Class | Meaning |
|---|---|
| `theme-tokenizable` | UI surface/text/accent hex that could reference a theme attr / Catppuccin token |
| `brand-icon` | launcher/banner/logo vector artwork colors |
| `functional` | transparent (`#00000000`), pure black/white used functionally, platform refs |
| `runtime-tinted` | color overridden at runtime (tint/`setColorFilter`/`imageTintList`/`ColorStateList`); tint source noted |

---

## app module

### values/colors.xml

| Location | Value | Class | Note |
|---|---|---|---|
| `app/src/main/res/values/colors.xml:3` | `#FFFFFF` | brand-icon | `color_launcher_background`; launcher bg color — **unreferenced** (mipmaps use `@color/ic_launcher_background` instead) |

### values/ (plain color resources)

| Location | Value | Class | Note |
|---|---|---|---|
| `app/src/main/res/values/ic_launcher_background.xml:3` | `#FFFFFF` | brand-icon | adaptive-icon background (`mipmap-anydpi-v26/ic_launcher{,_round}.xml`) |
| `app/src/main/res/values/ic_banner_background.xml:3` | `#FFFFFF` | brand-icon | Play store banner background |

### drawable/

| Location | Value | Class | Note |
|---|---|---|---|
| `app/src/main/res/drawable/ic_launcher_foreground.xml:11` | `#3372b6` | brand-icon | Clash logo blue (matches `design/.../ic_clash.xml`) |
| `app/src/main/res/drawable/ic_launcher_foreground.xml:14` | `#f39800` | brand-icon | Clash logo orange |
| `app/src/main/res/drawable/ic_toggle_all.xml:13,20,27,34` | `#00000000` | functional | transparent fill |
| `app/src/main/res/drawable/ic_toggle_all.xml:15,22,29,36` | `#000000` | functional | stroke; shortcut glyph (launcher shortcut `MainActivity.kt:179`) |
| `app/src/main/res/drawable/ic_toggle_off.xml:13,20,27,34` | `#00000000` | functional | transparent fill |
| `app/src/main/res/drawable/ic_toggle_off.xml:15,22,29,36` | `#000000` | functional | stroke; shortcut glyph (`MainActivity.kt:203`) |
| `app/src/main/res/drawable/ic_toggle_on.xml:13,20` | `#00000000` | functional | transparent fill |
| `app/src/main/res/drawable/ic_toggle_on.xml:15,22` | `#000000` | functional | stroke; shortcut glyph (`MainActivity.kt:191`) |

## design module

### values/colors.xml

| Location | Value | Class | Note |
|---|---|---|---|
| `design/src/main/res/values/colors.xml:3` | `#1e4376` | theme-tokenizable | `color_clash_light` — brand blue, duplicate of service `color_clash` |
| `design/src/main/res/values/colors.xml:4` | `#1976d2` | theme-tokenizable | `color_clash_dark` |
| `design/src/main/res/values/colors.xml:5` | `#50000000` | functional | `color_system_ui_overlay` — translucent scrim for nav bar |
| `design/src/main/res/values/colors.xml:6` | `#FFFAFAFA` | theme-tokenizable | `color_light_background` |
| `design/src/main/res/values/colors.xml:7` | `#FF121212` | theme-tokenizable | `color_dark_background` |
| `design/src/main/res/values/colors.xml:8` | `#FF202020` | theme-tokenizable | `color_dark_surface` |
| `design/src/main/res/values/colors.xml:9` | `#FF808080` | theme-tokenizable | `color_light_clash_stopped` |
| `design/src/main/res/values/colors.xml:10` | `#FFD3D3D3` | theme-tokenizable | `color_light_control_disabled` |
| `design/src/main/res/values/colors.xml:11` | `#FF808080` | theme-tokenizable | `color_dark_control_disabled` |
| `design/src/main/res/values/colors.xml:12` | `#FFB00020` | theme-tokenizable | `color_error` (Material error red) |

### values/themes.xml — platform color refs

| Location | Value | Class | Note |
|---|---|---|---|
| `design/src/main/res/values/themes.xml:17` | `@android:color/white` | functional | `colorOnPrimary` (AppFullScreenDialogLightBase) |
| `design/src/main/res/values/themes.xml:18` | `@android:color/black` | functional | `colorControlNormal` (AppFullScreenDialogLightBase) |
| `design/src/main/res/values/themes.xml:40` | `@android:color/white` | functional | `colorOnPrimary` (AppFullScreenDialogDarkBase) |
| `design/src/main/res/values/themes.xml:54` | `@android:color/transparent` | functional | `android:statusBarColor` (AppFullScreenDialogLight) |
| `design/src/main/res/values/themes.xml:59` | `@android:color/transparent` | functional | `android:statusBarColor` (AppFullScreenDialogDark) |
| `design/src/main/res/values/themes.xml:60` | `@android:color/transparent` | functional | `android:navigationBarColor` (AppFullScreenDialogDark) |
| `design/src/main/res/values/themes.xml:70` | `@android:color/white` | functional | `colorOnPrimary` (AppBottomSheetDialogLightBase) |
| `design/src/main/res/values/themes.xml:71` | `@android:color/black` | functional | `colorControlNormal` (AppBottomSheetDialogLightBase) |
| `design/src/main/res/values/themes.xml:91` | `@android:color/white` | functional | `colorOnPrimary` (AppBottomSheetDialogDarkBase) |
| `design/src/main/res/values/themes.xml:106` | `@android:color/transparent` | functional | `android:statusBarColor` (AppBottomSheetDialogLight) |
| `design/src/main/res/values/themes.xml:111` | `@android:color/transparent` | functional | `android:statusBarColor` (AppBottomSheetDialogDark) |
| `design/src/main/res/values/themes.xml:112` | `@android:color/transparent` | functional | `android:navigationBarColor` (AppBottomSheetDialogDark) |
| `design/src/main/res/values/themes.xml:121` | `@android:color/white` | functional | `colorOnPrimary` (AppThemeLightBase) |
| `design/src/main/res/values/themes.xml:122` | `@android:color/black` | functional | `colorControlNormal` (AppThemeLightBase) |
| `design/src/main/res/values/themes.xml:143` | `@android:color/white` | functional | `colorOnPrimary` (AppThemeDarkBase) |
| `design/src/main/res/values/themes.xml:145` | `@android:color/white` | functional | `colorControlNormal` (AppThemeDarkBase) — **dark theme sets control color to white** |
| `design/src/main/res/values/themes.xml:166` | `@android:color/transparent` | functional | `android:statusBarColor` (AppThemeDark) |
| `design/src/main/res/values/themes.xml:167` | `@android:color/transparent` | functional | `android:navigationBarColor` (AppThemeDark) |

### values-v23/v27/v29/themes.xml — transparent system bars (functional)

| Location | Value | Class | Note |
|---|---|---|---|
| `design/src/main/res/values-v23/themes.xml:4,10,16,22,28,34` | `@android:color/transparent` | functional | `android:statusBarColor` (edge-to-edge window styles) |
| `design/src/main/res/values-v23/themes.xml:11,23,35` | `@android:color/transparent` | functional | `android:navigationBarColor` |
| `design/src/main/res/values-v27/themes.xml:4,12,20,28,36,44` | `@android:color/transparent` | functional | `android:statusBarColor` |
| `design/src/main/res/values-v27/themes.xml:5,13,21,29,37,45` | `@android:color/transparent` | functional | `android:navigationBarColor` |
| `design/src/main/res/values-v27/themes.xml:6,14,22,30,38,46` | `@android:color/transparent` | functional | `android:navigationBarDividerColor` |
| `design/src/main/res/values-v29/themes.xml:4,13,22,31,40,49` | `@android:color/transparent` | functional | `android:statusBarColor` |
| `design/src/main/res/values-v29/themes.xml:5,14,23,32,41,50` | `@android:color/transparent` | functional | `android:navigationBarColor` |

### drawable/ — icon vectors (49 files)

All 49 icons: fill `@android:color/white` (lines 7–9) + `android:tint="?attr/colorControlNormal"` (line 4; `ic_baseline_get_app.xml:6`). The white fill is overridden by the tint at inflation → runtime-tinted. `ic_baseline_flash_on` additionally gets tinted to `colorOnPrimary` at runtime (see Kotlin section).

| File (under `design/src/main/res/drawable/`) | Fill line | Tint line |
|---|---|---|
| `baseline_qr_code_scanner.xml` | 7 | 4 |
| `ic_baseline_adb.xml` | 8 | 4 |
| `ic_baseline_add.xml` | 8 | 4 |
| `ic_baseline_apps.xml` | 8 | 4 |
| `ic_baseline_arrow_back.xml` | 8 | 4 |
| `ic_baseline_assignment.xml` | 8 | 4 |
| `ic_baseline_attach_file.xml` | 8 | 4 |
| `ic_baseline_brightness_4.xml` | 8 | 4 |
| `ic_baseline_clear_all.xml` | 8 | 4 |
| `ic_baseline_close.xml` | 8 | 4 |
| `ic_baseline_cloud_download.xml` | 8 | 4 |
| `ic_baseline_content_copy.xml` | 8 | 4 |
| `ic_baseline_delete.xml` | 8 | 4 |
| `ic_baseline_dns.xml` | 8 | 4 |
| `ic_baseline_domain.xml` | 8 | 4 |
| `ic_baseline_edit.xml` | 8 | 4 |
| `ic_baseline_extension.xml` | 8 | 4 |
| `ic_baseline_flash_on.xml` | 8 | 4 |
| `ic_baseline_get_app.xml` | 8 | 6 |
| `ic_baseline_help_center.xml` | 8 | 4 |
| `ic_baseline_hide.xml` | 9 | 4 |
| `ic_baseline_info.xml` | 8 | 4 |
| `ic_baseline_key.xml` | 8 | 4 |
| `ic_baseline_meta.xml` | 8 | 4 |
| `ic_baseline_more_vert.xml` | 8 | 4 |
| `ic_baseline_publish.xml` | 8 | 4 |
| `ic_baseline_replay.xml` | 8 | 4 |
| `ic_baseline_restore.xml` | 8 | 4 |
| `ic_baseline_save.xml` | 8 | 4 |
| `ic_baseline_search.xml` | 8 | 4 |
| `ic_baseline_settings.xml` | 8 | 4 |
| `ic_baseline_stack.xml` | 8 | 4 |
| `ic_baseline_stop.xml` | 8 | 4 |
| `ic_baseline_swap_vert.xml` | 8 | 4 |
| `ic_baseline_swap_vertical_circle.xml` | 8 | 4 |
| `ic_baseline_sync.xml` | 8 | 4 |
| `ic_baseline_update.xml` | 8 | 4 |
| `ic_baseline_view_list.xml` | 8 | 4 |
| `ic_baseline_vpn_lock.xml` | 8 | 4 |
| `ic_baseline_work.xml` | 8 | 4 |
| `ic_outline_article.xml` | 8 | 4 |
| `ic_outline_check_circle.xml` | 8 | 4 |
| `ic_outline_delete.xml` | 8 | 4 |
| `ic_outline_folder.xml` | 8 | 4 |
| `ic_outline_inbox.xml` | 8 | 4 |
| `ic_outline_info.xml` | 8 | 4 |
| `ic_outline_label.xml` | 8 | 4 |
| `ic_outline_not_interested.xml` | 8 | 4 |
| `ic_outline_update.xml` | 8 | 4 |

### drawable/ — logo artwork

| Location | Value | Class | Note |
|---|---|---|---|
| `design/src/main/res/drawable/ic_clash.xml:10` | `#3372b6` | brand-icon | Clash logo blue; used as `android:background` (`design_about.xml:19`, `design_main.xml:70`), not tinted |
| `design/src/main/res/drawable/ic_clash.xml:13` | `#f39800` | brand-icon | Clash logo orange |

### layout/

| Location | Value | Class | Note |
|---|---|---|---|
| `design/src/main/res/layout/design_proxy.xml:106` | `@android:color/transparent` | functional | `app:tabBackground` on proxy tabs |

### Kotlin — runtime color composition

| Location | Value | Class | Note |
|---|---|---|---|
| `design/src/main/java/com/github/kr328/clash/design/ProxyDesign.kt:110-112` | — (attr) | runtime-tinted | `url_test_float_view` (FAB, drawable `ic_baseline_flash_on`, `design_proxy.xml:131`): `supportImageTintList = ColorStateList.valueOf(resolveThemedColor(colorOnPrimary))` — overrides the icon's `colorControlNormal` tint |
| `design/src/main/java/com/github/kr328/clash/design/adapter/PopupListAdapter.kt:43-50` | — (attr) | runtime-tinted | selected row bg = `Color.argb(200, colorPrimary…)` — `colorPrimary` @ 78% alpha; text = `colorOnPrimary` |
| `design/src/main/java/com/github/kr328/clash/design/adapter/PopupListAdapter.kt:53` | `Color.TRANSPARENT` | functional | unselected row bg |
| `design/src/main/java/com/github/kr328/clash/design/component/ProxyViewConfig.kt:21` | `Color.TRANSPARENT` | functional | unselected proxy background on single-line layout |
| `design/src/main/java/com/github/kr328/clash/design/component/ProxyViewConfig.kt:31-35` | `Color.DKGRAY` (=`#444444`) @ alpha `0x15` | functional | card elevation shadow = `#21444444`, painted on canvas |

Note: `ProxyViewState.kt:111-117` interpolates colors between theme-resolved values (`Color.argb` over `Color.red/green/blue/alpha` of current/target) — no hardcoded literals; left as-is. `ActivityBarLayout.kt:20` / `LargeActionCard.kt:63` resolve `windowBackground` / `colorSurface` from theme attrs — clean.

## service module

| Location | Value | Class | Note |
|---|---|---|---|
| `service/src/main/res/values/colors.xml:3` | `#1E4376` | theme-tokenizable | `color_clash` — brand blue, **duplicate** of design `color_clash_light`; used in notification `.setColor()` (ProfileWorker, Static/DynamicNotificationModule) |
| `service/src/main/res/drawable/ic_logo_service.xml:10` | `#FFFFFFFF` | brand-icon | service logo, white monochrome for notification small icons (`LogcatService.kt:141`, `ProfileWorker.kt:122,137,165`, `Static/DynamicNotificationModule`), Quick Settings tile (`TileService.kt:80`, `AndroidManifest.xml:202`), DocumentsUI (`FilesProvider.kt:164`) |

## common / core / hideapi modules

No hardcoded colors. `common/.../compat/Context.kt:16-18` is a `ContextCompat.getColor` wrapper (no literals); `core/.../util/Traffic.kt:10,15` `0xFFFFFFFF` are bit masks, not colors; `common/.../UndefinedIds.kt:4-5` `0x14000000`/`0x00FFFFFF` are ID constants.

---

## Counts

### Per module

| Module | theme-tokenizable | brand-icon | functional | runtime-tinted | Total |
|---|---|---|---|---|---|
| app | 0 | 5 | 20 | 0 | 25 |
| design | 10 | 2 | 61 | 51 | 124 |
| service | 1 | 1 | 0 | 0 | 2 |
| common / core / hideapi | 0 | 0 | 0 | 0 | 0 |
| **Total** | **11** | **8** | **81** | **51** | **151** |

### Per classification (total)

| Classification | Count | Main constituents |
|---|---|---|
| `functional` | 81 | transparent system bars (57 theme entries), `ic_toggle_*` black/transparent glyphs (20), overlay scrim, misc |
| `runtime-tinted` | 51 | 49 icon vectors (`@android:color/white` + `?attr/colorControlNormal`), FAB tint override, popup selected bg |
| `theme-tokenizable` | 11 | design `colors.xml` (10), service `color_clash` (1) |
| `brand-icon` | 8 | `ic_clash` / launcher foreground `#3372b6`+`#f39800`, launcher/banner backgrounds, service logo |

## Key observations for the Catppuccin map (#1)

1. The XML design system is already theme-driven (layouts/themes reference `@color/` and `?attr/`); only `design/values/colors.xml` + `service/values/colors.xml` hold literal palette hexes → the 11 `theme-tokenizable` entries are the actual palette to map.
2. `color_clash_light` (#1e4376) and service `color_clash` (#1E4376) are duplicate definitions of the same brand blue across modules — dedupe during tokenization.
3. `colorControlNormal` = `@android:color/black` (light) / `@android:color/white` (dark) in `themes.xml:18,71,122,145` is the one platform-color leak into semantic tokens; the rest of `@android:color` usage is functional transparency.
4. Icon tinting is centralized on `?attr/colorControlNormal` (49 vectors) — Catppuccin adoption can rely on the single `colorControlNormal` token; only `ic_baseline_flash_on` (url-test FAB) is re-tinted to `colorOnPrimary` at runtime.
