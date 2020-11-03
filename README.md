# Sistema de Gerenciamento de Impressoes
 Sistema que Gerencia Impressoes
Crie uma pasta chamada  caixa , crie quatro arquivos TXT chamado de
arquivo_id_venda.txt
Caixa_impressão_historico.txt
entrada_caixa_impressao.txt
NotaFiscal_Cliente.txt
Dentro da pasta caixa ela tem que ficar no disco  C: para a aplicação funcionar, adicione valor 0 no arquivo_id_venda.txt e 0 no arquvio entrada_caixa_impressao.txt


![](https://github.com/pitagph/Sistema-de-Gerenciamento-de-Impressoes/blob/main/dist/tela.jpg?raw=true)

========================
BUILD OUTPUT DESCRIPTION
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "SistemaImpressao.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
