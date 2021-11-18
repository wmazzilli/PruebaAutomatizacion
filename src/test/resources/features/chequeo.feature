#language: es

Característica: Se realizara un test de prueba para hacer un flujo corto en finsonet del modulo de finsonet hasta chequeo de documento.


  @ChequeoDocumento
  Escenario: Realizar carga de documentos en chequeo
    Dado Que el usuario este en finsonet modulo de originacion
    Cuando Ingrese al tap de chequeo de documento
    Entonces Cargaremos los documentos necesarios para su validacion