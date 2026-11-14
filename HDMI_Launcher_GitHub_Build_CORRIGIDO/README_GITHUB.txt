HDMI Launcher — pacote pronto para GitHub Actions

Este ZIP já está organizado com a estrutura correta na raiz do repositório.
Não envie este ZIP fechado ao GitHub: extraia-o e envie TODO o conteúdo extraído.

ESTRUTURA ESPERADA NA RAIZ DO REPOSITÓRIO:
  .github/workflows/build-apk.yml
  app/
  build.gradle
  gradle.properties
  settings.gradle

COMO PUBLICAR:
1. No repositório HDMI-LAUNCHER-CLOUD-BUILD, abra a aba Code.
2. Apague o arquivo HDMI_Launcher_App_Source.zip, se ele ainda estiver lá.
3. Apague o workflow antigo em .github/workflows, se existir, antes de enviar este novo.
4. Extraia este ZIP no computador.
5. Envie TODO o conteúdo que está dentro da pasta extraída para a raiz do repositório.
   IMPORTANTE: a pasta .github precisa ser enviada também.
6. Faça Commit changes na branch main.
7. Abra Actions e selecione "Build HDMI APK".
8. Se necessário, clique em Run workflow.
9. Quando a execução ficar verde, abra-a e baixe o artefato HDMI-debug-APK.
10. Extraia o artefato baixado: o arquivo app-debug.apk estará dentro.

INSTALAÇÃO:
Instale app-debug.apk no projetor Android. O aplicativo aparece como HDMI.
Ao abrir, ele tenta iniciar o componente nativo confirmado no aparelho:
com.droidlogic.android.tv/com.android.tv.MainActivity

OBSERVAÇÃO:
Este pacote corrige a organização do projeto e a configuração do workflow.
A compilação precisa ser confirmada pelo GitHub Actions e o comportamento final
precisa ser testado no projetor.
