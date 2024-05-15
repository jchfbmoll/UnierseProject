# **UNIVERSE PROJECT**

Proyecto propio en el cual se simula la creación de un universo y sus distintos elementos.
Inicialmente existe una clase __*Universe*__ que será una lista del objeto __*Galaxy*__, que contendrá los distintos atributos y métodos para su correcto funcionamiento.
La clase __*Galaxy*__, cuyo comportamiento es muy parecido a la clase __*Universe*__, ya que será una lista de __*AstralObject*__, y sus respectivos métodos y atributos.
La clase __*AstralObject*__ es una clase Abstracta que se podrá definir en 3 tipos de clase hija distinta, la clase __*BlackHole*__, la clase __*Nebulose*__ y la clase __*SolarSystem*__.
La clase __*BlackHole*__ tendrá la particularidad que podrá ir devorando otros __*AstralObject*__.
La clase __*Nebulose*__ contendrá grandes cantidades de distintos elementos.
La clase __*SolarSystem*__ será una lista de __*SolarObject*__, con sus respectivos métodos y atributos para su correcto comportamiento.
La clase __*SolarObject*__ será otra clase abstracta que se podrá definir como __*Planet*__, como __*Meteor*__ o como __*Asteroid*__.
La clase __*Planet*__ será una clase que tendrá sus distintos atributos y como particularidad contendrá una lista de __*Satellit*__.
La clase __*MovingObject*__ será una interfaz.
Las clases __*Meteor*__ y __*Asteroid*__ serán clases que tendrán herencia múltiple, ya que tendrá herencia tanto de la clase Abstracta __*SolarObjet*__ y serán implementaciones de la interfaz __*MovingObject*__.
