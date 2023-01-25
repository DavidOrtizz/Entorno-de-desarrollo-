public class User {
  // Atributos que varían para cada objeto
  private long id;
  private String nombre;
  private String apellido1;
  private String apellido2;
  private String rol;

  // Hace referencia al objeto asignado
  public User(String nombre, String apellido1, String apellido2, String rol) {
    this.nombre = nombre; // El objeto nombre hace referencia a nombre
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.rol = rol;
  }

  // Se encarga de devolver el valor de una propiedad
  public String getnombre() { // Valor de nombre
    return this.nombre;
  }

  // Se encarga de darle un valor a una propiedad
  public void setnombre(String nombre) {
    this.nombre = nombre;
  }

  public String getapellido1() {
    return this.apellido1;
  }

  public void setapellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  public String getapellido2() { //
    return this.apellido2;
  }

  public void setapellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  public String getrol() {
    return this.rol;
  }

  public void setrol(String rol) {
    this.rol = rol;
  }
}
