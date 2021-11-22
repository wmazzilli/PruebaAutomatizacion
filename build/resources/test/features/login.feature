#language: es

Característica: Se realizara la automatizacion para la empresa Choucair.


  @login
  Escenario: Realizar el ingreso con usuario y contraseña existente.
    Dado Que el usuario este en la pagina de la prueba de Choucair
    Cuando El usuario ingrese su usuario y password para ingresar como cliente
    Entonces Se realizara la validacion que el cliente se encuentra logueado