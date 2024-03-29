
package piasystemairline.Presentation.EdicionCiudad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Ciudad;
import piasystemairline.PIASystemAirline;

public class Controller {
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      vista.setControlador(this);
      vista.setModelEdit(modelo);
      vista.update(modelo, this);
    }

    public void Show() {
     Vista.setVisible(true);
    }

    void PaisesShow() {
     Vista.setVisible(false);
     PIASystemAirline.Controler_Pais.Show();
    }

    void Delate(String text) throws Exception {
        piasystemairline.Logic.Model.instance().EliminarCiudad(text);
        PIASystemAirline.Controler_Ruta.Update();
    }

    void Edit(Ciudad c) throws Exception {
        piasystemairline.Logic.Model.instance().ModificarCiudad(c);
        PIASystemAirline.Controler_Ruta.Update();
    }

    Ciudad Shared(String text) throws Exception {
        return piasystemairline.Logic.Model.instance().ConsultarCiudad(text);
    }

    void AppShow() {
     PIASystemAirline.ControllerAPP.bandera= true;
     PIASystemAirline.ControllerAPP.OnButtons();
    }
    
    public void ObtenerlistPaises(){
    modelo.setPaises(piasystemairline.Logic.Model.instance().ObtenerListPaises());
    }

    void Add(Ciudad c) throws Exception {
            piasystemairline.Logic.Model.instance().AgregarCuidad(c);
            PIASystemAirline.Controler_Ruta.Update();
    }

}
