/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_proyecto_entornos;

/**
 *
 * @author Saul
 */
public class vehiculo {
   private String matricula;
   private String tipo_enchufe;

    public vehiculo(String matricula, String tipo_enchufe) {
        this.matricula = matricula;
        this.tipo_enchufe = tipo_enchufe;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo_enchufe() {
        return tipo_enchufe;
    }

    public void setTipo_enchufe(String tipo_enchufe) {
        this.tipo_enchufe = tipo_enchufe;
    }
   
   
}
