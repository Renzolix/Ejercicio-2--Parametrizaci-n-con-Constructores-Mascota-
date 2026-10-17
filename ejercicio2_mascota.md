# Ejercicio 2: Mascota

## Explicación Lógica
1. **Constructor Parametrizado:** Se definió un constructor explícito para garantizar que todo objeto `Mascota` obligatoriamente nazca con sus atributos inicializados (`nombre`, `especie`, `edad`).
2. **Uso de `this`:** Se utilizó la referencia `this` para diferenciar los atributos de la clase de los parámetros locales que reciben el mismo nombre.
3. **Instanciación e Impresión:** Se instanciaron tres objetos directamente desde la llamada al constructor y se usó `String.format()` para mostrar la información formateada en consola.