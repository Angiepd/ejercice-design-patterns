# Ejemplo del Patrón Builder – Configuración de Automóvil

## Descripción General

Este proyecto demuestra la implementación del **patrón de diseño Builder**

El ejemplo modela un objeto `Automobile` configurable, que contiene atributos obligatorios y opcionales. El objetivo es mostrar cómo el patrón Builder mejora la forma en que se construyen objetos cuando se presentan múltiples configuraciones posibles.

---

## Clasificación del Patrón

- **Nombre del patrón:** Builder  
- **Tipo de patrón:** Creacional  

---

## Planteamiento del Problema

El objeto `Automobile` contiene:

- Atributos obligatorios (por ejemplo: `model`, `engine`, `color`)
- Atributos opcionales (por ejemplo: `wheel`, `interior`, `audioSystem`, `sunroofType`, `gpsEnabled`)

Si se implementara utilizando constructores tradicionales, la clase presentaría:

- Problema de constructor telescópico (múltiples constructores sobrecargados)
- Reducción en la legibilidad
- Menor mantenibilidad
- Riesgo de estados intermedios inconsistentes

El patrón Builder aborda este problema separando el proceso de construcción del objeto de su representación final.

---

## Clasificación y Justificación del Patrón

### Tipo de patrón: Creacional

Este problema puede ser abordado con patrones **creacionales**, porque el objetivo principal es controlar y mejorar la forma en que se crean los objetos de tipo `Automobile`.

---

### Patrón seleccionado: Builder

Escogimos el patrón de diseño **Builder** porque el enunciado describe las características ideales para el uso de este patrón de diseño, debido a que:

- Se cuentan con muchos parámetros a definir en la clase que se modela.
- No todos los parámetros son obligatorios; por ende, si se maneja un único constructor, se tendría siempre que definir los valores nulos de los elementos que no se deseen.
- Si se manejan múltiples constructores, el tener tantos parámetros haría que tuviéramos tantos constructores como parámetros opcionales sigamos definiendo en la abstracción.
- No se identifican subclases o categorías de vehículos los cuales pudiéramos definir en subclases para favorecer el uso de otros patrones creacionales como **Factory Method**.
- No se definen “plantillas” de objetos preconfigurados los cuales pudiésemos utilizar para definir **prototipos**.
- Por lo anterior, el patrón Builder permite construir el objeto paso a paso, manteniendo claridad en la configuración y evitando complejidad innecesaria en los constructores.

---

## Enfoque de Implementación

La implementación aplica el patrón Builder de la siguiente manera:

- `Automobile` se modela como un `record` inmutable.
- Se define una clase `Builder` encargada de la construcción incremental.
- Los atributos obligatorios se definen al crear el builder.
- Los atributos opcionales se configuran mediante métodos encadenados (API fluida).
- El método `build()` construye el objeto final.

### Ejemplo de Uso

```java
Automobile car = Automobile.builder(
        "Corolla Cross 2026",
        new Engine(EngineType.HYBRID, 2.0, FuelType.GASOLINE),
        new Color("Pearl White")
    )
    .withWheel(new Wheel(new Rim(18), WheelType.SPORT))
    .withInterior(new Interior(InteriorMaterial.LEATHER, new Color("Black")))
    .withAudioSystem(new AudioSystem(AudioLevel.PREMIUM))
    .withSunroof(SunroofType.PANORAMIC)
    .withGPS(true)
    .build();