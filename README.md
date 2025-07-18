# 🚀 ACTIVIDAD III - Búsqueda en Colecciones y Uso de Enums en Java

Este proyecto presenta un ejercicio práctico desarrollado en Java, enfocado en fortalecer los conceptos de **búsqueda dentro de colecciones** y el uso **avanzado de Enums**. Se propone un sistema de gestión de pedidos en un restaurante, modelando una situación real mediante clases, enumeraciones y estructuras de datos dinámicas.

---

## 📚 Tabla de Contenidos

1. Gestión de Pedidos en un Restaurante
2. Enums en Java: Estados de Pedido
3. Búsqueda por Estado en una Colección
4. Enums con Métodos
5. Resolución del Cuestionario sobre Enums

---

## ✅ Temas Abordados

### 1. 🍽️ Gestión de Pedidos en un Restaurante

**Objetivo:** Implementar un sistema que administre pedidos realizados por distintos clientes, permitiendo almacenar, modificar y buscar pedidos según su estado.

**Conceptos aplicados:**

- Manejo de colecciones con `ArrayList`.
- Diseño de clases que representan objetos del mundo real.
- Encapsulamiento de datos y acceso mediante getters/setters.
- Uso de `toString()` para representar objetos.

---

### 2. 🧾 Enums en Java: Estados de Pedido

**Objetivo:** Modelar los distintos estados posibles de un pedido mediante un Enum `EstadoPedido`.

**Valores del Enum:**

- `PENDIENTE`
- `EN_PREPARACION`
- `ENTREGADO`
- `CANCELADO`

**Ventajas:**

- Uso de constantes tipadas.
- Mayor legibilidad y mantenimiento del código.
- Evita errores de comparación de Strings.

---

### 3. 🔍 Búsqueda por Estado en una Colección

**Objetivo:** Implementar funcionalidades que permitan filtrar pedidos según su estado utilizando búsquedas sobre una colección.

**Métodos desarrollados:**

- Búsqueda secuencial con `for-each`.
- Comparación mediante `==` entre Enums.
- Retorno de una nueva lista filtrada.

---

### 4. ⚙️ Enums con Métodos

Aunque este ejemplo no incluye atributos adicionales en el Enum, se demuestra cómo los Enums pueden integrarse con lógica personalizada (por ejemplo, en el `SistemaPedidos.buscarPorEstado()`).

---

## 📋 Resolución del Cuestionario de Enums

# 🧮 Pregunta 1
¿Cuál de las siguientes opciones es incorrecta sobre los enum en Java?

Respuesta correcta: a. Pueden instanciarse con new NivelEstudio().

# 🧮 Pregunta 2
¿Cuál es la ventaja principal de usar enum en Java?

Respuesta correcta: c. Permiten definir valores constantes y evitar ambigüedades.

# 🧮 Pregunta 3
¿Cómo se representa un enum en UML?

Respuesta correcta: b. Usando el estereotipo <<enumeration>>.

# 🧮 Pregunta 4
¿Qué hace el método ordinal() en un enum?

Respuesta correcta: a. Retorna la posición del valor dentro del enum.

# 🧮 Pregunta 5
¿Qué sucede si ejecutamos NivelEstudio.valueOf("primario")? 

Respuesta correcta: b. Lanza una excepción porque los enum son sensibles a mayúsculas.

---

## 📘 Conclusión

Este ejercicio permitió integrar conceptos clave de Java orientado a objetos:

- Aplicación de `ArrayList` para almacenar múltiples objetos.
- Uso correcto de Enums como categoría de datos seguros.
- Implementación de filtros y búsquedas con lógica simple.
- Diseño modular y extensible de clases.
- Aplicación práctica de `toString`, `getters` y `setters`.

---

## ⚡ Requisitos

- ✅ JDK 17 o superior  

---

## ▶️ Ejecución del Proyecto

1. Clonar el repositorio:
```bash
git clone https://github.com/PabloLimaDelgado/ejercicios-java-colecciones
