# Proyecto_Final

### Equipo 3
## Integrantes: 
  -> Nicolás López Cid - Nikolexion
  
  -> Sofía López Aguilera - lulunkaii

## **Instrucciones de ejecución**

La versión de Maven utilizada en el proyecto es Bundled (Maven 3) 3.9.2

Para poder ejecutar el programa, se debe copiar y pegar el repositorio GitHub en la carpeta que usted desee. Luego, el programa se puede ejecutar en la carpeta Proyecto_Final/src/Logica_Grafica/Main.java.
Se debería presentar una ventana como se ve a continuación:

![image](https://github.com/Nikolexion/Proyecto_Final/assets/146101101/17b9da78-93d1-4177-9c7e-8905367b66e2)



A partir de esta ventana, usted podrá crear nuevos pokemons mediante la listas desplegables de la izquierda, probar a clickear sobre diversos habitats para poner los pokemones en el habitat que desee. Si el pokemon no pertenece al hábitat soltarán alertas. Además, puede seleccionar cuatro de las posibles Comidas compatibles según las preferencias del Pokemon y depositarlas en cualquiera de los comederos. Si la comida no es la preferida de los pokemons en el hábitat delimitado, soltará una alerta. 


## **Enunciado**

El presente proyecto cumple con el enunciado entregado en clases de Simulador de Zoo, el cual es el siguiente:

"El simulador de zoo permite a los usuarios crear y gestionar su propio  zoológico virtual de manera interactiva. Los usuarios tienen la capacidad de construir diferentes hábitats para una variedad de animales.
Los usuarios pueden seleccionar entre diferentes especies  animales y colocarlas estratégicamente en sus respectivos hábitats. Cada animal tiene sus propias necesidades específicas, como alimentación, temperatura y compañeros de grupo posible.
Los usuarios pueden colocar hábitats y animales de forma manual (desde un menú), también pueden colocar comida. Los animales (polígonos o imágenes) se mueven aleatoriamente dentro de los hábitats (mediante un temporizador) y a veces consumen comida. El usuario puede colocar comida en los hábitats.
El software garantiza que los animales no puedan ser ubicados en hábitats inadecuados. Aparece una alerta cuando falta comida para uno de los hábitats."



## **Diagrama de clases UML**

Nuestro proyecto se ve representado por el siguiente diagrama UML:

![UML Proyecto Semestral](https://github.com/Nikolexion/Proyecto_Final/assets/146101101/0df9dd91-5418-4da4-bfc3-f2ba554e4657)


## **Diagrama de casos de uso**

Nuestro proyecto se ve simplificado por el siguiente diagrama de casos de uso:

![image](https://github.com/Nikolexion/Proyecto_Final/assets/146101101/4dc3b3b3-54e1-4e08-9e0d-9715393d9a88)


## **Lista y justificación de los patrones de diseño utilizados**

Para nuestro proyecto analizamos que había una gran cantidad de patrones útiles. Sin lugar a duda, los más usados dentro del proyecto fueron State, Observer y Singleton. State fue utilizado para emplear los estados de cada Pokemon (estado Normal, estado Hambriento, estado Comiendo y estado Muerto). De esta forma, podíamos hacer que los pokemones se acercaran a comer a los comederos y sacaran comida de los comederos de manera hilada a un Timer, y que este proceso se repitiera tantas veces como fuera necesario. Luego, observer fue implementado en las comidas de manera que las interfaces de las frutas se actualizaran junto a sus peticiones (por ejemplo, se uso en comedero para que cuando se añade la comida le anuncie a vistaComida que se agregó una comida para que se ejecute de nuevo y dibuje otra vez). Finalmente, Singleton fue utilizado para crear una instancia de PanelMenuVertical con el fin de poder pasarle su instancia a PanelHabitat para hilar la lógica entre ellas. 
Hubieron mas patrones en los que nos vimos interesados en implementar (y algunos que implementamos por completo pero luego lo eliminamos) como Factory para crear hábitats, el cual luego de analizar su utilidad decidimos de que no era necesario implementarlo en el contexto de nuestro programa.

## **Decisiones y reflexiones del proyecto**
Es importante notar que las animaciones del proyecto se ven afectadas por el swing. Tuvimos muchos problemas tratando de debuggear eso y no lo conseguimos. Cada vez que se ejecuta un click se hace el "efecto de animacion" pero los pokemones en efecto cambian de estado y se mueven como corresponde.
En cuanto a decisiones en el proyecto, para nosotros la mas trascendental fue el usar el formato que decidimos desde un principio. Fue dificil apegarse a ese formato y pensamos múltiples veces en cambiar a un mapa con arrastre o algún símil. **La mayor dificultad impuesta para nosotros como grupo fue el tiempo**. Tuvimos una carga académica enorme las últimas dos semanas, al punto de que no era posible bajo ninguna circunstancia avanzar en el proyecto. Por eso se ve un cese notorio en el progreso de la semana del 3 de diciembre ya que tuvimos ambos integrantes cuatro proyectos semestrales y tres certamenes para la misma semana. Nos pesa mucho el hecho de que planteamos el proyecto como algo más grande y dinámico, dado nuestro interés en mejorar el uso que tiene ahora pensamos siempre en construir bases para las posibles features que se le pueden agregar, como una tienda, un menu de pokemones más bonito a la vista, inclusive guardamos sprites en pixelart para implementarlos en un futuro.

Como equipo consideramos que logramos cumplir con las metas de enunciado y requisitos pero no estamos del todo satisfechos dado que no pudimos cumplir con nuestros deseos personales para este proyecto. En cuanto al trabajo en equipo nunca hubo problemas y mantenemos buena comunicación. 
