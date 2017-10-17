# Drools-WebService

Web Service de Drools

------------Instalación Previa------------

1_ Instalación del IDE
Descargar Eclipse IDE for Java Developers: https://eclipse.org/downloads/

2_ Instalar Java
Verificar tener Java de 64 bits si descargamos Eclipse de 64 bits

3_ Instalar GEF
GEF es el Eclipse Graphical Editing Framework, es usado para permitir visualizar componentes
gráficos que brinda el plug-in de Drools.
  
  3.1_ Abrir Eclipse y seleccionamos en el menú:/Help/Install New Software
  
  3.2_ En el cuadro que nos aparece ponemos el siguiente link y presionamos enter:
http://download.eclipse.org/tools/gef/updates/releases/
  (seleccionar todos)
  
4_ Instalar Drools
  
  4.1_ Abrir Eclipse y seleccionamos en el menú:/Help/Install New Software
  
  4.2_ En el cuadro que nos aparece ponemos el siguiente link y presionamos enter:
http://download.jboss.org/drools/release/6.5.0.Final/org.drools.updatesite/
  Luego seleccionamos el ítem Drools and jBPM
  
5_ Luego seleccionamos siguiente-siguiente-aceptamos los cambios y queda instalado Drools.

6_ Agregar Runtime
A continuación añadiremos las dependencias necesarias para poder trabajar con Drools. Podemos
hacerlo de dos formas: con Maven o sin él.
En el directorio drools-distribution-6.5.0.Final debe estar la descompresión del zip de drools, que se
debe descargar de: 
https://download.jboss.org/drools/release/6.5.0.Final/drools-distribution-6.5.0.Final.zip

El directorio con nombre: “drools-distribution-6.5.0.Final” puede ponerse en la raíz de eclipse. En mi
caso he descomprimido el directorio en: /drools/eclipse-installer/
Si decidimos no usar Maven y tenemos el plugin instalado, necesitamos configurar nuestro droolsruntime.
Que no es más que el conjunto de librerías que necesitará Drools para funcionar. Para
ello: Preferencias > Drools > Installed Drools runtime
Pulsamos sobre el botón Add.
Luego seleccionamos el directorio: /drools/eclipse-installer/drools-distribution-6.5.0.Final, donde
están las librerías de Drools.
Posteriormente, seleccionamos el directorio con nombre:binaries (donde está el jar de Drools)
Seleccionamos OK→Apply y finalmente OK. Posteriormente reiniciamos Eclipse.

7_Instalar Spring boot tools

Entrar en Eclipse->Help-> Eclipse Marketplace->Poner en el buscador "spring"-> seleccionar "Spring boot Tools"-> Instalar

-----------------------------------------

Correr InferirCategoriaApp como Spring boot App

Una vez que se haya levantado el servidor, correr los siguientes ejemplos en el navegador:

Categoria E nivelIn 1 -- cat E http://127.0.0.1:8080/inferencia?porcentajeNoRequerido=0.65&porcentajeNivel5=0.6&porcentajeNivel4=0.0&porcentajeNivel3=0.0&porcentajeNivel2=0.0&porcentajeNivel1=0.0&nivelInformatizacion=1

Categoria B, nivelIn 1 ---> cat A http://127.0.0.1:8080/inferencia?porcentajeNoRequerido=0.8&porcentajeNivel5=0.8&porcentajeNivel4=0.8&porcentajeNivel3=0.8&porcentajeNivel2=0.8&porcentajeNivel1=0.8&nivelInformatizacion=1
