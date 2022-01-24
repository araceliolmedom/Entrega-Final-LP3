# tp-lp3-2020/21
Universidad Catolica. 2020/21.
Trabajo Práctico de Lenguaje de programación 3.
José Alarcón.
Adrian Ramirez.

# Descripcion: 
Implementación de un sistema de recomendación de streaming.

# Estructura:
 Se sigue la estructura presentada en el diagrama de clases, teniendo dos paquetes pricipales con respecto a las entidades:
 El paquete Contenido: Contiene todo lo refente a los Videos, Reviews, Promociones, etc.
 El paquete Users: Contiene las entidades de los Usuarios y sus roles.
 Luego en el paquete Repository se generan repositorios para cada las entidades de contenido y los usuarios.
 Se declaran las funcionalidades de cada entidad en el paquete Service y estas se implementan en el paquete ServiceImpl (donde se las enlazan al paquete Repository, para la persistencia de datos) para luego ser utilizadas por las funciones del RestController.
 El RestController es el paquete que se encarga de realizar los mapeos de nuestras funcionalidades Service con el servicio api-rest.
