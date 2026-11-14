HDMI Launcher - projeto Android mínimo

O que faz:
- Instala-se como aplicativo comum chamado HDMI.
- Aparece em launchers Android/Android TV por meio dos filtros LAUNCHER e LEANBACK_LAUNCHER.
- Ao abrir, inicia explicitamente a Activity HDMI que foi testada no projetor:
  pacote: com.droidlogic.android.tv
  classe: com.android.tv.MainActivity

Importante:
Este pacote contém o PROJETO-FONTE, não um APK já compilado. O ambiente de criação não possui Android SDK/Gradle instalados, então não foi possível compilar e validar um APK aqui.

Como gerar o APK no Windows:
1. Instale/abra o Android Studio.
2. Escolha "Open" e selecione a pasta HDMI_Launcher_App extraída.
3. Aguarde o Gradle Sync. Se solicitado, permita instalar Android SDK Platform 35 e Build Tools.
4. No menu: Build > Build Bundle(s) / APK(s) > Build APK(s).
5. O APK será criado em:
   app\build\outputs\apk\debug\app-debug.apk

Como instalar no projetor via ADB (com o APK no diretório platform-tools):
  adb install -r app-debug.apk

Depois:
- No TV Launcher, procure HDMI na lista de aplicativos.
- Adicione-o à tela inicial/favoritos.
- Abra HDMI: ele deve encaminhar para a tela HDMI nativa.

Se o projetor negar o lançamento:
- Não altere o HOME nem desinstale launchers.
- Envie a mensagem de erro; o componente de destino pode variar entre versões de firmware.

Não contém analytics, internet, permissões de rede, anúncios ou telemetria própria.
