<h1 align="center"> Conversor de monedas usando ExchangeRate API</h1>
<img width="900" height="512" alt="png-clipart-currency-converter-money-trade-euro-euro-text-investment" src="https://github.com/user-attachments/assets/1147f05c-3917-4ef9-970d-e235797cd9ac" />


## Índice
* [Título e imagen de portada](#Título-e-imagen-de-portada)
* [Descripción](#descripción)
* [Herramientas y tegnologías utilizadas](#herramientas-y-tegnologías-utilizadas)
* [Función del proyecto](#función-del-proyecto)
* [Conociendo la API](#conociendo-la-api)

<h2>Descripción del proyecto :speaker:</h2>
Este proyecto consiste en una aplicación Java de consola que permite convertir montos entre distintas monedas utilizando tasas de cambio en tiempo real proporcionadas por ExchangeRate API.

## :wrench: Herramientas y tegnologías utilizadas para el desarrollo del programa
-  `Lenguaje de programación utilizado`: JAVA
-  `IDE`: IntelliJ IDEA Community Edition
-  `API de tasas de cambio`: ExchangeRate Api

## :hammer: Función del proyecto
- El usuario interactúa con un menú para seleccionar el tipo de conversión deseado (por ejemplo, de pesos argentinos a dólares, de dólares a euros, etc.).
- Luego ingresa un monto que desea convertir.
- El sistema realiza una solicitud HTTP a la API de ExchangeRate para obtener la tasa de cambio actual.
- Calcula el resultado y muestra en consola:
   - El monto ingresado.
   - El resultado convertido.
 
 ## :bridge_at_night: Estructura del proyecto
-  `Principal`: Clase principal que interactua con el usuario y llamadas a los métodos de conversión.
-  `ConsultaApi`: Clase con métodos que se conectan a la API, obtienen la tasa de cambio y calculan la conversión.
-  `ConversionApi`: Clase record que puede representar un monto o servir como envoltorio para los datos de entrada.
- `Conversor`: Clase que contiene el menú
- `Conversion`: Clase que representa los atributos a ingresar

  
## :pushpin: Conociendo ExchangeRate Api
ExchangeRate API es una interfaz de programación de aplicaciones (API) que permite consultar tasas de conversión entre monedas de forma rápida y sencilla, ideal para aplicaciones como conversores de monedas, sistemas de facturación multimoneda o análisis financiero.
- Características principales:
  - `Actualización en tiempo real`: Proporciona tasas de cambio actualizadas de forma frecuente.
  - `Fácil de usar`: Se accede mediante peticiones HTTP (GET) y devuelve los datos en formato JSON.
  - `Soporte para múltiples monedas`: Permite convertir entre una gran variedad de monedas internacionales (USD, EUR, ARS, etc.).
  - `Versiones gratuitas y de pago`: Tiene un plan gratuito con funcionalidades limitadas y planes pagos con mayor precisión y frecuencia de actualización.



 ## :bulb: ¿Qué se necesita para usarla?
- Una clave de API (API key), que se obtiene al registrarse gratuitamente en su sitio.
- Hacer solicitudes a través de HTTP Client desde tu programa (por ejemplo, usando HttpClient en Java).
- Leer y procesar la respuesta JSON para extraer el valor de la conversión.

## Ejemplo de ejecución

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/4d1c83e0-5597-4dff-9cf8-94c52dcad5ee" />
