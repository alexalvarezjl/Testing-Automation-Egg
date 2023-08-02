# Introducción

🎯Durante esta etapa, exploraremos los fundamentos de la programación backend utilizando el lenguaje Java. Para ello, encontraremos una combinación de teoría y práctica para adquirir los conocimientos necesarios y fortalecer tus habilidades en el desarrollo de aplicaciones backend:

- **Parte teórica:** Nos adentraremos en los conceptos fundamentales que sustentan la programación backend. Veremos temas como la arquitectura cliente-servidor, el manejo de datos, creación de programas y mucho más. A través de explicaciones claras y ejemplos, construiremos una sólida base de conocimiento que sentará los cimientos para tus futuros proyectos. 👉

- **Parte práctica:** Aquí es donde pondremos en práctica todo lo leído en la parte teórica a través de emocionantes ejercicios y desafíos para consolidar las habilidades. Desde la implementación de funcionalidades clave hasta la resolución de problemas complejos, nos sumergiremos en el mundo real de la programación backend. 📌

## Programas y tipos de datos

### Programas en Java
Java es un lenguaje de programación orientado a objetos que se utiliza ampliamente en el desarrollo de aplicaciones y sistemas. A continuación, se presenta un ejemplo básico de un programa en Java que muestra "¡Hola, mundo!" en la consola:

```java

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}
```

### Tipos de Datos en Java
Java es un lenguaje de programación fuertemente tipado, lo que significa que todas las variables deben tener un tipo de dato definido antes de su uso. Aquí se presentan algunos de los tipos de datos básicos en Java:

#### Tipos de Datos Primitivos
1. byte: Representa un número entero de 8 bits con signo.
2. short: Representa un número entero de 16 bits con signo.
3. int: Representa un número entero de 32 bits con signo.
4. long: Representa un número entero de 64 bits con signo.
5. float: Representa un número de punto flotante de 32 bits.
6. double: Representa un número de punto flotante de 64 bits (doble precisión).
7. char: Representa un solo carácter Unicode de 16 bits.
8. boolean: Representa un valor booleano, que puede ser true o false.

#### Tipos de Datos de Referencia
Java también tiene tipos de datos de referencia, que son objetos creados a partir de clases definidas por el usuario o clases predefinidas en la API de Java. Ejemplos de tipos de datos de referencia son String, ArrayList, Scanner, entre otros.

```java

public class EjemploTiposDeDatos {
    public static void main(String[] args) {
        int edad = 30;
        double altura = 1.75;
        char genero = 'M';
        boolean esEstudiante = true;
        String nombre = "Juan";

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Género: " + genero);
        System.out.println("¿Es estudiante?: " + esEstudiante);
    }
}
```

En este ejemplo, se definen variables con diferentes tipos de datos y se imprime su contenido en la consola. Los tipos de datos y la forma en que se utilizan son fundamentales en Java para realizar cálculos y manipulaciones de datos en los programas.