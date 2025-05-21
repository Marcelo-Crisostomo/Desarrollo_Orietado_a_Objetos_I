![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Final Transversal – Programación Orientada a Objetos I (PRY2202)

## 👤 Autor del proyecto
- **Nombre completo:** [Escribe aquí tu nombre]
- **Sección:** [Escribe aquí tu sección]
- **Carrera:** Ingeniería en Informática
- **Sede:** [Escribe aquí tu sede, por ejemplo: Puerto Montt]

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación Final Transversal de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un sistema orientado a objetos desarrollado en Java, cuyo objetivo es modelar y gestionar entidades representativas de un dominio real, aplicando los principios de encapsulamiento, composición, herencia, polimorfismo e interfaces.

El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/         # Clase principal con el método main
├── model/       # Clases de dominio (Persona, Cliente, Empleado, Producto, etc.)
├── data/        # Clases para la carga y lectura de archivos .txt
├── utils/       # Utilidades y validaciones
└── interfaces/  # Interfaces implementadas por las clases
````

---

## 🧩 Clases principales y sus responsabilidades

| Clase           | Descripción                                                               |
| --------------- | ------------------------------------------------------------------------- |
| `Persona`       | Clase base con atributos comunes (nombre, RUT, dirección).                |
| `Cliente`       | Hereda de `Persona`. Representa a un cliente con métodos específicos.     |
| `Empleado`      | Subclase de `Persona`, puede incluir cargo, sueldo, etc.                  |
| `Direccion`     | Clase compuesta utilizada en `Persona`.                                   |
| `Producto`      | Representa un producto con nombre, stock y precio.                        |
| `OrdenDeCompra` | Permite simular una compra con lista de productos y totales.              |
| `Registrable`   | Interfaz con métodos comunes como `registrar()` y `mostrarInformacion()`. |

---

## 📂 Archivos de prueba utilizados (`.txt`)

* `clientes.txt` – Lista de clientes con sus datos personales.
* `empleados.txt` – Información del personal.
* `productos.txt` – Catálogo de productos.
* `ordenes.txt` – Datos de pedidos o compras.

*Todos estos archivos deben estar ubicados en la carpeta raíz o en `data/`, según tu implementación.*

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/usuario/repositorio-evaluacion-final.git
```

2. Abre el proyecto en IntelliJ IDEA o NetBeans.

3. Verifica que los archivos `.txt` estén correctamente ubicados.

4. Ejecuta el archivo `Main.java` desde el paquete `app`.

5. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).

---

## 🎥 Video de presentación

* **Nombre del archivo:** `video_presentacion.mp4`
* **Duración:** Máximo 5 minutos
* **Contenido del video:**

  * Estructura general del proyecto
  * Funcionalidades desarrolladas
  * Relación entre clases
  * Evidencia de ejecución del sistema
  * Comentarios relevantes sobre el código fuente

> El video debe estar incluido en la carpeta `.zip` de la entrega final. También puedes subirlo a YouTube (modo oculto) y agregar aquí el enlace:
> 📎 \[Pega aquí el enlace al video (opcional)]

---


## 📌 Observaciones finales

* El código está debidamente documentado con comentarios explicativos.
* Se aplicaron principios de programación orientada a objetos en todas las clases.
* La organización modular y el uso de paquetes facilitan la mantenibilidad del sistema.

---

**Repositorio GitHub:** \[Pega aquí el enlace al repositorio]
**Fecha de entrega:** \[DD/MM/2025]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Final PRY2202




