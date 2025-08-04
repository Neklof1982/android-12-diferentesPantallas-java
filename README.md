# 🚀 **Práctica 12 - Opciones de Pantalla en Android**

## 📝 **Descripción**

Esta práctica se centra en la creación de una aplicación Android que permite al usuario elegir entre 4 pantallas diferentes. Cada vez que el usuario elige una pantalla, se incrementa un contador que refleja cuántas veces ha sido seleccionada esa pantalla.

El flujo de la aplicación es el siguiente: 
1. En la pantalla principal, el usuario ingresa un número entre 1 y 4 y presiona un botón.
2. Según el número ingresado, la aplicación redirige al usuario a una de las cuatro pantallas disponibles (Pantalla 1, Pantalla 2, Pantalla 3, Pantalla 4).
3. En cada pantalla, se muestra un contador que indica cuántas veces ha sido seleccionada esa pantalla.
4. El usuario puede volver a la pantalla principal desde cada una de las pantallas.

## ⚙️ **Tecnologías usadas**

- **Android SDK 34**  
- **Java (MainActivity, Pantalla01, Pantalla02, Pantalla03, Pantalla04)**  
- **Button** para la interacción del usuario  
- **Intent** para la navegación entre pantallas  
- **TextView** para mostrar los contadores  
- **Edge-to-Edge API** para un diseño inmersivo  
- **Bundle** para pasar datos entre actividades

## 📐 **Diseño UI**

La aplicación tiene un diseño simple basado en **ConstraintLayout** para mantener un diseño flexible y eficiente:

### `activity_main.xml`

Contiene:
- Un **EditText** donde el usuario ingresa el número de pantalla a elegir (1-4).
- Un **Button** que, al ser presionado, redirige al usuario a la pantalla correspondiente.

### `activity_pantalla01.xml`, `activity_pantalla02.xml`, `activity_pantalla03.xml`, `activity_pantalla04.xml`

Cada una de estas pantallas contiene:
- Un **TextView** que muestra cuántas veces se ha elegido la pantalla.
- Un **Button** para volver a la pantalla principal.

## 🚀 **Ejecución**

1. Abrir el proyecto en **Android Studio** con el SDK 34 configurado.
2. Ejecutar en un **dispositivo/emulador con Android 11 (API 30)** o superior.
3. En la pantalla principal, ingresar un número entre 1 y 4 y presionar el botón "Elegir".
   - Si se elige el número 1, se redirige a la **Pantalla 1**.
   - Si se elige el número 2, se redirige a la **Pantalla 2**.
   - Si se elige el número 3, se redirige a la **Pantalla 3**.
   - Si se elige el número 4, se redirige a la **Pantalla 4**.
4. En cada pantalla se muestra un contador que refleja cuántas veces ha sido seleccionada esa pantalla.
5. Se puedes regresar a la pantalla principal desde cada una de las pantallas al presionar el botón "Volver".

## 📌 **Versionado**

Este proyecto utiliza **Git** y **GitHub** para el control de versiones, lo que permite mantener un registro detallado de los cambios realizados durante el desarrollo.

## 📄 **Licencia**

Este proyecto está bajo la [MIT License](./LICENSE).

## 🎁 **Expresiones de Gratitud**

Podéis invitarme a una cerveza 🍺 o un café ☕.  
Gracias por la lectura 🤓.
