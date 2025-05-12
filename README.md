# AlmanzaGreysAnimalsApp 🐾🌿

Aplicación Android desarrollada con **Jetpack Compose** y **Kotlin**, que permite explorar diferentes animales y sus ambientes naturales, consumiendo datos desde una API externa.

---

## Requisitos

- **Android Studio**: Ladybug Feature Drop | 2024.2.2  
- **Conexión a Internet**: requerida (la app consume datos desde una API externa)  
- **API externa**: la app no funciona sin conexión  

---

## ¿Cómo correr la aplicación?

1. **Clona el repositorio:**

   ```bash
   git clone https://github.com/Greys2004/AlmanzaGreysAnimalsApp.git
   ```

2. **Abre el proyecto en Android Studio:**

   - Abre Android Studio  
   - Ve a `File > Open...` y selecciona la carpeta del proyecto  

3. **Ejecuta la app en un emulador o dispositivo físico:**

   - Haz clic en el botón ▶ `Run 'app'`

---

## Estructura del proyecto

```
com.example.almanzagreysanimalsapp/
├── models/
│   ├── apiAnimales.kt
│   └── apiEnvironments.kt
│
├── screens/
│   ├── listaAnimales.kt
│   ├── detalleAnimal.kt
│   ├── listaAmbientes.kt
│   └── detalleAmbiente.kt
│
├── services/
│   ├── animalesService.kt
│   └── environmentsService.kt
│
├── utils/
│   └── customIcons.kt
│
└── MainActivity.kt
```

---

## Funcionalidades

### `listaAnimales.kt`
- Muestra todos los animales obtenidos desde la API.
- Cada animal tiene su imagen y nombre.
- Al hacer clic en uno, se navega a `detalleAnimal`.

### `detalleAnimal.kt`
- Muestra la información completa del animal:
  - Nombre
  - Imagen principal
  - Descripción
  - Galería de imágenes (carrusel)
  - Lista de hechos interesantes

### `listaAmbientes.kt`
- Muestra todos los ambientes desde la API.
- Cada ambiente tiene imagen y nombre.
- Al hacer clic, se navega a `detalleAmbiente`.

### `detalleAmbiente.kt`
- Muestra la información del ambiente:
  - Imagen
  - Descripción
  - Lista de animales que viven allí (imagen + nombre)
  - Permite ir al detalle de cada animal desde la lista

---

## Endpoints utilizados

### `apiAnimales.kt`

**Se Navega con `https://animals.juanfrausto.com/api/`**

```kotlin
interface animalesService {
    @GET("Animals")
    suspend fun getAnimales(): List<Animal>
}
```

### `apiEnvironments.kt`

```kotlin
interface environmentsService {
    @GET("Environments")
    suspend fun getEnvironments(): List<Environment>
}
```

---

## Probado en:

- Emulador Android (Pixel API 34)
- Dispositivo físico Android

---


  
